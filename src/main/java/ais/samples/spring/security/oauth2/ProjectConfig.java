package ais.samples.spring.security.oauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

/**
 * @author Mostafa Kalantar (kalantar@caspco.ir)
 * @version 1.0 2020.0926
 * @since 1.0
 */
@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
  private ClientRegistration clientRegistration() {
    return CommonOAuth2Provider.GITHUB
        .getBuilder("github")
        .clientId("922c621f13ec72399e2e")
        .clientSecret("ffdfd2fd01307cd7793927bf3ac6b679ab6bc53f")
        .build();
  }

  @Bean
  public ClientRegistrationRepository clientRepository() {
    return new InMemoryClientRegistrationRepository(clientRegistration());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.oauth2Login();

    http.authorizeRequests()
        .anyRequest()
        .authenticated();
  }
}
