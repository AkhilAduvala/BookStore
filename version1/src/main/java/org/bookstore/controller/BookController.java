package org.bookstore.controller;

import org.bookstore.model.Book;
import org.bookstore.service.BookService;


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
        bookService.updateBook(book);
    }

}
