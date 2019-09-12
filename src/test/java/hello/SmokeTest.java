package hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    //bindet/injekted die "HomeController"-Bean ein
    @Autowired
    private HomeController controller;

    /*
     * Prüfe ob Controller-Bean geladen ist
     */
    @Test
    public void contexLoads() throws Exception {
        //AssertJ-Methode
        assertThat(controller).isNotNull();
    }
}