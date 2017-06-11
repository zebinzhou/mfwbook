package org.mfwbook.util;


import java.util.List;

import org.mfwbook.dao.BookRepository;
import org.mfwbook.model.Book;


public class SearchByBookId extends SearchStrategy {
    
    public SearchByBookId(BookRepository bookRepository) {
        super.bookRepository = bookRepository;
    }
    
    @Override
    public List<Book> search(String bookId) {
        return bookRepository.findByBookId(bookId);
    }

}
