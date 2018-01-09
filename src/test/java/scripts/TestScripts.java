package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generics.BasePage;
import generics.BaseTest;
import generics.Excel;
import generics.GenericUtils;
import pom.HomePage;

public class TestScripts extends BaseTest{
	@Test(enabled=true)
	public void testCreateEmployee() throws EncryptedDocumentException, InvalidFormatException, IOException{
		HomePage pi=new HomePage(driver);
		pi.setUserName(Excel.readData("Sheet1", 0, 1));		
		pi.setPwd(Excel.readData("Sheet1", 1, 1));
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPim_Menu();
		pi.clickAddEmp_Menu();
		pi.setFirstName("Pratibha");
		pi.setLastName("sharma");
		pi.clickSaveBtn();
		pi.verifyFirstName("Pratibha");
		
		
	}
	@Test(enabled=false)
	public void testSortedListBox(){
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPim_Menu();
		pi.clickAddEmp_Btn();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
	}

}
