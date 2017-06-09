package org.mfwbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
    @RequestMapping("/add")
    public String user(Model model) {
        return "add";
    }
}
