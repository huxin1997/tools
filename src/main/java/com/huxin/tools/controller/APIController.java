package com.huxin.tools.controller;

import com.huxin.tools.Service.ToolHandller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/V1/tool")
@RestController
public class APIController {

    @Autowired
    ToolHandller toolHandller;

    @RequestMapping("/kuaishou")
    public Object ksDownload(@RequestParam String url){
     return toolHandller.ksVidioDownload(url);
    }


}
