package com.formation.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return "<h3>Salut bataaaaaaaaaaaaaaaaard!</h3>";

    }
}
