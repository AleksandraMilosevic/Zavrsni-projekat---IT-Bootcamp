package webPage.Tests;

import org.openqa.selenium.WebDriver;

import webPage.Objects.DashboardPage;
import webPage.Objects.HomePage;

public class DashboardPageTest {
	
	//Checking if logout button works
	public static void logout(WebDriver dr) {
		
		DashboardPage.clickLogout(dr);
		
		if (dr.getCurrentUrl().contains(HomePage.URL)) {
			System.out.println("Logout button works");
			
		}
	}
}
