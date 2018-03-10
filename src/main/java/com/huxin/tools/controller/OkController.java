package com.huxin.tools.controller;

import com.huxin.tools.entity.Lamp;
import com.huxin.tools.entity.Pm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class OkController {

    public static List<Lamp> lamps = new ArrayList<>();


    @RequestMapping("/pm")
    public Object pm() {
        Pm pm = new Pm();

        pm.setPmz(Double.valueOf(Math.random() * 200).intValue());
        pm.setSd(Double.valueOf(Math.random() * 160).intValue());
        pm.setWd(Double.valueOf(Math.random() * 36).intValue());
        return pm;
    }

    @RequestMapping("/car")
    public Object car() {
        if (lamps.size() == 0) initLamps();
        for (Lamp lamp : lamps) {
            lamp.setRank(Double.valueOf(Math.random() * 8).intValue());
        }
        return lamps;
    }

    @RequestMapping("/update")
    public Object update(@RequestParam int id,@RequestParam int nowTime) {
        Lamp mLamp = new Lamp();
        for (Lamp lamp : lamps) {
            if(lamp.getId()==id) {
                lamp.setNowTime(nowTime);
                lamp.setUpdateTime(new Date());
                mLamp =lamp;
            }
        }


        return mLamp;
    }

    private void initLamps() {
        lamps.add(new Lamp(1, Double.valueOf(Math.random() * 8).intValue(), 20, 30, new Date()));
        lamps.add(new Lamp(2, Double.valueOf(Math.random() * 8).intValue(), 10, 10, new Date()));
        lamps.add(new Lamp(3, Double.valueOf(Math.random() * 8).intValue(), 10, 30, new Date()));
    }


}
