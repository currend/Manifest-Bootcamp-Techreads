package com.manifestcorp.Techreads.restcontroller;
import com.manifestcorp.Techreads.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.manifestcorp.Techreads.repository.BookRepository;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EndpointController {


    @Autowired
    final private BookRepository repository;

    public EndpointController(BookRepository repository) {
        this.repository = repository;
    }

    //Techreads:

    //1. Rest endpoint to retrieve all books

    @GetMapping("/")
        public Collection<Book> retrieveAlBooks() {
            return repository.findAll();
        }


    //2. Rest endpoint to delete a book by its id
    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        repository.deleteById(id);
    }

    //3. rest endpoint to create a new book entry

    @PostMapping("/add/book")
    public void addBook(@RequestBody Book book) {
        repository.save(book);
    }

    //4. Read a book entry
    @GetMapping("/getbook/{id}")
    public Optional<Book> getBookToRead(@PathVariable Long id) {
        return repository.findById(id);
    }

//    //5. Update a book entry
//    @PutMapping("/update/{id}")
//    public void updateBook(@PathVariable Long id) {
//        Book repository.findById(id);
//    }


}












