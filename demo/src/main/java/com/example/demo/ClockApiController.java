package com.example.demo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Map;

@RestController
public class ClockApiController {
    @RequestMapping("/cup")
    public Map<String, String> path(){
        // Mapで時間をわたす
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime.getHour() + "時");
            System.out.println(localTime.getMinute() + "分");
            System.out.println(localTime.getSecond() + "秒");

            System.out.println(localTime.toString());
            // 時間が取得できているかコンソールで確認する表記
            return Collections.singletonMap("time", localTime.getHour() + "時" +localTime.getMinute() + "分" + localTime.getSecond() + "秒");
            // "time"で取得した時間をhtmlファイルにわたす
    }
}
