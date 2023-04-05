package br.com.project.viacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViacepApplication.class, args);
	}

}
