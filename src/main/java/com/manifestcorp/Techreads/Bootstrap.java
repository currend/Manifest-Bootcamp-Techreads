package com.manifestcorp.Techreads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.manifestcorp.Techreads.model.Book;
import com.manifestcorp.Techreads.repository.BookRepository;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    protected BookRepository bookRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (bookRepository.count() < 3) {
            bookRepository.save(new Book("Beginning Groovy and Grails", "Chris Judd et al.", 5, "https://images-na.ssl-images-amazon.com/images/I/51mi58r9nuL.jpg"));
            bookRepository.save(new Book("Pro Eclipse JST", "Chris Judd", 5, "https://images-na.ssl-images-amazon.com/images/I/41-LWysZdeL._SX218_BO1,204,203,200_QL40_FMwebp_.jpg"));
            bookRepository.save(new Book("Enterprise Java Development on a Budget", "Chris Judd", 5, "https://images-na.ssl-images-amazon.com/images/I/51H3bPvfkEL._SX404_BO1,204,203,200_.jpg"));
        }
    }
}



