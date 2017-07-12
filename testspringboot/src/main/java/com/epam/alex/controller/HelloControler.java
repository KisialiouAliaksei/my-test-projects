package com.epam.alex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aliaksei_Kisialiou on 7/12/2017.
 */

@RestController
public class HelloControler {

    @RequestMapping("/rest")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
