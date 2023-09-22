package com.in28minutes.springfreamwork.examples.prePost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass{
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency){
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are ready!");
	}
	@PostConstruct
	public void initialize(){
		SomeDependency.getReady();
	}

	@PreDestroy
	public void cleanup(){
		System.out.println("Clean UP");
	}
}


@Component
class SomeDependency{
	public static void getReady(){
		System.out.println("Some Logic using Some Dependency");
	}
}
@Configuration
@ComponentScan
public class PerPostContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PerPostContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
