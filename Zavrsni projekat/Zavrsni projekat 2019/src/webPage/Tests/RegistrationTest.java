package webPage.Tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;
import webPage.Objects.Registration;

	public class RegistrationTest {

	//Entering data manually to register new user
	public static void fillFormManually(WebDriver dr) throws Exception {
					
		Scanner sc = new Scanner(System.in); 
						
		//First name
		System.out.println("Enter First name: ");
		Registration.clickFirstName(dr);
		String firstName = sc.nextLine();
		Registration.sendKeysFirstName(dr,firstName);
					
		//Last name
		System.out.println("Enter Last name: ");	
		Registration.clickLastName(dr);
		String lastName = sc.nextLine();
		Registration.sendKeysLastName(dr,lastName);
					
		//Username
		System.out.println("Enter Username: ");	
		Registration.clickRegUsername(dr);
		String username = sc.nextLine();
		Registration.sendKeysRegUsername(dr,username);
					
		//Email
		System.out.println("Enter Email: ");
		Registration.clickEmail(dr);
		String email = sc.nextLine();
		Registration.sendKeysEmail(dr,email);
					
		//Password
		System.out.println("Password: ");
		Registration.clickRegPassword(dr);
		String password = sc.nextLine();
		Registration.sendKeysRegPassword(dr,password);
					
		//Register button
		Registration.clickRegister(dr);
					
		
		System.out.println("Dear "+ username +" thank you for registering!");
	}
					
	//Register new user by choosing data from rows in excel 
	public static void fillFormFromExcell(WebDriver dr,int i) throws Exception {
			
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,
									Constant.SHEET1_NAME);
			
		//First name
		Registration.clickFirstName(dr);
		data=ExcelUtils.getCellData(i, 0);
		Registration.sendKeysFirstName(dr, data);
			
		//Last name
		Registration.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		Registration.sendKeysLastName(dr, data);		
					
		//Username
		Registration.clickRegUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		Registration.sendKeysRegUsername(dr, data);
					
		//Email
		Registration.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		Registration.sendKeysEmail(dr, data);
						
		//Password
		Registration.clickRegPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		Registration.sendKeysRegPassword(dr, data);
						
		//Register button
		Registration.clickRegister(dr);
	}
					
	//Register multiple users using data from excel
	public static void testWithAllDataInExcel(WebDriver dr) throws Exception {
						
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,
								Constant.SHEET1_NAME);
						
		for(int i=1; i<ExcelUtils.getWorkSheet().getLastRowNum()+1; i++) {
							fillFormFromExcell(dr,i);
		Registration.navigateTo(dr);  
		}
				
							
		
	}

}
