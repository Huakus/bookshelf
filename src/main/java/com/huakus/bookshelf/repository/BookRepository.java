package com.huakus.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.huakus.bookshelf.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
