package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex() {
        return "all the posts here soon";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postById(@PathVariable int id) {
        return "Getting posts by id herre";
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
}
