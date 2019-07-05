package webPage.Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditAndDelete {
	
	public static final String URL = "http://localhost/izlet/dashboard.php";
	
	private static final String POSTS = "posts"; 
	private static final String MORE = "fa-ellipsis-v";
	private static final String EDIT = "fa-edit";
	private static final String DELETE = "fa-trash-alt";
	
	private static final String EDIT_NAZIV = "//input[@id='title']";
	private static final String EDIT_LOKACIJA = "//input[@id='location']";
	private static final String EDIT_PRSREDSTVO = "//select[@id='transport']";
	private static final String EDIT_OPIS = "//textarea[@id='description']";
	private static final String EDIT_POST_BUTTON = "//div[@class='popupEdit']//input[@name='postSubmit']";
	
		// Method to find Post to Edit/Delete
		public static WebElement getPostToEdit(WebDriver dr, int n) {
			List<WebElement> list = dr.findElements(By.className(POSTS));
			WebElement wb = list.get(n);
			return wb;
		}
		
		// Method to click on Post to Edit/Delete
		public static void clickPostToEdit(WebDriver dr, int n) {
			getPostToEdit(dr, n).click();
		}
		
		// Method to find More options button
		public static WebElement getMore(WebDriver dr, int i) {
			clickPostToEdit(dr, i);
			List<WebElement> list = dr.findElements(By.className(MORE));
			WebElement wb = list.get(i);
			return wb;
		}
		
		// Method to click More options button
		public static void clickMore(WebDriver dr, int i) {
			getMore(dr, i).click();
		}

	
		// Method to find Edit element
		public static WebElement getEdit(WebDriver dr, int i) {
			clickMore(dr, i);
			List<WebElement> list = dr.findElements(By.className(EDIT));
			WebElement wb = list.get(i);
			return wb;
		}
		
		// Method to click Edit post
		public static void clickEdit(WebDriver dr, int i) {
			getEdit(dr, i).click();
		}
		
		
		// Method to find Delete button
		public static WebElement getDelete(WebDriver dr, int i) {
			List<WebElement> list = dr.findElements(By.className(DELETE));
			WebElement wb = list.get(i);
			return wb;
		}
		
		// Method to click Delete
		public static void clickDelete(WebDriver dr, int i) {
			getDelete(dr, i).click();
		}
		
		
		// Method to find Post title field 
		public static WebElement getEditNaziv(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(EDIT_NAZIV));
			return wb;
		}

		// Method to click on the title field to edit
		public static void clickEditNaziv(WebDriver dr) {
			getEditNaziv(dr).click();
		}

		// Method to set edited Post title
		public static void sendKeysEditNaziv(WebDriver dr, String str) {
			getEditNaziv(dr).sendKeys(str);
		}
		
		// Method to find Location field 
		public static WebElement getEditLokacija(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(EDIT_LOKACIJA));
			return wb;
		}

		// Method to click on Location field to edit
			public static void clickEditLokacija(WebDriver dr) {
			getEditLokacija(dr).click();
		}

		// Method to set edited Location
		public static void sendKeysEditLokacija(WebDriver dr, String str) {
			getEditLokacija(dr).sendKeys(str);
		}
		
		
		// Method to find Transport dropdown menu
		public static WebElement getSelect(WebDriver dr) {
			WebElement wb=dr.findElement(By.xpath(EDIT_PRSREDSTVO));
			return wb;
		}
		
		// Method to select and edit Transport from dropdown menu
		public static void selectPrSredstvo(WebDriver dr, String str) {
			Select sel = new Select(getSelect(dr));
			sel.selectByVisibleText(str);
		}
		
		// Method to find Description field to edit
		public static WebElement getEditOpis(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(EDIT_OPIS));
			return wb;
		}

		// Method to click Description field to edit
		public static void clickEditOpis(WebDriver dr) {
			getEditOpis(dr).click();
		}

		// Method to set edited Description
		public static void sendKeysEditOpis(WebDriver dr, String str) {
			getEditOpis(dr).sendKeys(str);
		}
		
		// Method to find Post button
		public static WebElement getEditPostButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(EDIT_POST_BUTTON));
			return wb;
		}

		// Method to click Edit post button
		public static void clickEditPostButton(WebDriver dr) {
			getEditPostButton(dr).click();
		}

}
