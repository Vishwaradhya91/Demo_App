package com.deploy.war.demoapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
 
    @GetMapping("/users")
    public List getUsers() {
        return List.of(
                "xxxx",
                "bbhjasbs",
                "djkdjk"
        );
    }
}
