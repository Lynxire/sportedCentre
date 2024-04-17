package by.teachmeskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientMvcApi{
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
