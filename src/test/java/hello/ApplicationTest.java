package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/*
 * Info: run with maven
 * - Code (Terminal): "mvn test"
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest
{

  protected final Logger log = LoggerFactory.getLogger(getClass());


  @Test
  public void contextLoads() throws Exception
  {
    log.info("-- ApplicationTest.java - contextLoads()- Haupttestklasse. Ausführen mit 'mvn test'");
  }

}
