package webPage.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

		public static final String URL = "http://localhost/izlet/index.php";
		private static final String FIRSTNAME = "//input[@name='firstname']";
		private static final String LASTNAME = "//input[@name='lastname']";
		private static final String USERNAME = "//div[@class='register_form']//input[@name='username']";
		private static final String EMAIL = "//input[@name='email']";
		private static final String PASS = "//div[@class='register_form']//input[@name='password']";
		private static final String REGISTER = "//input[@id='blue_btn']";
		

		// Method to find a first name field
		public static WebElement getFirstName(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(FIRSTNAME));
			return wb;
		}
		
		// Method to click on a first name field
		public static void clickFirstName(WebDriver dr) {
			getFirstName(dr).click();
		}
		
		// Method to enter text and send it
		public static void sendKeysFirstName(WebDriver dr, String str) {
			getFirstName(dr).sendKeys(str);
		}

		// Last name
		public static WebElement getLastName(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(LASTNAME));
			return wb;
		}

		public static void clickLastName(WebDriver dr) {
			getLastName(dr).click();
		}

		public static void sendKeysLastName(WebDriver dr, String str) {
			getLastName(dr).sendKeys(str);
		}

		// Username
		public static WebElement getRegUsername(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(USERNAME));
			return wb;
		}

		public static void clickRegUsername(WebDriver dr) {
			getRegUsername(dr).click();
		}

		public static void sendKeysRegUsername(WebDriver dr, String str) {
			getRegUsername(dr).sendKeys(str);
		}

		// Email
		public static WebElement getEmail(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(EMAIL));
			return wb;
		}

		public static void clickEmail(WebDriver dr) {
			getEmail(dr).click();
		}

		public static void sendKeysEmail(WebDriver dr, String str) {
			getEmail(dr).sendKeys(str);
		}

		// Password
		public static WebElement getRegPassword(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(PASS));
			return wb;
		}

		public static void clickRegPassword(WebDriver dr) {
			getRegPassword(dr).click();
		}

		public static void sendKeysRegPassword(WebDriver dr, String str) {
			getRegPassword(dr).sendKeys(str);
		}

		// Register button
		public static WebElement getRegister(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(REGISTER));
			return wb;
		}

		public static void clickRegister(WebDriver dr) {
			getRegister(dr).click();
		}
		
		// Navigate to Page
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(URL);
		}

}
