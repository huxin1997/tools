package com.huxin.tools.Service;


import com.huxin.tools.dao.CategoryDao;
import com.huxin.tools.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolService {

    @Autowired
    CategoryDao categoryDao;

}
