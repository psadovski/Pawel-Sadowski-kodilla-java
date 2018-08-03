package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //When
        Library library = new Library("Book library 1");
        IntStream.iterate(1,n -> n+1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("\"First step in Java\" part: " + n, "Tom", LocalDate.of(2008 + n, 06,7))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Book library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Book library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
