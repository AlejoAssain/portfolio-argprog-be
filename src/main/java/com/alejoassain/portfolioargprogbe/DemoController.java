package com.alejoassain.portfolioargprogbe;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> example() {
        return ResponseEntity.ok("Hello from secret endpoint");
    }
}
