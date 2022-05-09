package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFirstDemo 
{
	@GetMapping("/")
public String helloFirstDemo()
{
	return "Hello World";
}
}
