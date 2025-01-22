package org.bookstore.model;

public non-sealed class Ebook extends Book{
    private final int fileSize;

    public Ebook(String bookName, Author author, int price, int fileSize){
        super(bookName, author, price);
        this.fileSize = fileSize;
    }

    @Override
    public String getFormat(){
        return "Ebook";
    }

}
