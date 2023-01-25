package com.crm.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.actitime.genericlibrary.Baseclass;
import com.crm.actitime.genericlibrary.ListenerImplementation;
import com.crm.actitime.pom.HomePage;
import com.crm.actitime.pom.taskpage;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends Baseclass{
	
@Test
public void createcustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	HomePage hp = new HomePage(driver);
	hp.clickonTasktab();
	
	taskpage tp=new taskpage(driver);
	tp.createcustomer();
	
	}
}