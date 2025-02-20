package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;


    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
    }

    @Test                                                                               // [1]
    void testListBooksWithConditionsReturnList() {                                      // [2]

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());                                          // [15]
    }
    @Test
    void testListBooksInHandsOf() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooksUser1 = new ArrayList<>();
        List<Book> resultListOfBooksUser2 = new ArrayList<>();
        List<Book> resultListOfBooksUser3 = new ArrayList<>();

        Book book1 = new Book("Prisoners of Alamo", "Betty Smith", 2018);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Humbert", 2002);    // [6]
        Book book3 = new Book("Life of Flies", "Steve Buscemi", 2010);    // [7]
        Book book4 = new Book("Secrets of Trees", "Ian Black", 2000);
        Book book5 = new Book("Secret life of Butterflies", "Steve Marini", 2006);    // [7]
        Book book6 = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        resultListOfBooksUser2.add(book1);
        resultListOfBooksUser3.add(book2);
        resultListOfBooksUser3.add(book3);
        resultListOfBooksUser3.add(book4);
        resultListOfBooksUser3.add(book5);
        resultListOfBooksUser3.add(book6);

        LibraryUser user1 = new LibraryUser("Abe", "Becca", "123456");
        LibraryUser user2 = new LibraryUser("Cyd", "Efron", "344567");
        LibraryUser user3 = new LibraryUser("Gohan", "Ijen", "456789");

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOfBooksUser1);
        when(libraryDatabaseMock.listBooksInHandsOf(user2)).thenReturn(resultListOfBooksUser2);
        when(libraryDatabaseMock.listBooksInHandsOf(user3)).thenReturn(resultListOfBooksUser3);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, theListOfBooks.size());

        //When
        theListOfBooks = bookLibrary.listBooksInHandsOf(user2);

        //Then
        assertEquals(1, theListOfBooks.size());

        //When
        theListOfBooks = bookLibrary.listBooksInHandsOf(user3);

        //Then
        assertEquals(5, theListOfBooks.size());


    }
}