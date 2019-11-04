package templates.starter;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication
@ComponentScan({"templates.service"})
public class TemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplatesApplication.class, args);
	}


}
