package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

              private static final String REST_URL ="https://www.equifax.com/getScores";

 public static void main(String[] args) {
  ConfigurableApplicationContext run=SpringApplication.run(SpringBootAppApplication.class, args);
	//changes for HIS-133
        run.close();
		 
}
    
 public void doprocess(){
 
  //HIS-212 Related changes here
  // logic here

}

}
