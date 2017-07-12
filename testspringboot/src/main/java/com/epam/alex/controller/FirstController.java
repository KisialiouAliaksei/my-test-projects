package com.epam.alex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Aliaksei_Kisialiou on 7/12/2017.
 */

@Controller
public class FirstController {

    @RequestMapping("/hello")
    public String showHelloWorld() {
        return "hello-world";
    }
}
