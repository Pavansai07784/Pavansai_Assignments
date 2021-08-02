package com.springboot_Q1.springboot_Q1;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HelloworldController   
{  

@GetMapping(path="/helloworld")  
public String helloWorld()  
{  
return "Hello World";  
}  
}
