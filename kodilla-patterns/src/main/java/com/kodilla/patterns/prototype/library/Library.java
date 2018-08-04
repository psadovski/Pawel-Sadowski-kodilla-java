package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype <Library> {
    private  String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for(Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library library = (Library) super.clone();
        library.books = new HashSet<>();
        for (Book theBook : books) {
            Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate());
            library.getBooks().add(clonedBook);
        }

        return library;
    }
}