package org.mfwbook.util;

import java.util.List;

import org.mfwbook.data.BookRepository;
import org.mfwbook.model.Book;

public class SearchByBookName extends SearchStrategy {

    public SearchByBookName(BookRepository bookRepository) {
        super.bookRepository = bookRepository;
    }
    
    @Override
    public List<Book> search(String bookName) {
        String string = "%" + bookName + "%";
        return bookRepository.findByBookNameLike(string);
    }
}
