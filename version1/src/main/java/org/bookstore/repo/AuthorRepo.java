package org.bookstore.repo;

import org.bookstore.model.Author;

public class AuthorRepo {
    public void addAuthor(Author author) {
        System.out.println("Added author : " + author.authorName());
        System.out.println("AuthorId : " + author.authorId());
    }

    public void updateAuthor(Author author) {
        System.out.println("Author name update to : " + author.authorName() +
                " for the author with Id : " + author.authorId());
    }

    public Author knowAuthor(String authorName) {
        System.out.println("Author name: APJ Abdul Kalam , Author Id: 1");
        return new Author("APJ Abdul Kalam", 1);
    }

    public void removeAuthorById(int authorId) {
        System.out.println("Removed author with Id: " + authorId);
    }

    public void removeAuthorByName(String authorName) {
        System.out.println("Removed author with name : " + authorName);
    }
}
