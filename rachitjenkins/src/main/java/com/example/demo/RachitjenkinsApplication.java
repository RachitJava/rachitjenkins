package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class RachitjenkinsApplication {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello Rachit Jenkins Sabre-Infosys team";
	}

	public static void main(String[] args) {
		SpringApplication.run(RachitjenkinsApplication.class, args);
	}

}
