package com.manifestcorp.Techreads.controller;
import java.util.List;
import java.util.Optional;

import org.h2.engine.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.manifestcorp.Techreads.model.Book;
import com.manifestcorp.Techreads.repository.BookRepository;
import org.springframework.web.servlet.view.RedirectView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping({"","/"})
    public ModelAndView books() {
        ModelAndView mav = new ModelAndView("books");
        List<Book> books = bookRepository.findAll();
        mav.addObject("books", books);
        return mav;
    }

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("bookForm", new Book());
        return"add";
    }
    @RequestMapping(value = {"", "/"}, method=POST)
    public RedirectView addBook(Book book) {

        bookRepository.saveAndFlush(book);
        return new RedirectView("books");
    }

    @GetMapping ("/detail/{id}")
    public ModelAndView detail(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView("detail");
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            Book bookDetails = book.get();
            mav.addObject("details", bookDetails);
        }
        else {
            throw new RuntimeException("Book not found for id : " + id);
        }

        return mav;
    }

    @RequestMapping ("/edit/{id}")
    public String edit(Model model, @PathVariable Long id) {
        ModelAndView mav = new ModelAndView("edit");
        model.addAttribute("edits", this.bookRepository.findById(id).get());
        return "edit";
    }



    @GetMapping("/delete/{id}")
    public ModelAndView deleteBook(@PathVariable Long id) {
        this.bookRepository.deleteById(id);
        return new ModelAndView("redirect:/books");
    }

    @PostMapping ("/update/{id}")
    public ModelAndView modifyBook(Book book) {
        bookRepository.saveAndFlush(book);
        return new ModelAndView("redirect:/books");
    }




}