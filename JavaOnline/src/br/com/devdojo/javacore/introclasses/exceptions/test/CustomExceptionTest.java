package br.com.devdojo.javacore.introclasses.exceptions.test;

import br.com.devdojo.javacore.introclasses.exceptions.customexception.LoginInvalidException;

public class CustomExceptionTest {

	public static void main(String[] args) {
		
		try {
			Login();
		} catch (LoginInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void Login() throws LoginInvalidException{
		String user = "Goku";
		String password = "111";
		String userTyped = "Goku";
		String passwordTyped = "123";
		if(!user.equals(userTyped) || !password.equals(passwordTyped)) {
			throw new LoginInvalidException();
		}
	}

}
