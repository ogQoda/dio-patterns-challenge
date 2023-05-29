package acme.patterns.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Foram adicionados os módulos a seguir:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author ogqoda
 */
@EnableFeignClients
@SpringBootApplication
public class DesignPatternsSampleGofApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsSampleGofApplication.class, args);
	}

}
