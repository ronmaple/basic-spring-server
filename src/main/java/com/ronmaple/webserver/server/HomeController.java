package com.ronmaple.webserver.server;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
