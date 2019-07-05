package webPage.Objects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LogIn {

		public static final String URL = "http://localhost/izlet/index.php";
		private static final String USERNAME = "//input[@placeholder='username']";
		private static final String PASS = "//input[@placeholder='password']";
		private static final String LOGIN = "//input[@name='login']";

		
		// Login username
		public static WebElement getUsername(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(USERNAME));
			return wb;
		}

		public static void clickUsername(WebDriver dr) {
			getUsername(dr).click();
		}

		public static void sendKeysUsername(WebDriver dr, String str) {
			getUsername(dr).sendKeys(str);
		}

		// Login password
		public static WebElement getPassword(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(PASS));
			return wb;
		}

		public static void clickPassword(WebDriver dr) {
			getPassword(dr).click();
		}

		public static void sendKeysPassword(WebDriver dr, String str) {
			getPassword(dr).sendKeys(str);
		}

		// Login button
		public static WebElement getLogInButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(LOGIN));
			return wb;
		}

		public static void clickLogInButton(WebDriver dr) {
			getLogInButton(dr).click();
		}

		// Navigate to Page
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(URL);
		}

	

}
