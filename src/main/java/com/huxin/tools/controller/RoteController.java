package com.huxin.tools.controller;

import com.huxin.tools.Service.RoteService;
import com.huxin.tools.entity.Tool;
import com.huxin.tools.entity.ToolWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoteController {

    @Autowired
    RoteService roteService;

    @RequestMapping(value = "/{toolLink}")
    public Object pageRoute(@PathVariable String toolLink,Model model){
        ToolWithBLOBs toolb = roteService.getToolByLink(toolLink);
        model.addAttribute("tool",toolb);
        return "tool";
    }

}
