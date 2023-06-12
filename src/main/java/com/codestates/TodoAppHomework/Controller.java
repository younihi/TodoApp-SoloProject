package com.codestates.TodoAppHomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Controller {
    @GetMapping("/String")
    public String getString() {
        return "To-do Application !";
    }
}  