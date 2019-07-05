package webPage.Objects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	
	public class Post {

		public static final String URL = "http://localhost/izlet/dashboard.php";
		public static final String IMG1_PATH = "C:\\Users\\Dell\\Desktop\\Zavrsni projekat\\Zavrsni projekat 2019\\lefkada.jpg";
		
		private static final String NAZIV = "//input[@placeholder='Naziv']";
		private static final String LOKACIJA = "//input[@placeholder='Lokacija']";
		private static final String BROWSE = "image"; //id
		private static final String PREVOZNOSR = "//div[@class='popupPost']//select[@name='transport']";
		private static final String OPIS = "//textarea[@placeholder='Opis']";
		private static final String POST = "//div[@class='popupPost']//input[@name='postSubmit']";
		

		// Post naziv
		public static WebElement getNaziv(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(NAZIV));
			return wb;
		}

		public static void clickNaziv(WebDriver dr) {
			getNaziv(dr).click();
		}

		public static void sendKeysNaziv(WebDriver dr, String str) {
			getNaziv(dr).sendKeys(str);
		}

		// Post lokacija
		public static WebElement getLokacija(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(LOKACIJA));
			return wb;
		}

		public static void clickLokacija(WebDriver dr) {
			getLokacija(dr).click();
		}

		public static void sendKeysLokacija(WebDriver dr, String str) {
			getLokacija(dr).sendKeys(str);
		}
		
		//Browse button
		public static WebElement getBrowseButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.id(BROWSE));
			return wb;
		}
		
		//Adding image
		public static void sendKeysImg(WebDriver dr) throws Exception {
			getBrowseButton(dr).sendKeys(IMG1_PATH);
			Thread.sleep(3000);
		}
		
		
		//Select Prevozno sredstvo
		public static WebElement getSelect(WebDriver dr) {
			WebElement wb=dr.findElement(By.xpath(PREVOZNOSR));
			return wb;
		}
		public static void selectPrevoznoSr(WebDriver dr,String prevoz) throws Exception {
			Select sel= new Select(getSelect(dr));
			sel.selectByVisibleText(prevoz);
			Thread.sleep(3000);
		}


		// Post opis
		public static WebElement getOpis(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(OPIS));
			return wb;
		}

		public static void clickOpis(WebDriver dr) {
			getOpis(dr).click();
		}

		public static void sendKeysOpis(WebDriver dr, String str) {
			getOpis(dr).sendKeys(str);
		}

		
		// Post button
		public static WebElement getPostButton(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(POST));
			return wb;
		}

		public static void clickPostButton(WebDriver dr) {
			getPostButton(dr).click();
		}

		
		// Navigate to page
		public static void navigateTo(WebDriver dr) {
			dr.navigate().to(URL);
		}


}
