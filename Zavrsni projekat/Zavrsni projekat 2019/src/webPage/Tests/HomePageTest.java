package webPage.Tests;

import org.openqa.selenium.WebDriver;

import webPage.Objects.HomePage;

public class HomePageTest {
	
	//Checking if we are on the right page
	public static void openPage(WebDriver dr) {
		if ( dr.getCurrentUrl().contains(HomePage.URL)) {
			System.out.println("You are on the home page");
		}
	}
	
	//Opening page Gallery
	public static void openGallery(WebDriver dr) {
		if (dr.getCurrentUrl().contains(HomePage.URL_GALLERY)) {
			System.out.println("You are in gallery");
		}
	}
	
	//Checking if Gallery back button works
	public static void goBackToHomePage(WebDriver dr) {
		HomePage.clickBackButton(dr);
		if (dr.getCurrentUrl().contains(HomePage.URL)) {
			System.out.println("You are back on Izlet home page");
		}
	}
}
