package com.huxin.tools.entity;

public class Pm {

    private int pmz;

    private int wd;

    private int sd;

    public int getPmz() {
        return pmz;
    }

    public void setPmz(int pmz) {
        this.pmz = pmz;
    }

    public int getWd() {
        return wd;
    }

    public void setWd(int wd) {
        this.wd = wd;
    }

    public int getSd() {
        return sd;
    }

    public void setSd(int sd) {
        this.sd = sd;
    }

    @Override
    public String toString() {
        return "Pm{" +
                "pmz=" + pmz +
                ", wd=" + wd +
                ", sd=" + sd +
                '}';
    }
}
