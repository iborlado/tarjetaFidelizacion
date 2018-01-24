package com.curso.spring.tarjeta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

	//fichero de configuracion Java config
	@Configuration
	//importa los beans basicos webmvc de spring para su posible reconfiguracion 
	@EnableWebMvc
	@ComponentScan(basePackages="com.curso.spring.mvc")
	public class ConfiguracionWeb extends WebMvcConfigurationSupport { //implements WebMvcConfigurer
		//añadir recursos estaticos
		@Override
		protected void addResourceHandlers(ResourceHandlerRegistry registry) {
			// TODO Auto-generated method stub
			super.addResourceHandlers(registry);
			
			registry.addResourceHandler("/css/**").addResourceLocations("/css/");
			registry.addResourceHandler("/img/**").addResourceLocations("/img/");
			registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		}
		
		
		@Bean
		public View miVista() {
			return new InternalResourceView("/WEB-INF/jsps/index.jsp");
		}
		

		@Bean
		public View otraVista() {
			return new InternalResourceView("/WEB-INF/jsps/otra.jsp");
		}
		
		@Bean
		public ViewResolver beanNameViewResolver() {
			BeanNameViewResolver viewResolver = new BeanNameViewResolver();
			viewResolver.setOrder(1);
			return viewResolver;
		}

		@Bean
		public ViewResolver internalResourceViewResolver() {
			return new InternalResourceViewResolver("/WEB-INF/jsps/", ".jsp");
		}

		@Override
		protected void addViewControllers(ViewControllerRegistry registry) {
			// TODO Auto-generated method stub
			super.addViewControllers(registry);
			
			registry.addViewController("/formulario").setViewName("formulario");
		}
		//se crea la vista formulario
		@Bean
		public View formulario(){
			return new InternalResourceView("/WEB-INF/jsps/index.jsp");
		}
		
		
//		@Bean
//		@RequestScope
//		public String[] generos(){
//			return new String[]{"Masculino","Femenino"};
//		}
	}

