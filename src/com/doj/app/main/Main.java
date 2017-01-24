/**
 * 
 */
package com.doj.app.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.doj.app.TokenMachine;
import com.doj.app.config.AppConfig;

/**
 * @author Dinesh.Rajput
 *
 */
public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TokenMachine machine = context.getBean(TokenMachine.class);
		machine.findToken();
		machine = context.getBean(TokenMachine.class);
		machine.findToken();
		context.close();
	}
}
