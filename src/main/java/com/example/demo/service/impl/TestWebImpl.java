package com.example.demo.service.impl;

import com.example.demo.service.TestWeb;

import javax.jws.WebMethod;
import javax.jws.WebService;

public class TestWebImpl implements TestWeb {

    @WebMethod
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}