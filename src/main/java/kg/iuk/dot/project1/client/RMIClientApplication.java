package kg.iuk.dot.project1.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RMIClientApplication {
  public static void main(String... args) {
    SpringApplication.run(RMIClientApplication.class, args);
  }
}
