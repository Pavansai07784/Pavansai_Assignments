package com.springboot_Q3.springboot_Q3;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    Servicethird service;
    @RequestMapping("/details/{id}")
    public Details getDetails(@PathVariable Integer id)
    {
        return service.getDetails(id);
    }
}
