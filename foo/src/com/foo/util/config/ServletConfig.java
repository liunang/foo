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
@ComponentScan("com.foo.cms.web")//�������ɨ��
public class ServletConfig extends WebMvcConfigurerAdapter{
	//����JSP��ͼ������
	//TODO �Ƿ�������������ͼ����html...�ȵ�)��������������
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver =
				new InternalResourceViewResolver();
		//�����ض���ǰ׺�ͺ�׺���ڲ��ҵ�ʱ�򣬽�Ϊ��ͼ����ϸ�ǰ׺�ͺ�׺
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	//���þ�̬��Դ�Ĵ���
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		//����̬��Դ��������Ĭ������������������DispatcherServlet����
		configurer.enable();
	}
}
