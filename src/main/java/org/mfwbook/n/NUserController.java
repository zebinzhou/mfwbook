package org.mfwbook.n;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NUserController {
    @RequestMapping("/nu")
    public String user(Model model) {
        NUser nUser = new NUser("test", "testingnum");
        List<NUser> list = new ArrayList<>();
        list.add(nUser);
        model.addAllAttributes(list);
        
        return "nuser";
    }
}
