package com.experis.course.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        String name = "Matteo";
        model.addAttribute("name", name);
        return "home";
    }

}
