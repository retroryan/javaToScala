package javaToScala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * The application configuration.
 */
@Configuration
class AppConfiguration {

  @Autowired
  private ApplicationContext applicationContext;


}
