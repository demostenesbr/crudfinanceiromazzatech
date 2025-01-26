package io.github.crudfinanceiromazzatech.CrudFinanceiroMazzatech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class CrudFinanceiroMazzatechApplication {

    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudFinanceiroMazzatechApplication.class, args);
    }

}
