package com.denisfesenko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Java library that implements a book database focusing on essential properties such as author(s) and title.
 * A book can have multiple authors, but titles must be unique. Author names are also considered unique.
 *
 * <p>The database should be accessed through a straightforward interface, which includes methods for querying
 * available titles for a given author and determining which authors are associated with a specific title.
 *
 * <p>There is no need for a UI or command-line interface. The requirement is for a Java library that will be
 * accessed by client code.
 *
 * <p>The database will be populated at application start-up, and new records will be added infrequently.
 *
 * <p>Frequent operations include querying authors of a title and titles for a given author. Efficient lookup
 * performance is crucial.
 *
 * <p>Additionally, the library should support the following infrequent operations:
 * <ul>
 *   <li>Add a title</li>
 *   <li>Remove a title</li>
 *   <li>Remove all titles for a given author</li>
 * </ul>
 *
 * <p>The solution should be an in-memory, simple yet well-designed library that addresses the problem as specified
 * above. A relational database or query language is not required. The library does not need to be thread-safe.
 */
public class BookDatabase {
    private final Map<String, List<String>> authorToBooks = new HashMap<>();
    private final Map<String, List<String>> bookToAuthors = new HashMap<>();

    // Adds a book and its authors to the database
    public void addBook(String title, List<String> authors) {
        bookToAuthors.put(title, authors);
        authors.forEach(author -> addBookToAuthor(author, title));
    }

    // Removes a book and updates the authors' lists
    public void removeBook(String title) {
        List<String> authors = bookToAuthors.get(title);
        if (authors != null) {
            authors.forEach(author -> removeBookFromAuthor(author, title));
            bookToAuthors.remove(title);
        }
    }

    // Removes all books by an author
    public void removeAllBooksByAuthor(String author) {
        List<String> titles = authorToBooks.get(author);
        if (titles != null) {
            titles.forEach(bookToAuthors::remove);
            authorToBooks.remove(author);
        }
    }

    // Returns a list of book titles by an author
    public List<String> getTitlesByAuthor(String author) {
        return authorToBooks.getOrDefault(author, Collections.emptyList());
    }

    // Returns a list of authors for a book title
    public List<String> getAuthorsByTitle(String title) {
        return bookToAuthors.getOrDefault(title, Collections.emptyList());
    }

    // Helper method: Adds a book to an author's list
    private void addBookToAuthor(String author, String title) {
        authorToBooks.putIfAbsent(author, new ArrayList<>());
        authorToBooks.get(author).add(title);
    }

    // Helper method: Removes a book from an author's list and cleans up if the list is empty
    private void removeBookFromAuthor(String author, String title) {
        authorToBooks.computeIfPresent(author, (key, value) -> {
            value.remove(title);
            return value.isEmpty() ? null : value;
        });
    }
}
