package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String posts() {
        return "posts/show";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postById(@PathVariable int id) {
        return "Getting posts by id here";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPosts() {
        return "Viewing posts here";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String createNewPost() {
        return "New posts go through here";
    }

    @GetMapping("post")
    public String post() {
        return "posts/index";
    }



}
