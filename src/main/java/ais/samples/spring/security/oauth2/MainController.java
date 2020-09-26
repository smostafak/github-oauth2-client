package ais.samples.spring.security.oauth2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2020.0926
 * @since 1.0
 */
@Controller
public class MainController {

  @GetMapping("/")
  public String main() {
    return "main.html";
  }
}
