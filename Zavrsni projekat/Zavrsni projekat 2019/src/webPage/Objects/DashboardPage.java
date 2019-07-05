package webPage.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	public static final String URL = "http://localhost/izlet/dashboard.php";
	private static final String MAKE_A_POST = "//a[contains(text(),'Make a post')]";
	private static final String LOGOUT = "//a[@id='logoutBtn']";

	
	// Method to find Make a post button
		public static WebElement getMakeAPostButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(MAKE_A_POST));
			return wb;
		}

		public static void clickMakeAPostButton(WebDriver dr) {
			getMakeAPostButton(dr).click();
		}

	//Method for logging out
		public static WebElement getLogoutButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(LOGOUT));
			return wb;
		}
		public static void clickLogout(WebDriver dr) {
			getLogoutButton(dr).click();
		}
		
	// Navigate to page
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(URL);
		}
}
