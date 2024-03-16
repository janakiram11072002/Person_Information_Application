package com.Person_Information.jhonny.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SampleController 
{
    @GetMapping("Hello")
    public String SayHello() {
        return new String("Hello");
    }
    
    
}
