import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boot.*"})
@EntityScan(basePackages = {"com.boot.*"})
@EnableJpaRepositories(basePackages = {"com.boot.*"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
