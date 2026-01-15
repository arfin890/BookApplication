package com.example.BookApplication.Service;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    @Autowired
    BookRepository bRepository;

    public Book addBook(Book b)
    {
            return bRepository.save(b);
    }

    public Book getBook(Integer id) {
          return bRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

    public List<Book> getAll() {

        return bRepository.findAll();
    }
}
