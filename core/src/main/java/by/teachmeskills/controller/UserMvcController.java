package by.teachmeskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserMvcController {
@GetMapping("/hello")
    public String handler(Model model) {
        model.addAttribute("name", "Yaroslav");
        return "hello";
    }
}
