package com.huxin.tools.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/admin")
    public Object login() {
        return "admin/admin_login";
    }

    @RequestMapping("/admin/main")
    public Object admin() {
        return "admin/admin_main";
    }

}
