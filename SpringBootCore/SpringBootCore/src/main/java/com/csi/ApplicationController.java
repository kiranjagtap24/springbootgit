package com.csi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @GetMapping
    public String sayHello(){
        return "Welcome to CSI PUNE!!";
    }

    @GetMapping("/services")
    public String services(){
        return "Software Development";
    }
    @GetMapping("/address")
    public String addressnew(){
        return "Inspiria Mall|Pune";
    }
}

