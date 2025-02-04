package org.bookstore.model;


public sealed abstract class Book permits Ebook, SoftCover, HardCover{
    private final String bookName;
    private final Author author;
    private final int price;

    Book(String bookName, Author author, int price){
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public abstract String getFormat();

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
