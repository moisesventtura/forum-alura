package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

	/**
	 * Foi criado um outro projeto chamado Spring Boot Admin para monitorar o projeto forum.
	 * O projeto citado não foi colocado no GitHub.
	 *
	 * @Version 1.0
	 */

}
