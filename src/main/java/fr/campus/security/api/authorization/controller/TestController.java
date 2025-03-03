package fr.campus.security.api.authorization.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/first")
    public String doTry() {
        return "test";
    }

    @GetMapping("/user")
    public String doUser() {
        return "user";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public String doAdmin(){
        return "admin";
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/verified")
    public String doUserVerified(){
        return "verified";
    }
}
