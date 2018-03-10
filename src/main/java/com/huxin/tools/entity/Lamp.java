package com.huxin.tools.entity;

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lamp {

    private int id;

    private int rank;

    private int beforetime;

    private int nowTime;

    private Date updateTime;

    public Lamp() {
    }

    public Lamp(int id, int rank, int beforetime, int nowTime, Date updateTime) {
        this.id = id;
        this.rank = rank;
        this.beforetime = beforetime;
        this.nowTime = nowTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getBeforetime() {
        return beforetime;
    }

    public void setBeforetime(int beforetime) {
        this.beforetime = beforetime;
    }

    public int getNowTime() {
        return nowTime;
    }

    public void setNowTime(int nowTime) {
        this.nowTime = nowTime;
    }

    public String getUpdateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm");
        String format = null;
        format = sdf.format(updateTime);



        return format;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "id=" + id +
                ", rank=" + rank +
                ", beforetime=" + beforetime +
                ", nowTime=" + nowTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
