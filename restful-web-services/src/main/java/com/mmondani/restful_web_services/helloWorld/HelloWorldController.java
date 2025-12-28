package com.mmondani.restful_web_services.helloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean () {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable (@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world %s", name));
    }
}
