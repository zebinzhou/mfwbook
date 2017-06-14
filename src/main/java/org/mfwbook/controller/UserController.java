package org.mfwbook.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mfwbook.dao.UserRepository;
import org.mfwbook.model.User;
import org.mfwbook.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SecurityService securityService;
	
	@Autowired
	HttpServletRequest httpServletRequest;
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	
//	@ResponseBody
    @RequestMapping("/home1")
    public String user(Model model) {
		String username = httpServletRequest.getRemoteUser();
        User user = userRepository.findByName(username);
        List<User> list = new ArrayList<>();
        list.add(user);
        model.addAllAttributes(list);
        model.addAttribute(user);
        if(user!=null)
        
        return "user";
        return "home1";
    }
}
