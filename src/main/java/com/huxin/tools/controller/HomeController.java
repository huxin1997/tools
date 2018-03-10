package com.huxin.tools.controller;

import com.huxin.tools.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/")
    public Object homePage(Model model){

        model.addAttribute("categorys",categoryService.getSubTools());
        return "index";
    }
}
