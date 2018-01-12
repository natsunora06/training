package com.example.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DisplayController {
    @GetMapping("/")
    public String top(){
        return "top";
    }

    @GetMapping("/list")
    public String postlist(){
        return "postlist";
    }
}
