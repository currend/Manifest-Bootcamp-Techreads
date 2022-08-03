package com.manifestcorp.Techreads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manifestcorp.Techreads.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
