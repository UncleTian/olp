<<<<<<< HEAD
package com.bea.olp.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AntApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntApplication.class, args);
	}
}
=======
package com.bea.olp.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AntApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntApplication.class, args);
	}
}
>>>>>>> 77b1dbcdb3cd3cd0d870cb332f50c0935ac5c090
