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
        return "redirect:/posts";
    }


    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        postDao.save(post);
        return "posts/show";
    }
//
//    @GetMapping("post/{id}")
//    public String updatePost(Model model, @PathVariable Long id) {
//        Post post = postDao.getById(id);
//        model.addAttribute("posts", post);
//        return "posts/show";
//    }

//    @PostMapping("posts/{id}")
//    public String editPost(@PathVariable("id") Long id, @ModelAttribute Post post) {
//        postDao.save(post);
//        return "posts/show";
//    }

//
}
