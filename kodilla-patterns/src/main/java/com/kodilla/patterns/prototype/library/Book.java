package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate publicationDate;

    public Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public LocalDate getPublicationDate() {
        return this.publicationDate;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title = " + title +
                ", author = " + author +
                ", publicationDate = " + publicationDate;
    }
}