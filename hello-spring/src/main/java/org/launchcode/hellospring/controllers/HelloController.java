package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }


    //Handles requests of the forms /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})

    public String helloWithQueryParam(@RequestParam String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }
        //Handles requests of the form /hello/LaunchCode
        @GetMapping("hello/{name}")
        public String helloWithPathParam(@PathVariable String name, Model model){
            String theGreeting = "Hello, " + name + "!";
            model.addAttribute("greeting", theGreeting);
            return "hello";
        }
// /hello form
        @GetMapping("form")
        public String helloForm(){
           return "form";
        }

        @GetMapping("hello-names")
        public String helloNames(Model model){
            List<String> names = new ArrayList<>();
            names.add("LaunchCode");
            names.add("Java");
            names.add("JavaScript");
            model.addAttribute("names", names);
        return "hello-list";
        }
}


