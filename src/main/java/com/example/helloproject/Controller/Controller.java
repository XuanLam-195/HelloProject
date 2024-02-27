package com.example.helloproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Controller {
    @GetMapping("/welcome")
    public String welcome(){
     return "welcome";
    }

}
