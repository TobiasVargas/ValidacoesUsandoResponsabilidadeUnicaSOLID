package br.com.cloudstock.products.validation.impl;

import br.com.cloudstock.products.validation.TestValidation;
import org.springframework.stereotype.Service;

@Service
public class Test02Validation implements TestValidation {
    @Override
    public void validate(String name) {
        System.out.println(name);
        System.out.println("02\n");
    }
}
