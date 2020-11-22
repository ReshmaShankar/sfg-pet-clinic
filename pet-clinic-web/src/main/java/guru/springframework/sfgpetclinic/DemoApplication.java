package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.config.DatabaseSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		DatabaseSource databaseSource = (DatabaseSource) context.getBean(DatabaseSource.class);
		System.out.println("User ----> "+databaseSource.getUser());
		System.out.println("Password ----> "+databaseSource.getPassword());
		System.out.println("URL ----> "+databaseSource.getUrl());
	}

}
