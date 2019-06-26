package com.Semafoor.ToDoList.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/*
This class provides the configuration of our repositories, its marked as a configuration class by the @Configuration
annotation from the Spring context library. We use the standard configuration as provided by the
RepositoryRestConfigurer interface from Spring Data Rest.
 */

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
}
