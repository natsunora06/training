package com.example.demo;


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
            LocalTime localTime = LocalTime.now();
            //model.addAttribute("time", localTime);
           // @DateTimeFormat(pattern = "HH:mm:ss") @PathVariable LocalDate pathDate,
           // @DateTimeFormat(pattern = "HH:mm:ss") @RequestParam LocalDate requestDate) {
        System.out.println(localTime.toString());
        // コンソールに時間表示
        return Collections.singletonMap("time", localTime.toString());
    }
}
