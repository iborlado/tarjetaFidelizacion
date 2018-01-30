package com.curso.spring.tarjeta.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
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
	@ComponentScan(basePackages="com.curso.spring.tarjeta")
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
		
		//internacionalizacion
		@Bean
		public MessageSource messageSource(){
			ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
			messageSource.setBasename("/WEB-INF/mensajes");
			
			return messageSource;
		}
				
		//se usa si en los metodos del controlador se devuelven View, en caso de String no se usaria
		@Bean
		public View miVista() {
			return new InternalResourceView("/WEB-INF/jsps/index.jsp");
		}
	
		//se registran todas las jsp
		@Bean
		public ViewResolver internalResourceViewResolver() {
			return new InternalResourceViewResolver("/WEB-INF/jsps/", ".jsp");
		}

		
		/*Se comenta porque en el controlador se devuelve un String con el nombre del jsp a mostrar
		 * @Override
		protected void addViewControllers(ViewControllerRegistry registry) {
			// TODO Auto-generated method stub
			super.addViewControllers(registry);
			
			registry.addViewController("/formulario").setViewName("formulario");
		}*/
		
		/*//se comenta porque con el internalREsourceViewResolver() se registran todas las jsps
		//se crea la vista formulario
		@Bean
		public View formulario(){
			return new InternalResourceView("/WEB-INF/jsps/formulario.jsp");
		}*/
		
		
	}

