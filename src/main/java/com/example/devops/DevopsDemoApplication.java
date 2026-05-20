package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DevopsDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

	@GetMapping("")
	public String greeting(){
		return "<h2>Hello World</h2>";
	}

}
