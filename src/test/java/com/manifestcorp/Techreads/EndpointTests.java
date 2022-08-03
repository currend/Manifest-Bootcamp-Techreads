package com.manifestcorp.Techreads;

import com.manifestcorp.Techreads.model.Book;
import com.manifestcorp.Techreads.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EndpointTests {

    private BookRepository repository;

    @Autowired
    private MockMvc mvc;

    @Test
    public void retrieveBooksFromDatabaseSuccessTest() throws Exception {
        Book bookOne = new Book();
        List<Book> books = new ArrayList<>(Arrays.asList(bookOne));

        Mockito.when(repository.findAll()).thenReturn(books);
        mvc.perform(MockMvcRequestBuilders
                        .get("/patient")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }


}
