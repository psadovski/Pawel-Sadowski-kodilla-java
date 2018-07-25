package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    public List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        IntStream.iterate(1, n -> n+1)
                .limit(booksQuantity)
                .forEach(n -> resultList.add(new Book("Title " + n, "Author " + n, 1970 + n)));

        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();

        resultListOfBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        resultListOfBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        resultListOfBooks.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        resultListOfBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("Am");

        //Then
        assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWhenUserHaveNoBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Tom", "Smith", "88120912");

        List<Book> resultListOfNoBooks = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfNoBooks);

        //When
        List<Book> listOfNoBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        int actualOfNoBooks = listOfNoBooks.size();

        //Then
        Assert.assertEquals(0, actualOfNoBooks);
    }

    @Test
    public void testListBooksInHandsOfWhenUserHaveOneBook() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Tom", "Smith", "88120912");

        List<Book> resultListOfOneBooks = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfOneBooks);

        //When
        List<Book> listOfOneBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        int actualOfOneBooks = listOfOneBooks.size();

        //Then
        Assert.assertEquals(1, actualOfOneBooks);
    }

    @Test
    public void testListBooksInHandsOfWhenUserHaveFiveBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Tom", "Smith", "88120912");

        List<Book> resultListOfFiveBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfFiveBooks);

        //When
        List<Book> listOfFiveBooks = bookLibrary.listBooksInHandsOf(libraryUser);
        int actualOfFiveBooks = listOfFiveBooks.size();

        //Then
        Assert.assertEquals(5, actualOfFiveBooks);
    }
}