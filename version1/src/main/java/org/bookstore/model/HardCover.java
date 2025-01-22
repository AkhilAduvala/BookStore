package org.bookstore.model;

public final class HardCover extends Book{
    private int weight;

    public HardCover(String bookName, Author author, int price, int weight){
        super(bookName, author, price);
        this.weight = weight;
    }

    @Override
    public String getFormat() {
        return "HardCover";
    }
}
