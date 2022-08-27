package com.demo.UserAuthenticate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {
   
	
	private UserLogin login;
	
	@BeforeEach
	public void setup() {
		login= new UserLogin();
		System.out.println("Login Initiated");
	}
	
	@AfterEach
	public void tearDown() {
		login=null;
		System.out.println("Login Closed");
	}
	@Test
	public void bothcorrect() {
		 assertEquals(true,login.auth("alli","pwd"));
	}
	
	@Test
	public void WrongUsername() {
		 assertEquals(false,login.auth("my","pwd"));
		
	}
	
	@Test
	public void WrongPassword() {
		 assertEquals(false,login.auth("alli","pass"));
	}
	
	@Test 
	public void bothIncorrect() {
		 assertEquals(false,login.auth("admin","pass"));
	}

	@Test
	 public void trueAssert() {
		 assertTrue(login.auth("alli","pwd"));
	}
	@Test
	 public void falseAssert() {
		 assertFalse(login.auth("alli","passwrd"));
	}
	
}