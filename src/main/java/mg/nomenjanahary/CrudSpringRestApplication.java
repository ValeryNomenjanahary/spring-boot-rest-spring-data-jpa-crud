package mg.nomenjanahary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import mg.nomenjanahary.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"mg.nomenjanahary"})
public class CrudSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringRestApplication.class, args);
	}
}
