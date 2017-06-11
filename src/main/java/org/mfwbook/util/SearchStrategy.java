package org.mfwbook.util;


import java.util.List;

import org.mfwbook.dao.BookRepository;
import org.mfwbook.model.Book;

public abstract class SearchStrategy {
    
    protected BookRepository bookRepository;
    
    public abstract List<Book> search(String s);
}
