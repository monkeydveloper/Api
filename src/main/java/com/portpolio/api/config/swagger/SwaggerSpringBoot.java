package com.portpolio.api.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@ComponentScan("com.portfolio.api.mvc.controller")
public class SwaggerSpringBoot {

	@Bean
	  public Docket petApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	          .apis(RequestHandlerSelectors.any())
	          .paths(PathSelectors.any())
	          .build();
//	        .pathMapping("/")
//	        .directModelSubstitute(LocalDate.class, String.class)
//	        .genericModelSubstitutes(ResponseEntity.class)
//	        .alternateTypeRules(
//	            newRule(typeResolver.resolve(DeferredResult.class,
//	                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
//	                typeResolver.resolve(WildcardType.class)))
//	        .useDefaultResponseMessages(false)
//	        .globalResponseMessage(RequestMethod.GET,
//	            newArrayList(new ResponseMessageBuilder()
//	                .code(500)
//	                .message("500 message")
//	                .responseModel(new ModelRef("Error"))
//	                .build()))
//	        .securitySchemes(newArrayList(apiKey()))
//	        .securityContexts(newArrayList(securityContext()))
//	        .enableUrlTemplating(true)
//	        .globalOperationParameters(
//	            newArrayList(new ParameterBuilder()
//	                .name("someGlobalParameter")
//	                .description("Description of someGlobalParameter")
//	                .modelRef(new ModelRef("string"))
//	                .parameterType("query")
//	                .required(true)
//	                .build()))
//	        .tags(new Tag("Pet Service", "All apis relating to pets")) 
//	        .additionalModels(typeResolver.resolve(AdditionalModel.class)) 
//	        ;
	  }

//	  @Autowired
//	  private TypeResolver typeResolver;
//
//	  private ApiKey apiKey() {
//	    return new ApiKey("mykey", "api_key", "header");
//	  }
//
//	  private SecurityContext securityContext() {
//	    return SecurityContext.builder()
//	        .securityReferences(defaultAuth())
//	        .forPaths(PathSelectors.regex("/anyPath.*"))
//	        .build();
//	  }
//
//	  List<SecurityReference> defaultAuth() {
//	    AuthorizationScope authorizationScope
//	        = new AuthorizationScope("global", "accessEverything");
//	    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//	    authorizationScopes[0] = authorizationScope;
//	    return newArrayList(
//	        new SecurityReference("mykey", authorizationScopes));
//	  }
//
//	  @Bean
//	  SecurityConfiguration security() {
//	    return SecurityConfigurationBuilder.builder()
//	        .clientId("test-app-client-id")
//	        .clientSecret("test-app-client-secret")
//	        .realm("test-app-realm")
//	        .appName("test-app")
//	        .scopeSeparator(",")
//	        .additionalQueryStringParams(null)
//	        .useBasicAuthenticationWithAccessCodeGrant(false)
//	        .build();
//	  }
//
//	  @Bean
//	  UiConfiguration uiConfig() {
//	    return UiConfigurationBuilder.builder()
//	        .deepLinking(true)
//	        .displayOperationId(false)
//	        .defaultModelsExpandDepth(1)
//	        .defaultModelExpandDepth(1)
//	        .defaultModelRendering(ModelRendering.EXAMPLE)
//	        .displayRequestDuration(false)
//	        .docExpansion(DocExpansion.NONE)
//	        .filter(false)
//	        .maxDisplayedTags(null)
//	        .operationsSorter(OperationsSorter.ALPHA)
//	        .showExtensions(false)
//	        .tagsSorter(TagsSorter.ALPHA)
//	        .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
//	        .validatorUrl(null)
//	        .build();
//	  }
//
//	}
}
