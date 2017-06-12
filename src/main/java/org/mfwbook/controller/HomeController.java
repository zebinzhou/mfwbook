package org.mfwbook.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.mfwbook.dao.UserRepository;
import org.mfwbook.model.Book;
import org.mfwbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
    @Autowired
    private UserRepository userRepository;
    
	@Autowired
	HttpServletRequest httpServletRequest;

	@RequestMapping("/home")
    public String home(Model model) {
    	String username = httpServletRequest.getRemoteUser();
        User user = userRepository.findByName(username);
        Set<Book> userbooks = user.getBooks();
        model.addAllAttributes(userbooks);
        return "home";
    }
	
	 @RequestMapping("/")
	 public String login(Model model) {
		 return "login";
	 }
	 @RequestMapping("/register")
	 public String register(Model model) {
		 return "register";
	 }
}
