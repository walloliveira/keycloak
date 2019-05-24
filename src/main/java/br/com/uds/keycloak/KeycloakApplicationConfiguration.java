package br.com.uds.keycloak;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "br.com.uds")
@EnableAutoConfiguration
public class KeycloakApplicationConfiguration {
}
