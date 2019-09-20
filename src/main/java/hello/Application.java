package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Quelle: https://spring.io/guides/gs/testing-web/
 * Info: Bauen und starten mit Maven
 * - Entweder mit Befehl "mvn spring-boot:run"
 * - oder "mvn clean package" und dann "java -jar build/libs/gs-testing-web-0.1.0.jar"
 * - bauen alles über Annotation (anstelle von .XML, wie z. B. web.xml)
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
