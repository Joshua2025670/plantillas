package com.upiiz.plantillas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {
    // De las plantillas buscar
    // La carpeta css
    // La carpeta js
    // La carpeta de plugins
    // http://localhost:8080/auth/login
    // http://localhost:8080/auth/register
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/forgot-password")
    public String forgotp() {
        return "forgot-password";
    }
}