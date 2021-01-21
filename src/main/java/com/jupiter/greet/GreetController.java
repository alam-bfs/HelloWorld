package com.jupiter.greet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello There";
    }

}
