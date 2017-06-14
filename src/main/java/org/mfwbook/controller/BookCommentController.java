package org.mfwbook.controller;

import javax.servlet.http.HttpServletRequest;

import org.mfwbook.dao.BookCommentRepository;
import org.mfwbook.dao.BookRepository;
import org.mfwbook.dao.UserRepository;
import org.mfwbook.model.Book;
import org.mfwbook.model.BookComment;
import org.mfwbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookCommentController {
    
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private BookCommentRepository bookCommentRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    HttpServletRequest httpServletRequest;
    
    @RequestMapping("/addcomment")
//    public @ResponseBody BookComment addComment(String comment, String bookId, Model model) {
    public String addComment(String comment, String bookId, Model model) {

        String username = httpServletRequest.getRemoteUser();
        User user = userRepository.findByName(username);
        Book book = bookRepository.findByBookId(bookId).get(0);
        
        BookComment bookComment = new BookComment(user, book);
        bookComment.setContent(comment);
        //model.addAttribute("bookAddComment", bookComment);
        bookCommentRepository.save(bookComment);
        
        //return bookComment;
        return "redirect:/book/"+ book.getBookId();
    }
}
