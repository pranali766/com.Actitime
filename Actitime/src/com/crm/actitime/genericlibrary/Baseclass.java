package com.crm.actitime.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.actitime.pom.LoginPage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static WebDriver driver;
	ReadDataFromProperty r=new ReadDataFromProperty();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database is connected",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database is disconnected",true);
	}
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Url1 = r.readdatafromproperty("Url");
		driver.get(Url1);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		String UN = r.readdatafromproperty("username");
		String PW = r.readdatafromproperty("password");
		//driver.findElement(By.id("username")).sendKeys(UN);
		//driver.findElement(By.name("pwd")).sendKeys(PW);
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		LoginPage lp = new LoginPage(driver);
		lp.LoginToActitime(UN, PW);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}
}











