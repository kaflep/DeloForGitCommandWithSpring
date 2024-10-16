package com.example.GitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitDemoApplication {
private Map<String,Object> cache = new HashMap<String, Object>();

	public static void main(String[] args) {

		ConfigurableApplicationContext run =  SpringApplication.run(GitDemoApplication.class, args);
		// changes for HIS-134

		int a = 10;
		 run.close();
	}
	//HIS-301 changes
 	public void loadDataToCache(){
	//logic

}

}
