package com.springboot_Q2.springboot_Q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Login login;

    @RequestMapping("/valid/{user}/{pass}")
    public String validate(@PathVariable String user,String pass)
    {
        return login.validate("pavan","123456");
    }



}