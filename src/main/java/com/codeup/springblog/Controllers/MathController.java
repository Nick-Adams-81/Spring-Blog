package com.codeup.springblog.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int number1, @PathVariable int number2) {
        return number1 + " plus " + number2 + " equals: " + (number1 + number2);
    }

    @RequestMapping(path = "/subtract/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int number1, @PathVariable int number2) {
        return number1 + " minus " + number2 + " equals: " + (number1 - number2);
    }

    @RequestMapping(path = "/multiply/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int number1, @PathVariable int number2) {
        return number1 + " times " + number2 + " equals: " + (number1 * number2);
    }

    @RequestMapping(path = "/divide/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int number1, @PathVariable int number2) {
        return number1 + " divided by " + number2 + " equals: " + (number1 / number2);
    }


    @Entity
    @Table(name = "post")
    public static class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false, length = 50)
        private String title;

        @Column(nullable = false, length = 50)
        private String body;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }
}
