package org.bookstore.model;

public final class SoftCover extends Book{
    private int weight;

    public SoftCover(String bookName, Author author, int price, int weight){
        super(bookName, author, price);
        this.weight = weight;
    }

    @Override
    public String getFormat(){
        return "SoftCover";
    }
}
