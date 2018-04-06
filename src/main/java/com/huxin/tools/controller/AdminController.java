package com.huxin.tools.controller;


import com.huxin.tools.dao.ToolDao;
import com.huxin.tools.entity.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    ToolDao toolDao;

    @RequestMapping("/admin")
    public Object login() {
        return "admin/admin_login";
    }

    @RequestMapping("/admin/main")
    public Object admin(Model model) {

        List<Tool> tools = toolDao.selectTools();
        model.addAttribute("tools",tools);
        return "admin/admin_main";
    }

    @RequestMapping("/admin/tool")
    public Object tool(){
        return "admin/tool_detail";
    }

}
