package com.huxin.tools.Service;

import com.huxin.tools.dao.CategoryDao;
import com.huxin.tools.entity.Category;
import com.huxin.tools.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    public List<Category> getCategorys(){
        return categoryDao.selectCategorys();
    }


    /**
     * 获取有工具的类目
     * @return
     */
    public List<CategoryVo> getSubTools(){
        List<CategoryVo> categoryVos = categoryDao.selectCategoryVo();
        List<CategoryVo> cv = new ArrayList<CategoryVo>();
        for (CategoryVo c : categoryVos){
            if(c.getTools() != null){
                if(c.getTools().size() > 0){
                    cv.add(c);
                }
            }
        }
        return cv;
    }
}
