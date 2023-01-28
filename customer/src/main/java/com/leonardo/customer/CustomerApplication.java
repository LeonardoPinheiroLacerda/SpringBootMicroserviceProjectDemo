package com.leonardo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leonardo.shared.dto.FooDTO;

@SpringBootApplication
public class CustomerApplication {
    
    public static void main(String [] args) {
        SpringApplication.run(CustomerApplication.class, args);

        FooDTO foo = new FooDTO("aa", 0, 3.1f, "value4", false);
        System.out.println(foo);
    }

}
