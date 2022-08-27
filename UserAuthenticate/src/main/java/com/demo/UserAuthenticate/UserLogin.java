package com.demo.UserAuthenticate;

public class UserLogin{
	
	public boolean auth(String userid,String password) {
		if(userid=="alli"& password=="pwd") {
			return true;
		}
		else {
			return false;
		}
	}
}