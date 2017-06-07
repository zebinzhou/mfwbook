package org.mfwbook;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    @RequestMapping("/u")
    public String user(Model model) {
        User user = new User("test", "testingnum");
        List<User> list = new ArrayList<>();
        list.add(user);
        model.addAllAttributes(list);
        
        return "user";
    }
}
