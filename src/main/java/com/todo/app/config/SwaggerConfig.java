package com.todo.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public static final String todoControllerTag = "TODO";
  public static final String userControllerTag = "USER";

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        .tags(new Tag(todoControllerTag,
            "Endpoint for creating, deleting, updating and querying TODOS")
        )
        .tags(new Tag(userControllerTag, "Endpoint for creating, deleting, querying user related info"))
        .apiInfo(getApiInfo());
  }

  private ApiInfo getApiInfo() {
    return new ApiInfo(
        "Todo Application",
        "This a todo application on a rest server",
        "V1",
        "",
        new Contact("Igor", "", "igorgfidler@hotmail.com"),
        "",
        "",
        Collections.emptyList()
    );
  }
}
