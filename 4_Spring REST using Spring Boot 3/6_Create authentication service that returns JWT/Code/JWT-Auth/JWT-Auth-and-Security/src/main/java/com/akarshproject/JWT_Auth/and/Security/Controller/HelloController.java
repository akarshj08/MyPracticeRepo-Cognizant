package com.akarshproject.JWT_Auth.and.Security.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/")
    public String greet()
    {
        return "Hello EveryOne";
    }
}