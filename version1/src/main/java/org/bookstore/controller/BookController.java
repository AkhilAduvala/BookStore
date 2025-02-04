package org.bookstore.controller;

import org.bookstore.model.Book;
import org.bookstore.model.HardCover;
import org.bookstore.service.BookService;

import java.util.List;

public class BookController {

    BookService bookService = new BookService();


    public void addBook(Book book){
        bookService.addBook(book);
    }

    public void deleteBook(Book book){
        bookService.deleteBook(book);
    }

    public Book availableBook(String bookName){
        return bookService.availableBook(bookName);
    }

    public void updateBook(Book book){
        bookService.update(book);
    }

}
