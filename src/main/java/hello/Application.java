package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Info: Bauen und starten mit Maven
 * - Entweder mit Befehl "mvn spring-boot:run"
 * - oder "mvn clean package" und dann "java -jar build/libs/gs-testing-web-0.1.0.jar"
 */


// Startpoint for the Spring Boot Application
@SpringBootApplication
public class Application
{

  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
  }
}
