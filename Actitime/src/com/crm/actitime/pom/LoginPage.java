package com.crm.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.actitime.genericlibrary.ReadDataFromProperty;

public class LoginPage {
	@FindBy(id = "username")                           //declaration
	private WebElement untbx;
	
	@FindBy(name = "pwd")                              //declaration
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")               //declaration
	private WebElement lgnbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);         //initialization
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	//business Logic
	
	public void LoginToActitime(String un,String pw) throws IOException {
		//ReadDataFromProperty r = new ReadDataFromProperty();
		//String un = r.readdatafromproperty("username");
		//String pw = r.readdatafromproperty("password");
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgnbtn.click();
		
	}
	
	
	
	
	
	
	
	
	
}
