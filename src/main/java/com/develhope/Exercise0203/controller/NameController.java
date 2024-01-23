package com.develhope.Exercise0203.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reversename")
    public String reverseName(@RequestBody String name) {
        StringBuilder stringBuilder = new StringBuilder(name).reverse();
        return stringBuilder.toString();
    }

}
