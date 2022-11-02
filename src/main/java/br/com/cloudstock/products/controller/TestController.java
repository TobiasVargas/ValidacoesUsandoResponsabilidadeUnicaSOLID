package br.com.cloudstock.products.controller;

import br.com.cloudstock.products.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        this.testService.test("validando...");
        return ResponseEntity.ok().build();
    }
}
