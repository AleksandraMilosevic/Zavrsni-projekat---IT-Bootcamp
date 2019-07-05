package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import webPage.Objects.HomePage;
import webPage.Tests.EditAndDeleteTest;
import webPage.Tests.HomePageTest;
import webPage.Tests.LoginTest;
import webPage.Tests.PostTest;
import webPage.Tests.RegistrationTest;

public class Main {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Selenium\\chromedriver.exe");
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
		
		try { 
			
			//Open page
			HomePage.openPage(driver);
			
			//Register one user manually
			RegistrationTest.fillFormManually(driver);
			
			//Login manually
			LoginTest.loginManually(driver);
			
			//Create new post manually
			PostTest.newPostManually(driver);
			
			//EDIT created post
			EditAndDeleteTest.editPostManually(driver, 0); 
			
			
			//Open page and maximize
			HomePage.openPage(driver);
			driver.manage().window().fullscreen();
			
			//Register all users from Excell
			RegistrationTest.testWithAllDataInExcel(driver);
			Thread.sleep(3000);
			
			//Login all registered users
			LoginTest.testLoginWithAllData(driver);
			
			//Login one user who will make new posts with all excell data
			LoginTest.fillLoginForm(driver, 5);
			PostTest.postsAllData(driver, "Car");
			
			//DELETE first two posts
			EditAndDeleteTest.deletePost(driver, 0); 
			EditAndDeleteTest.deletePost(driver, 0); 
			 
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			driver.quit();
		}
	}
}
