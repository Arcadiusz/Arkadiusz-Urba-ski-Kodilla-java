package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Moon", "John Newman", LocalDate.of(1999, 12, 12));
        Book book2 = new Book("Moonrise", "Kate Newman", LocalDate.of(2000, 10, 11));
        Book book3 = new Book("Moon is Big", "Mark Newman", LocalDate.of(2008, 8, 24));
        Book book4 = new Book("Moon or Dawn", "Henrik Newman", LocalDate.of(2010, 4, 10));
        Book book5 = new Book("Moon and Sun", "Jessica Newman", LocalDate.of(2001, 3, 3));

        Library library = new Library("My Library");

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone of object board
        Library clonedDeepLibrary = null;
        try {
            clonedDeepLibrary = library.deepCopy();
            clonedDeepLibrary.setName("My deeply cloned Library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println();
        System.out.println(clonedLibrary);
        System.out.println();
        System.out.println(clonedDeepLibrary);


        //When
        Set<Book> books;
        Set<Book> clonedBooks;
        Set<Book> deepCloneBooks;

        books = library.getBooks();
        clonedBooks = clonedLibrary.getBooks();
        deepCloneBooks = clonedDeepLibrary.getBooks();

        books.remove(book1);

        //Then
        Assert.assertEquals(4, books.size());
        Assert.assertEquals(4, clonedBooks.size());
        Assert.assertEquals(5, deepCloneBooks.size());
    }
}
