package sauceTest;

import org.testng.annotations.Test;

import sauce.LoginPage;
import utils.BaseTest;

public class LoginPageTest extends BaseTest{
	@Test
	public void loginTest() {
		new LoginPage(driver).login("standard_user", "secret_sauce");
	}

}
