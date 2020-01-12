package com.class02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.utils.CommonMethods;
import com.utils.Constants;
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Login into the application
//Click on Add Employee
//Verify labels: Full Name, Employee Id, Photograph are displayed
//Provide Employee First and Last Name
//Verify Employee has been added successfully
//Close the browser
public class Task extends CommonMethods{
	
	@BeforeTest
	public void OpenAndNavigate() {
		setUp("firefox", Constants.HRMS_URL);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.name("Submit")).click();
	}
	
	public void addEmployee() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}
	@Test
	public void ifDisp() {
		boolean fullName = driver.findElement(By.linkText("Full Name")).isDisplayed();
		Assert.assertTrue(fullName);
	}
	
	
	
	
	
	
	
	
	@AfterTest
	public void Close() {
		driver.close();
	}
	
	
	
	
	
	

}
