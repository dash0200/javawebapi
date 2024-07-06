package com.example.javawebapi.controllers.bye;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/goodbye")
public class ByeController {
    @GetMapping
    public String goodbye() {
        return "Goodbye, World!";
    }

    @GetMapping("/farewell")
    public String farewell() {
        return "Farewell from GoodbyeController!";
    }
}
