package webPage.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static final String URL = "http://localhost/izlet/index.php";
	public static final String URL_GALLERY = "http://localhost/izlet/gallery.php";
	private static final String GALLERY = "//nav[@class='main-nav']//a[@class='a_bold'][contains(text(),'Galerija')]";
	private static final String BACK = "//a[@class='myButton']";
	
		// Open page
		public static void openPage(WebDriver dr) {
			dr.get(URL);
		}
		// Open Gallery
		public static WebElement getGalleryButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(GALLERY));
			return wb;
		}

		public static void clickGalleryButton(WebDriver dr) {
			getGalleryButton(dr).click();
		}
		
		
		// Back button from Gallery to Main page
		public static WebElement getBackButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(BACK));
					return wb;
		}

		public static void clickBackButton(WebDriver dr) {
					getBackButton(dr).click();
		}
		
		
		// Navigate to Page
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(URL);
		}
		
}
