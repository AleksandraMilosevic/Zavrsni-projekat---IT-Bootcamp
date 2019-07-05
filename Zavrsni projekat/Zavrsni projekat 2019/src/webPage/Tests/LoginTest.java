package webPage.Tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import webPage.Objects.LogIn;
import utility.Constant;
import utility.ExcelUtils;
import webPage.Objects.DashboardPage;
import webPage.Objects.HomePage;
import webPage.Objects.LogIn;

public class LoginTest {
	
	//Entering data manually to login
	public static void loginManually(WebDriver dr) throws Exception {
	
		Scanner sc = new Scanner(System.in); 
		
		//Username
		System.out.println("Enter Username");	
		LogIn.clickUsername(dr);
		String username = sc.nextLine();
		LogIn.sendKeysUsername(dr,username);
	
		//Pass
		System.out.println("Enter Password");		
		LogIn.clickPassword(dr);
		String password = sc.nextLine();
		LogIn.sendKeysPassword(dr,password);
	
		//Submit
		LogIn.clickLogInButton(dr);
		
		if (dr.getCurrentUrl().equals(DashboardPage.URL)) {
			System.out.println("Log in successful.");
		} 
		else
			System.out.println("Log in wasn't successful, try again");
		}
	
	//Login using single row data from excel 
	public static void fillLoginForm(WebDriver dr,int i) throws Exception {
		
		String data;
		
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,Constant.SHEET1_NAME);
		
		//Username
		LogIn.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysUsername(dr, data);
		
		//Pass
		LogIn.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysPassword(dr, data);
		
		//Submit
		LogIn.clickLogInButton(dr);
	}
	
	//Login using multiple data from excel (one by one)
	public static void testLoginWithAllData(WebDriver dr) throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET1_NAME);
		
		for(int i=1; i<ExcelUtils.getWorkSheet().getLastRowNum()+1; i++) {
			fillLoginForm(dr,i);
			HomePage.navigateTo(dr);
		}
	}
}