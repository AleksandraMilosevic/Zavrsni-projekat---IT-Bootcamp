package webPage.Tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;
import webPage.Objects.EditAndDelete;

public class EditAndDeleteTest {
	
	// Method to edit post manually by user
	public static void editPostManually(WebDriver dr, int n) throws Exception {

			Scanner sc = new Scanner(System.in);
		
			// Edit Post Button
			EditAndDelete.clickEdit(dr, n);
			Thread.sleep(3000);

			// Title
			System.out.println("Enter new post title:");
			EditAndDelete.clickEditNaziv(dr);
			String naziv = sc.nextLine();
			EditAndDelete.sendKeysEditNaziv(dr, naziv);

			// Location
			System.out.println("Enter new Location: ");
			EditAndDelete.clickEditLokacija(dr);
			String lokacija = sc.nextLine();
			EditAndDelete.sendKeysEditLokacija(dr, lokacija);

			// Transport
			System.out.println("Choose transport: Walk, Car, Motorbike, Bicycle, Bus");
			String transport = sc.nextLine();
			EditAndDelete.selectPrSredstvo(dr, transport);

			// Description
			System.out.println("Enter new Post Description: ");
			EditAndDelete.clickEditOpis(dr);
			String opis = sc.nextLine();
			EditAndDelete.sendKeysEditOpis(dr, opis);

			// Submit
			EditAndDelete.clickEditPostButton(dr);

		}

		// Editing post using data from Excel file
		public static void editPostExcell(WebDriver dr, int i, String str, int n) throws Exception {

			String data;

			// Setting Excel file
			ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,Constant.SHEET2_NAME);

			// Edit Post Button
			EditAndDelete.clickEdit(dr, n);

			// Title
			EditAndDelete.clickEditNaziv(dr);
			data = ExcelUtils.getCellData(i, 1);
			EditAndDelete.sendKeysEditNaziv(dr, data);

			// Location
			EditAndDelete.clickEditLokacija(dr);
			data = ExcelUtils.getCellData(i, 2);
			EditAndDelete.sendKeysEditLokacija(dr, data);


			// Transport
			EditAndDelete.selectPrSredstvo(dr, str);

			// Description
			EditAndDelete.clickEditOpis(dr);
			data = ExcelUtils.getCellData(i, 0);
			EditAndDelete.sendKeysEditOpis(dr, str);

			// Submit
			EditAndDelete.clickEditPostButton(dr);
			
		}

		// Method to delete single post
		public static void deletePost(WebDriver dr, int i) throws Exception {
			EditAndDelete.clickMore(dr, i);
			EditAndDelete.clickDelete(dr, i);
			
		}

}
