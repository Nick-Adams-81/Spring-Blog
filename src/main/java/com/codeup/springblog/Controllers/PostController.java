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

    @PostMapping("/posts/{id}")
    public String deletePost(@PathVariable Long id) {
        postDao.deleteById(id);
        return "posts/show";
    }


    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        postDao.save(post);
        return "posts/show";
    }

//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String viewPosts() {
//        return "Viewing posts here";
//    }


    @GetMapping("post")
    public String post() {
        return "posts/index";
    }


}
