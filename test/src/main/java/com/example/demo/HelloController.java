package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalTime;
import java.util.Collections;
import java.util.Map;

// APIController

@RestController
public class HelloController {

    //@RequestMapping("/json")
    @RequestMapping("/cat")
    public Map<String, String> json(){
        // <String, String> = ("message", "こんばんわ")
        //LocalTime localTime = LocalTime.now();
        return Collections.singletonMap("message","こんばんわ");

        // return Collections.singletonMap("message",localTime.toString());
        // 表示させたい値を”message”の後ろに書く
        // この場合は「こんばんわ」と表示される
    }

}
