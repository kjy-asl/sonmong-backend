package poten012.sonmong.Poten403;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Poten403Application {

	public static void main(String[] args) {
		SpringApplication.run(Poten403Application.class, args);
	}

}
