package idv.matt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "idv.matt.controller, idv.matt.aop" })
public class MoneynoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneynoteApplication.class, args);
	}

}
