package sauceTest;

import org.testng.annotations.Test;

import sauce.LoginPage;
import setup.BaseTest;
import utils.DataInjectionIntern;
import utils.CSVUtils;

public class LoginPageTest extends BaseTest {
//	@Test(dataProvider = "userData", dataProviderClass = DataInjectionIntern.class)
//	public void loginWithUserData(String username, String password) {
//		new LoginPage(driver).login(username, password);
//	}

	@Test(dataProvider = "csvData", dataProviderClass = CSVUtils.class)
	public void loginWithCsvData(String username, String password) {
		new LoginPage(driver).login(username, password);
	}
}