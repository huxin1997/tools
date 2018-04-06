package com.huxin.tools.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;



public class ToolHandllerTest {

    Logger logger = LoggerFactory.getLogger(ToolHandllerTest.class);

    @Test
    public void ksVidioDownload() throws Exception {


        Document doc = Jsoup.connect("https://www.kuaishou.com/photo/693811942/5224828216?userId=693811942&photoId=5224828216&timestamp=1519558207673&cc=share_copylink&et=1_i%2F1593372196504616962_h88&fid=225111831").get();
        Elements select = doc.select("head > meta:nth-child(22)");
        logger.info(select.attr("content"));

    }

}

