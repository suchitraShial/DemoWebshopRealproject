package com.tricenties.books;


	


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.ExecutableFinder;
import org.testng.Assert;
import org.testng.annotations.Listeners;


import com.aventstack.extentreports.Status;
import com.tricenties.genericutility.BaseClass;
import com.tricenties.genericutility.ExcelUtility;
import com.tricenties.genericutility.Fileutility;
import com.tricenties.genericutility.ListenerUtility;
@Listeners(ListenerUtility.class)
public class TC_DWS_005_Test extends BaseClass{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		homePage.getBooksLink().click();
		eLib=new ExcelUtility();
		String expectedTitle = eLib.getStringDataFromExcel("Books", 1, 0);
		AssertJUnit.assertEquals(driver.getTitle(), expectedTitle);
		test.log(Status.PASS, "Books page is displayed");
	}
}
