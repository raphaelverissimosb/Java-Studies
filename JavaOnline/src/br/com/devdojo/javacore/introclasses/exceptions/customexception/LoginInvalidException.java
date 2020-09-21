package br.com.devdojo.javacore.introclasses.exceptions.customexception;

public class LoginInvalidException extends Exception {
	
	
	public LoginInvalidException () {
		super("User or invalid password");
	}
}
