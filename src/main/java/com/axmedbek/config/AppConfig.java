package com.axmedbek.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.axmedbek")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {


    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setPrefix("/views/");
        view.setSuffix(".jsp");
        return view;
    }


    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/assets/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/assets/css/");
    }
}
