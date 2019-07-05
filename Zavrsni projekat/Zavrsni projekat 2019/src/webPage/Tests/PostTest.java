package webPage.Tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;
import webPage.Objects.DashboardPage;
import webPage.Objects.Post;

public class PostTest {
	
	// Make a new post manually by user
	public static void newPostManually(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		// Make a post button
		DashboardPage.clickMakeAPostButton(dr);

		// Title
		System.out.println("Enter Title: ");
		Post.clickNaziv(dr);
		String naziv = sc.nextLine();
		Post.sendKeysNaziv(dr, naziv);

		// Location
		System.out.println("Location");
		Post.clickLokacija(dr);
		String lokacija = sc.nextLine();
		Post.sendKeysLokacija(dr, lokacija);
			
		// Image
		Post.sendKeysImg(dr);

		// Transport
		System.out.println("Choose transport by typing one of these: Walk, Car, Motorbike, Bicycle or Bus");
		String prevoz = sc.nextLine();
		Post.selectPrevoznoSr(dr, prevoz);
		
		// Description
		System.out.println("Post Description");
		Post.clickOpis(dr);
		String opis = sc.nextLine();
		Post.sendKeysOpis(dr, opis);

		// Submit
		Post.clickPostButton(dr);
		}
	
	// Make a post using data from Excel file
	public static void newPostExcell(WebDriver dr, int i, String str) throws Exception {
		
		String data;
		
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,Constant.SHEET2_NAME);

		// Make a post Button
		DashboardPage.clickMakeAPostButton(dr);

		// Title
		Post.clickNaziv(dr);
		data = ExcelUtils.getCellData(i, 1);
		Post.sendKeysNaziv(dr, data);

		// Location
		Post.clickLokacija(dr);
		data = ExcelUtils.getCellData(i, 2);
		Post.sendKeysLokacija(dr, data);
		
		// Image
		Post.sendKeysImg(dr);

		// Transport
		Post.selectPrevoznoSr(dr, str);

		// Description
		Post.clickOpis(dr);
		data = ExcelUtils.getCellData(i, 0);
		Post.sendKeysOpis(dr, data);

		// Submit
		Post.clickPostButton(dr);
			
	}
	
	// Make posts using all data from Excel file
	public static void postsAllData(WebDriver dr, String str) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET2_NAME);

			
		for (int i = 1; i<ExcelUtils.getWorkSheet().getLastRowNum()+1; i++){
					newPostExcell(dr, i, str);
		}
			
	}
}
