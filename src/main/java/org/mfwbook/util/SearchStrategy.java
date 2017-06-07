package org.mfwbook.util;

import java.util.List;

import org.mfwbook.data.BookRepository;
import org.mfwbook.model.Book;
import org.springframework.stereotype.Component;

@Component
public abstract class SearchStrategy {
    
    protected BookRepository bookRepository;
    
    public abstract List<Book> search(String s);
}
