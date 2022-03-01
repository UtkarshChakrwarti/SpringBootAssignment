package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/*
@Configuration – We use this annotation with the class
 for configuration purposes. For example,
 we can create a bean using @Bean annotation.
 The classes which are annotated with
 @Configuration annotation are automatically
 loaded by Spring while deployment. See more
  about @Configuration annotation here.

@EnableJpaRepositories – Used to enable
 JPA repositories. It has different attributes
 basePackages, basePackageClasses, includeFilters,
  excludeFilters etc.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.example.repository")
public class JpaConfig {

}
