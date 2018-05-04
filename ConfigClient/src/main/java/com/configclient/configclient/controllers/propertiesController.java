package com.configclient.configclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class propertiesController {

    @Value("${foo}")
    String foo;

    @Value("${democonfigclient.message}")
    String message;


    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

    @RequestMapping(value = "/his")
    public String his(){
        return message;
    }

}
