package com.crm.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement reportslink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userslink;
	
	@FindBy(id  = "logoutlink")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTasklink() {
		return tasklink;
	}

	public WebElement getReportslink() {
		return reportslink;
	}

	public WebElement getUserslink() {
		return userslink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	//business logic
	public void clickonTasktab() {
		tasklink.click();
	}
}