package com.crm.actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.actitime.genericlibrary.ReadDataFromExcel;
import com.crm.actitime.genericlibrary.ReadDataFromProperty;

public class taskpage {
	
   @FindBy(xpath = "//div[.='Add New']")
   private WebElement addnewbtn;
   
   @FindBy (xpath="//div[.='+ New Customer']")
   private WebElement newcustbtn;
   
   @FindBy (xpath="(//input[@placeholder='Enter Customer Name'])")
   private WebElement custnametext;
   
   @FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
   private WebElement descriptiontext;
   
   @FindBy (xpath = "//div[.='- Select Customer -']")
   private WebElement dropdown;
   
   @FindBy (xpath="(//div[.='Our company'])[10]")
   private WebElement companyname;
   
   @FindBy (xpath="//div[.='Create Customer']")
   private WebElement createbtn;
   
public taskpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddnewbtn() {
	return addnewbtn;
}

public WebElement getNewcustbtn() {
	return newcustbtn;
}

public WebElement getCustnametext() {
	return custnametext;
}

public WebElement getDescriptiontext() {
	return descriptiontext;
}

public WebElement getDropdown() {
	return dropdown;
}

public WebElement getCompanyname() {
	return companyname;
}

public WebElement getCreatebtn() {
	return createbtn;
}

	//business logic
	public void createcustomer() throws EncryptedDocumentException, IOException {
		ReadDataFromExcel r= new ReadDataFromExcel();
		 String custname = r.readdataexcel("Sheet1", 1, 1);
		 String domain = r.readdataexcel("Sheet1", 1, 2);
	addnewbtn.click();
	newcustbtn.click();
	custnametext.sendKeys("custname");
	descriptiontext.sendKeys("domain");
	dropdown.click();
	companyname.click();
	createbtn.click();
	}
}	
	
