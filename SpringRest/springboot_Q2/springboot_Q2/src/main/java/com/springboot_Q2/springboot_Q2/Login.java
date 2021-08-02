package com.springboot_Q2.springboot_Q2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class Login {

    public String validate(String user,String pass)
    {
        if(user.equals("pavan")&&pass.equals("123456"))
        {
            return "valid";
        }
        else
        {
            return "invalid";
        }

    }

}