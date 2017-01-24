/**
 * 
 */
package com.doj.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.doj.app.Token;
import com.doj.app.TokenMachine;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan("com.doj.app")
public class AppConfig {
	@Bean 
	public TokenMachine tokenMachine(){
		return new TokenMachine(){

			@Override
			public Token generateToken() {
				return new Token();
			}
			
		};
	}
}
