package com.example.crud.Controller;

import com.example.crud.Dao.PosterMapper;
import com.example.crud.Entitiy.Detail;
import com.example.crud.Entitiy.PostForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class DisplayController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ModelAttribute
    PostForm postForm(){
        return new PostForm();
    }

    @GetMapping("/")
    public String top(){
        return "top";
    }

    // post.htmlファイルを表示する
//    @GetMapping("/post")
//    public String post(){
//        return "post";
//    }


     //CRUD (Create) "入力をpost_testテーブルに登録する。

    @RequestMapping(path = "/post", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute Detail Detail){
        jdbcTemplate.update("INSERT INTO post_test (content) values (?)", Detail.getContent());
        return "redirect:/post";
    }


    // CRUD (Read) "post_testテーブルのレコードを全件取得
    @RequestMapping(path = "/post", method = RequestMethod.GET)
    String post(Model model){
        List<Detail> list = jdbcTemplate.queryForObject("select * from post_test", new PosterMapper());
        model.addAttribute("list", list);
        System.out.println(list);
        return "post";
    }
    @RequestMapping(path = "/post/{id}",method = RequestMethod.GET)
    String show (Model model, @PathVariable("id") int id){
        List<Detail> list = jdbcTemplate.queryForObject("select * from post_test where id = ?", new Object[] {id}, new PosterMapper());
        model.addAttribute("list", list);
        return "post";
    }

//    // CRUD (Update) "既存の登録内容を更新する"
//    @RequestMapping(path = "/sample/{id}", method = RequestMethod.PUT)
//    String update(Model model, @ModelAttribute Detail Detail, @PathVariable("id") int id){
//        jdbcTemplate.update("UPDATE post_test SET content = ? where id = ?", Detail.getContent(), id);
//        return "redirect:/sample";
//    }
//
//    // CRUD (Delete) "既存の投稿内容を削除する"
//    @RequestMapping(path = "/sample/{id}", method = RequestMethod.DELETE)
//    String destroy(Model model, @PathVariable("id") int id){
//        jdbcTemplate.update("delete form post_test where id = ?, id");
//        return "redirect:/sample";
//    }


}
