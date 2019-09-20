package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController
{

  // wird automatisch instanziert/injected bei Aufruf
  private final GreetingService service;

  public GreetingController(GreetingService service)
  {
    this.service = service;
  }

  @RequestMapping("/greeting")
  public @ResponseBody String greeting()
  {
    return service.greet();
  }

}
