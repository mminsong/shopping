package com.example.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="main")
public class MainController {
    @GetMapping(value = "home")
    public ModelAndView getHome(ModelAndView modelAndView) {
        modelAndView.setViewName("/main/home");
        return modelAndView;
    }



}