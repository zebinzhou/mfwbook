package org.mfwbook.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.mfwbook.dao.BookRepository;
import org.mfwbook.dao.UserRepository;
import org.mfwbook.model.Book;
import org.mfwbook.model.User;
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
    
    @Autowired
    private UserRepository userRepository;
    
	@Autowired
	HttpServletRequest httpServletRequest;
    
	@RequestMapping("/s")
	public @ResponseBody List<Book> searchBook(String className, String key) {
        return SearchFactory.create(bookRepository, className).search(key);
	}
	
    @RequestMapping("/addbook")
    public @ResponseBody Book addBook(String bookName,Model model) {
    	Book book = bookRepository.findByBookNameLike(bookName).get(0);
    	model.addAttribute(book);
    	String username = httpServletRequest.getRemoteUser();
        User user = userRepository.findByName(username);
        Set<Book> userbooks = user.getBooks();
        userbooks.add(book);
        userRepository.save(Arrays.asList(user));
        return book;
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
