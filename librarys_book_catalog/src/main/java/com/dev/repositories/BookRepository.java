package com.dev.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
    List<Book> findByAvailable(boolean available);
}
