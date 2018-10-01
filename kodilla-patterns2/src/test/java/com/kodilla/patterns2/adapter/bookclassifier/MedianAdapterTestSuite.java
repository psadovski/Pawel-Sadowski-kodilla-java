package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2008, "Signature 1"));
        bookSet.add(new Book("Author 2", "Title 2", 2002, "Signature 2"));
        bookSet.add(new Book("Author 3", "Title 3", 2004, "Signature 3"));
        bookSet.add(new Book("Author 4", "Title 4", 2010, "Signature 4"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println("Median equals: " + median);
        assertEquals(2008, median);
    }
}
