package org.bookstore.controller;

import org.bookstore.model.Author;
import org.bookstore.service.AuthorService;

public class AuthorController {

    AuthorService authorService = new AuthorService();

    public void addAuthor(Author author){
        authorService.addAuthor(author);
    }

    public void updateAuthor(Author author){
        authorService.updateAuthor(author);
    }

    public Author knowAuthor(String authorName){
        return authorService.knowAuthor(authorName);
    }

    public void deleteAuthor(Author author){
        authorService.removeAuthor(author);
    }
}
