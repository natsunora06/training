package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Map;

// MainController

@Controller // ①Classがユーザからのアクセスを受け取ることができる
//@RestController
public class HelloWorld {

    // @RequestMapping("/")
    //public ModelAndView hello(){
    //  modelAndView.setViewName("hello");
    //return modelAndView;
    //}


    // @GetMappingを続けて書く際の注意点
    // htmlファイルでmetaタグの最後を "/" (スラッシュ)で閉じないとerrorになる
    @GetMapping("/") // ②httpメソッドがGETでURLが/のアクセスがあると、このメソッドが呼ばれるようになる
    // ()の中のパスは、http://localhost:8080 に続く内容
    // @GetMapping("/test")とすれば http://localhost:8080/test となる
    public String content() {
        // String のあとの名前は何でも大丈夫（ファイルの中身がわかるような名前がいいのかもしれない。）
        return "hello"; // returnのあとはファイル名
        // この場合は hello.html を表示したいので return の後に "hello"を書く
    }

    @GetMapping("/peanuts")
    public String sample() {
        return "peanuts";
    }

    @GetMapping("/list") // http:localhost:8080/list で表示
    public String list(){
      return "json"; // json.html ファイルとコネクト
    }



   // @RequestMapping("/json")
    //public Map<String, String> hello() {
      //return Collections.singletonMap("message", "Hellow, World!"); // ③

    //}

    // 値を表示するだけ　intの場合
    //@RequestMapping("/practice1")
    // ( )かっこの中はURLの8080の続き
    //public int number() {
        //returnで返す内容
        // ex) int number(),  String text()
      //  return 12 + 24;
        // 表示したい値
        // 文字列や数字　ex) 12 + 24, "アイウエオ"
    //}

    // 値を表示するだけ　Stringの場合
    //@RequestMapping("/practice2")
    //public String text(){
      //  return "こんにちは🐶！！";
        // Stringには絵文字がいける！！
    //}





}