package org.xian1.cicd.controller;
import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public String getMessage() {
        return "Hello, this is a message from the MessageController!";
    }
}
