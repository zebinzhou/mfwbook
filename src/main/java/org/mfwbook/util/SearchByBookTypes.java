package org.mfwbook.util;

import java.util.List;

import org.mfwbook.data.BookRepository;
import org.mfwbook.model.Book;

public class SearchByBookTypes extends SearchStrategy {

    public SearchByBookTypes(BookRepository bookRepository) {
        super.bookRepository = bookRepository;
    }

    @Override
    public List<Book> search(String bookTypes) {
        String string = "%" + bookTypes + "%";
        return bookRepository.findByBookTypesLike(string);
    }

}
