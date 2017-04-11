package com.foo.util.config;

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
@ComponentScan("com.foo.cms.web")//启动组件扫描
public class ServletConfig extends WebMvcConfigurerAdapter{
	//配置JSP视图解析器
	//TODO 是否能配置其他视图（如html...等等)，后续进行试验
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver =
				new InternalResourceViewResolver();
		//配置特定的前缀和后缀，在查找的时候，将为视图添加上该前缀和后缀
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	//配置静态资源的处理
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		//将静态资源的请求由默认容器处理，而不是由DispatcherServlet处理
		configurer.enable();
	}
}
