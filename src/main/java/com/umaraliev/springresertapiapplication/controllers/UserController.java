package com.umaraliev.springresertapiapplication.controllers;

import com.umaraliev.springresertapiapplication.model.User;
import com.umaraliev.springresertapiapplication.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan
@EnableJpaRepositories("com.umaraliev.springresertapiapplication.repository")
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @PostMapping("/create-user")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/delete-user/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
