package fr.campus.security.api.authorization.controller;

import fr.campus.security.api.authorization.dto.TokenDto;
import fr.campus.security.api.authorization.dto.UserCredentialsDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public String signup(@RequestBody UserCredentialsDto userCredentialsDto) {
        return "success";
    }

    @PostMapping("/login")
    public TokenDto login(@RequestBody UserCredentialsDto userCredentialsDto) {
        return new TokenDto( "token", "username");
    }

}
