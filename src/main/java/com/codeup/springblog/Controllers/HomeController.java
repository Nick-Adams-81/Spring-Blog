package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String helloLandingPage() {
        return "This is the landing page!";
    }

    @GetMapping("profile/{username}")
    public String profiles(@PathVariable String username, Model model) {
        model.addAttribute("username", username);
        return "profile";
    }

    @GetMapping("join")
    public String join() {
        return "join";
    }

    @PostMapping("join")
    public String join(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }
}
