package org.bookstore.repo;

import org.bookstore.model.Author;
import org.bookstore.model.Book;
import org.bookstore.model.HardCover;

public class BookRepo {
    public void addBook(Book book){
        System.out.println(book + " Book added!");
    }

    public void addHBook(Book book){
        System.out.println(book + " Hard cover Book added!");
    }

    public void addSBook(Book book){
        System.out.println(book + " Soft cover Book added!");
    }

    public void addEBook(Book book){
        System.out.println(book + " eBook added!");
    }

    public void deleteBook(String bookName){
        System.out.println(bookName + " has been deleted");
    }

    public Book availableBook(String bookName){
        System.out.println(bookName + " is available");
        Author author = new Author("APJ Abdul Kalam", 1);
        return new HardCover("Wings of fire",author,499,1);
    }

    public void updateBook(Book book){
        System.out.println(book + " details has been updated");
    }

    public String knowFormat(String bookName){
        return;
    }
}
