package com.person_information.jhonny;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
    @GetMapping("/")
    public String SayHello()
    {
        return "Hello World";
    }
}