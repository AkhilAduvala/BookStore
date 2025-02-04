package org.bookstore.service;

import org.bookstore.model.Book;
import org.bookstore.model.Ebook;
import org.bookstore.model.HardCover;
import org.bookstore.model.SoftCover;
import org.bookstore.repo.BookRepo;

public class BookService {

    BookRepo repo = new BookRepo();

    public void addBook(Book book){

        if(book instanceof HardCover hBook){
            repo.addHBook(hBook);
        } else if (book instanceof SoftCover sBook) {
            repo.addSBook(sBook);
        }else if(book instanceof Ebook ebook){
            repo.addEBook(ebook);
        }else{
            repo.addBook(book);
        }
    }

    public void deleteBook(Book book){
        repo.deleteBook(book.getBookName());
    }

    public Book availableBook(String bookName){
        return repo.availableBook(bookName);
    }

    public void updateBook(Book book){
        repo.updateBook(book);
    }
}
