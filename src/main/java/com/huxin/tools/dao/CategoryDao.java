package com.huxin.tools.dao;

import com.huxin.tools.entity.Category;
import com.huxin.tools.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryDao {

    @Select("SELECT * FROM category")
    List<Category> selectCategorys();


    @Select("SELECT * FROM category")
    @ResultMap("categoryVoResult")
    List<CategoryVo> selectCategoryVo();
}
