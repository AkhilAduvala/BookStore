package org.bookstore.service;

import org.bookstore.model.Book;
import org.bookstore.model.Ebook;
import org.bookstore.model.HardCover;
import org.bookstore.model.SoftCover;
import org.bookstore.repo.BookRepo;

public class BookService {

    BookRepo bookRepo = new BookRepo();

    public void addBook(Book book){

        if(book instanceof HardCover hBook){
            bookRepo.addHBook(hBook);
        } else if (book instanceof SoftCover sBook) {
            bookRepo.addSBook(sBook);
        }else if(book instanceof Ebook ebook){
            bookRepo.addEBook(ebook);
        }else{
            bookRepo.addBook(book);
        }
    }

    public void deleteBook(Book book){
        bookRepo.deleteBook(book.getBookName());
    }

    public Book availableBook(String bookName){
        return bookRepo.availableBook(bookName);
    }

    public void updateBook(Book book){
        bookRepo.updateBook(book);
    }

    public String knowFormat(String bookName){
        return bookRepo.knowFormat(bookName);
    }
}
