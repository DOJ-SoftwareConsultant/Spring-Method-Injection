/**
 * 
 */
package com.doj.app;

/**
 * @author Dinesh.Rajput
 *
 */
public abstract class TokenMachine {
	
	public void findToken(){
		System.out.println("Token has been generated "+generateToken());
	}
	public abstract Token generateToken();
	
}
