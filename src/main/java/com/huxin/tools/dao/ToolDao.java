package com.huxin.tools.dao;

import com.huxin.tools.entity.Tool;
import com.huxin.tools.entity.ToolWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ToolDao {

    @Select("SELECT * FROM tool WHERE id = #{id}")
    Tool selectTool(int id);

    @Select("SELECT * FROM tool WHERE id = #{id}")
    ToolWithBLOBs selectToolB(int id);


    @Select("SELECT * FROM  tool WHERE tool_link =  #{arg0}")
    Tool selecToolByLink(String link);

    @Select("SELECT * FROM  tool WHERE tool_link =  #{arg0}")
    ToolWithBLOBs selecToolbByLink(String link);

    @Select("SELECT * FROM tool")
    List<Tool> selectTools();
}
