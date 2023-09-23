
package com.in28minutes.springfreamwork.examples.xmlConfig;

import com.in28minutes.springfreamwork.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class XMLConfigurationContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("name"));
			context.getBean(GameRunner.class).run();
		}
	}
}
