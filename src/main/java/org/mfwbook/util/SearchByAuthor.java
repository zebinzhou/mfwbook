package org.mfwbook.util;

import java.util.List;

import org.mfwbook.data.BookRepository;
import org.mfwbook.model.Book;

public class SearchByAuthor extends SearchStrategy {

    public SearchByAuthor(BookRepository bookRepository) {
        super.bookRepository = bookRepository;
    }

    @Override
    public List<Book> search(String author) {
        String string = "%" + author + "%";
        return bookRepository.findByAuthorLike(string);
    }

}
