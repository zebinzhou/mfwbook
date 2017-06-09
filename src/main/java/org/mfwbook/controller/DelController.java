package org.mfwbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DelController {
    @RequestMapping("/del")
    public String user(Model model) {
        return "del";
    }
}

