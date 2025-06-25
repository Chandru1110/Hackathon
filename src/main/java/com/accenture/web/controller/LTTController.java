package com.accenture.web.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ltt")
public class LTTController {
    @GetMapping("/list")
    public String list() {
        // TODO: Implement logic
        return "ltt list";
    }
    @PostMapping("/add")
    public String add() {
        // TODO: Implement logic
        return "ltt add";
    }
    @PutMapping("/update")
    public String update() {
        // TODO: Implement logic
        return "ltt update";
    }
    @DeleteMapping("/delete")
    public String delete() {
        // TODO: Implement logic
        return "ltt delete";
    }
} 