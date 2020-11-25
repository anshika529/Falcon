package com.atmecs.falconproject;

import org.testng.annotations.Test;

import com.atmecs.falconproject.testscript.Signuppage;


public class SignUpTest {
	@Test(priority = 1)
	public void signup() {
		Signuppage sp = new Signuppage();
		sp.signupactions();
	}

}
