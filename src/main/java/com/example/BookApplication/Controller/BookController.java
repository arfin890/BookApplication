package com.example.BookApplication.Controller;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bService;
    @Autowired
    public BookController(BookService b)
    {
        this.bService=b;
    }
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book b)
    {

        return ResponseEntity.ok(bService.addBook(b));
    }
    @GetMapping("/getBook/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id) throws Throwable
    {

        return ResponseEntity.ok(bService.getBook(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Book>> getAll()
    {
        return ResponseEntity.ok(bService.getAll());
    }

}
