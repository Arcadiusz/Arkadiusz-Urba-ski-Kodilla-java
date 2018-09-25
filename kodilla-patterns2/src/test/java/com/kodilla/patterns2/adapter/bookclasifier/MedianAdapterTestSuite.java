package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationTestMedianYear() {

        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author", "title", 1990,"1234"));
        books.add(new Book("author1", "title1", 2000,"1233"));
        books.add(new Book("author2", "title2", 2004,"1235"));
        books.add(new Book("author3", "title3", 2008,"1236"));
        books.add(new Book("author4", "title4", 1999,"1237"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2000,median);
    }
}
