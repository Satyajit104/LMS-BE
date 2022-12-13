package com.LMS;

import java.time.LocalDateTime;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebSecurity
public class MyConfig implements WebMvcConfigurer{

	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        		.allowedOrigins("*")
        		.allowedMethods("POST","GET");
    }
	
//	@Bean
//	public MultipartConfigElement multipartConfigElement() {
//	    MultipartConfigFactory factory = new MultipartConfigFactory();
//	    factory.setMaxFileSize(DataSize.of(10, DataUnit.MEGABYTES));
//	    factory.setMaxRequestSize(DataSize.of(10, DataUnit.MEGABYTES));
	//    return factory.createMultipartConfig();
//	}
	
//	@Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//            http.
//            csrf().disable().
//            headers().frameOptions().deny();
//            return http.build();
//    }
	
}
