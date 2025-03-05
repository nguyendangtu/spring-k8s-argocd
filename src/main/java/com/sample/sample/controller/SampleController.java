package com.sample.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JOHNNGUYEN
 * @since : 2/27/2025, Thu
 **/
@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping
    public String getSample() {
        return "GET sample success!";
    }

    @PostMapping
    public String createSample() {
        return "POST sample success!";
    }
}
