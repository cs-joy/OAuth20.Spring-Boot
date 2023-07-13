package com.oauth2.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class AppController {
    @GetMapping
    public ResponseEntity<String> checkStatus() {
        return ResponseEntity.ok("From secure endpoint!");
    }

}
