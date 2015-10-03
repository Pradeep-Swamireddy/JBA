package com.jba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.jba.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
@Override
public void configureDefaultServletHandling(
		DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
}

@Bean
ViewResolver viewResolver()
{
	InternalResourceViewResolver ir = new InternalResourceViewResolver();
	ir.setPrefix("/WEB-INF/views/");
	ir.setSuffix(".jsp");
	ir.setExposeContextBeansAsAttributes(true);
	return ir;
}
}
