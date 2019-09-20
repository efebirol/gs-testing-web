package hello;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


/**
 * @author Efe
 *         - Info: Rufe hier im speziellen den GreetingController auf
 */


@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class WebMockTest
{

  @Autowired
  private MockMvc mockMvc;

  // erzeuge und injiziere hier nur den Service (enthält die Methode)
  @MockBean
  private GreetingService service;

  @Test
  public void greetingShouldReturnMessageFromService() throws Exception
  {
    // Mocke (=simuliere) die Methode im Service
    when(service.greet()).thenReturn("Hello Mock");
    this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello Mock")));
  }
}
