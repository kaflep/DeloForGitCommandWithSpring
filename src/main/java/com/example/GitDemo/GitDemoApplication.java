package com.example.GitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitDemoApplication {
	private static final String REST_URL = "https://www.equifax.com/getScores";

	public static void main(String[] args) {

		ConfigurableApplicationContext run =  SpringApplication.run(GitDemoApplication.class, args);
		// changes for HIS-134

		int a = 10;
		 run.close();
	}

}
