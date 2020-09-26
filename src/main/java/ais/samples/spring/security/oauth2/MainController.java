package ais.samples.spring.security.oauth2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2020.0926
 * @since 1.0
 */
@Controller
public class MainController {
  private static final Logger log = LoggerFactory.getLogger(MainController.class);

  @GetMapping("/")
  public String main(OAuth2AuthenticationToken token) {
    log.info(String.valueOf(token.getPrincipal()));
    return "main.html";
  }
}
