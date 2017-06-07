package org.mfwbook.util;

import java.util.List;

import org.mfwbook.data.BookRepository;
import org.mfwbook.model.Book;

public class SearchByBookId extends SearchStrategy {
    
    public SearchByBookId(BookRepository bookRepository) {
        super.bookRepository = bookRepository;
    }
    
    @Override
    public List<Book> search(String bookId) {
        List<Book> b = bookRepository.findByBookId(bookId);
        return b;
    }

}
