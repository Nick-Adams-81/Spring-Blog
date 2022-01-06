package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;

    // setting up the post controller
    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }


    // getting the show post page
    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("post", postDao.findAll());
        return "posts/show";
    }


    // delete a post method
    @PostMapping("/posts/{id}")
    public String deletePost(@PathVariable Long id) {
        postDao.deleteById(id);
        return "redirect:/posts";
    }

    @GetMapping("posts/edit/{id}")
    public String editPost(@PathVariable long id, Model model) {
        Post editPost = postDao.getById(id);
        System.out.println("editPost.getTitle() = " + editPost.getTitle());
        System.out.println("editPost.getBody() = " + editPost.getBody());
        model.addAttribute("postToEdit", editPost);
        return "posts/edit";
    }

    @PostMapping("/posts/edit")
    public String saveEditedPost(@RequestParam(name="postTitle") String postTitle, @RequestParam(name="postBody") String postBody, @RequestParam(name="postId") long id) {

        Post postToEdit = postDao.getById(id);
        postToEdit.setBody(postBody);
        postToEdit.setTitle(postTitle);

        System.out.println(postToEdit.getBody());
        System.out.println(postToEdit.getTitle());

        postDao.save(postToEdit);
        return "redirect:/posts";
    }



//    @PostMapping("/posts/create")
//    public String createPost(@ModelAttribute Post post) {
//        postDao.save(post);
//        return "posts/show";
//    }

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


}
