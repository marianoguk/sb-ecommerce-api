package com.sb.ecommerce.infrastructure.api.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsHealthChecker {
    private static final String RESPONSE = "OK";

    @GetMapping("/")
    public String status() {
        return RESPONSE;
    }
}
