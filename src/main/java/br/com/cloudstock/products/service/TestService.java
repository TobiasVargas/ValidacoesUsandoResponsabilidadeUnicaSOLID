package br.com.cloudstock.products.service;

import br.com.cloudstock.products.validation.TestValidation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final List<TestValidation> validations;

    public TestService(List<TestValidation> validations) {
        this.validations = validations;
    }

    public void test(String name) {
        this.validations.forEach((validation) -> {
            validation.validate(name);
        });
    }
}
