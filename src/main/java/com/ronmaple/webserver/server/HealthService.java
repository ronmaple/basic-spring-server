package com.ronmaple.webserver.server;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String health() {
        System.out.println("HealthService health()");
        return "OK";
    }
}
