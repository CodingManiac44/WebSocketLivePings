package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSocketController {

    @GetMapping("/")
    public String index() {
        return "index"; // index.html নামক HTML টেমপ্লেট render হবে
    }
}

