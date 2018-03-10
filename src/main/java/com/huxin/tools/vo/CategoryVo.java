package com.huxin.tools.vo;

import com.huxin.tools.entity.Tool;

import java.util.List;

public class CategoryVo {

    private Integer typeId;

    private String name;

    private Integer typeParent;

    private List<Tool> tools;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeParent() {
        return typeParent;
    }

    public void setTypeParent(Integer typeParent) {
        this.typeParent = typeParent;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "CategoryVo{" +
                "typeId=" + typeId +
                ", name='" + name + '\'' +
                ", typeParent=" + typeParent +
                ", tools=" + tools +
                '}';
    }
}
