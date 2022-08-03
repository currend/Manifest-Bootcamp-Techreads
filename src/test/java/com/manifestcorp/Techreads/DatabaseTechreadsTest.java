package com.manifestcorp.Techreads;
import com.manifestcorp.Techreads.controller.BookController;
import com.manifestcorp.Techreads.model.Book;
import com.manifestcorp.Techreads.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


public class DatabaseTechreadsTest {

    private Bootstrap bootstrap;
    private BookRepository mockBookRepository;

    @BeforeEach
    void before() {
        bootstrap = new Bootstrap();
        mockBookRepository = mock(BookRepository.class);
        bootstrap.bookRepository = mockBookRepository;
    }

    @Test
    void testEmptyDatabase() {
        when(mockBookRepository.count()).thenReturn(0L);
        bootstrap.onApplicationEvent(null);
        verify(mockBookRepository, times(3)).save(any());
    }



    }




