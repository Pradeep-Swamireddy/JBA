package com.jba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

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
	UrlBasedViewResolver ur = new UrlBasedViewResolver();
	ur.setViewClass(TilesView.class);
	return ur;
}

@Bean
TilesConfigurer tilesConfigurer()
{
	TilesConfigurer t = new TilesConfigurer();
	t.setDefinitions("/WEB-INF/defs/general.xml");
	return t;
}

}
