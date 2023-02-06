package com.example.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
    @GetMapping("/hello-spring")
    public String helloSpring(){
        return "Hello Spring!";
    }
    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name){
        return "Hello "+name;
    }
    @GetMapping("/request")
    public String request(@RequestParam  String name){
        return "Hello "+name;
    }
    @PostMapping("/post")
    public String post(@RequestBody  String text){
        return "Body "+text.length();
    }

}
