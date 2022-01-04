package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }


    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("post", postDao.findAll());
        return "posts/show";
    }

    @PostMapping("/posts")
    public String addPost(@RequestParam(name = "post") String post, Model model) {

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
