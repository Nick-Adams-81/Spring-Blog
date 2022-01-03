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

    @GetMapping("roll-dice")
    public String RollDice() {
        return "roll";
    }

    @GetMapping("roll-dice/1")
    public String guess1() {
        return "guess1";
    }

    @GetMapping("roll-dice/2")
    public String guess2() {
        return "guess2";
    }

    @GetMapping("roll-dice/3")
    public String guess3() {
        return "guess3";
    }

    @GetMapping("roll-dice/4")
    public String guess4() {
        return "guess4";
    }

    @GetMapping("roll-dice/5")
    public String guess5() {
        return "guess5";
    }

    @GetMapping("roll-dice/6")
    public String guess6() {
        return "guess6";
    }

}
