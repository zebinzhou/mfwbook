package org.mfwbook.util;


import org.mfwbook.dao.BookRepository;

public class SearchFactory {
	
	
    public static SearchStrategy create(BookRepository bookRepository, String className) {
        if (className.equals("书号搜索")) {
            return new SearchByBookId(bookRepository);
        } else if (className.equals("作者搜索")) {
            return new SearchByAuthor(bookRepository);
        } else if (className.equals("书名搜索")) {
            return new SearchByBookName(bookRepository);
        } else if (className.equals("类型搜索")) {
            return new SearchByBookTypes(bookRepository);
        } else {
            return null;
        }
    }
}
