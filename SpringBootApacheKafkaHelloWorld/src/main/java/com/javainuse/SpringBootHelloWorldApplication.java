package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootHelloWorldApplication.class }, args);
	}
}

/* https://stackoverflow.com/questions/15380125/cannot-add-a-project-to-a-tomcat-server-in-eclipse
* need to convert this project in to a project that can be deployed on a server
* follow above process
* http://kafka.apache.org/quickstart#quickstart_multibroker   settign up multi-node kafka cluster
*/