package com.example.GitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run =  SpringApplication.run(GitDemoApplication.class, args);
		// changes for HIS-134
		 run.close();
	}

}
