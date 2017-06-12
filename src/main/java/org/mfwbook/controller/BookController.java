package org.mfwbook.controller;

import java.util.List;

import org.mfwbook.dao.BookRepository;
import org.mfwbook.model.Book;
import org.mfwbook.util.SearchFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    
    @RequestMapping("/s")
    public @ResponseBody String searchBook(String className, String s,Model model) {
    	List<Book> books = SearchFactory.create(bookRepository, className).search(s);
    	model.addAllAttributes(books);
        return "book";
    }
    
//    @RequestMapping("/d")
//    public void delete(String bookId) {
//        bookRepository.deleteByBookId(bookId);
//    }

    @RequestMapping("/book")
    public String book(Model model) {
        return "book";
    }

    // private int readTimes = 0;
    //
    // private int searchTimes = 0;
    //
    // private List<Book> list = new ArrayList<>();
    //
    // @RequestMapping("/book")
    // public String user(Model model) {
    // Book book = new Book();
    //
    // for (int i = 0; i < 10; i++) {
    // List<String> bookTypes = new ArrayList<>();
    //
    // book.setBookName("Spring实战");
    // book.setAuthor("Craig Walls");
    // book.setPublisher("人民邮电出版社");
    // book.setBookId("01-2014-7524");
    //
    // bookTypes.add("编程");
    // bookTypes.add("教育");
    // bookTypes.add("科研");
    // book.setBookTypes(bookTypes);
    //
    // book.setReadTimes(readTimes);
    // book.setSearchTimes(searchTimes);
    //
    // list.add(book);
    // }
    // model.addAllAttributes(list);
    //
    // return "book";
    // }
}
