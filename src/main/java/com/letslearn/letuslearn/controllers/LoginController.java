package com.letslearn.letuslearn.controllers;

import com.letslearn.letuslearn.model.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @PostMapping("/login")
    public Login login(@RequestBody Login login){
        System.out.println(login.getUserName());
        login.setStatus(true);
        return login;
    }

    @GetMapping("/status")
    public String test(){
        return "Success";
    }
}
