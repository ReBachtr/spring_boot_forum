package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    @GetMapping("/")
//    public String hello(@RequestParam(name="name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
    public String index() {
        return "index";
    }
}
