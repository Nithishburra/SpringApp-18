package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

   private Map<String,Object> cache = new Map<String,Object>

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringBootAppApplication.class, args);
		//changes for HIS-133
		    run.close();
		 
		    
	}

      public void Datacache(){

      }

       public void Adddata(){
       
       String username ="hari";
}

}
