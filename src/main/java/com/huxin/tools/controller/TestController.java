package com.huxin.tools.controller;


import com.huxin.tools.dao.ToolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ToolDao toolDao;

    @RequestMapping("test")
    public Object selectTools(){
        return toolDao.selectTools();
    }



}
