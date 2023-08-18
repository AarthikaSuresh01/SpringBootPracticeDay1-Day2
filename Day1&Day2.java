package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueFromProperty {
@Value("${prop}")
private String myProperty;
@GetMapping("/aart")
public String display() {
	return myProperty+" is a good girl";
}
}
