package hu.bankmonitor.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MortgageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MortgageApplication.class, args);
	}

}
