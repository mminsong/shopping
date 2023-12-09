package com.example.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @GetMapping(value = "login")
    public ModelAndView getLogin(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/login");
        return modelAndView;
    }

    @GetMapping(value = "/join")
    public ModelAndView getJoin(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/join");
        return modelAndView;
    }@GetMapping(value = "/userjoin")
    public ModelAndView getUserJoin(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/userjoin");
        return modelAndView;
    }

    @GetMapping(value = "/businessjoin")
    public ModelAndView getBusinessJoin(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/businessjoin");
        return modelAndView;
    }

    @GetMapping(value = "/findpw")
    public ModelAndView getFindPw(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/findpasswd");
        return modelAndView;
    }

    @GetMapping(value = "/findid")
    public ModelAndView getFindId(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/findid");
        return modelAndView;
    }

    @GetMapping(value = "/heart")
    public ModelAndView getHeart(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/heart");
        return modelAndView;
    }

    @GetMapping(value = "/mypage")
    public ModelAndView getMypage(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/mypage");
        return modelAndView;
    }

}
