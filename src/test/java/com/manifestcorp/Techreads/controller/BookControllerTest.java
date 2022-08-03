package com.manifestcorp.Techreads.controller;

import com.manifestcorp.Techreads.model.Book;
import com.manifestcorp.Techreads.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BookControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    BookController controller;
    BookRepository mockBookRepository;

    @BeforeEach
    void before() {
        mockBookRepository = mock(BookRepository.class);
        controller.bookRepository = mockBookRepository;
    }

    @Test
    void addBookTest() {
        Book newBook = new Book("Example Book", "David Curren", 5, "https://images-na.ssl-images-amazon.com/images/I/51H3bPvfkEL._SX404_BO1,204,203,200_.jpg");
        when(mockBookRepository.saveAndFlush(newBook)).thenReturn(newBook);
        controller.addBook(newBook);
        verify(mockBookRepository).saveAndFlush(newBook);


    }

    @Test
    void deleteBookTest() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders
                        .get("/books/delete/{id}", 1)
                        .accept(MediaType.APPLICATION_JSON))
                        .andExpect(status().is3xxRedirection());

    }




}
