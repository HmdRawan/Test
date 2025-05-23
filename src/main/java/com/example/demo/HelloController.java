package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/designs")
    public List<Design> getDesigns() {
        return Arrays.asList(
                new Design("عباية", 150),
                new Design("فستان", 200)
        );
    }
}
