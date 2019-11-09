package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;


@MapperScan(value = "com.atguigu.springboot.dao")
@SpringBootApplication
public class SpringBoot04WebRestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04WebRestfulcrudApplication.class, args);
	}

	@Bean
	public ViewResolver myViewReolver(){
		return new MyViewResolver();
	}

	//我们自己的视图解析器（Springmvc）
	public static class MyViewResolver implements ViewResolver{

		@Override
		public View resolveViewName(String viewName, Locale locale) throws Exception {
			return null;
		}
	}
}
