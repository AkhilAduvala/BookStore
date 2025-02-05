package org.bookstore.service;


import org.bookstore.model.Author;
import org.bookstore.repo.AuthorRepo;

public class AuthorService {

    AuthorRepo authorRepo = new AuthorRepo();

    public void addAuthor(Author author){
        authorRepo.addAuthor(author);
    }

    public void updateAuthor(Author author){
        authorRepo.updateAuthor(author);
    }

    public Author knowAuthor(String authorName){
        return authorRepo.knowAuthor(authorName);
    }

    public void removeAuthor(Author author){
        if(author.authorName().isBlank() || author.authorName().isEmpty()){
            authorRepo.removeAuthorById(author.authorId());
        }else{
            authorRepo.removeAuthorByName(author.authorName());
        }
    }
}
