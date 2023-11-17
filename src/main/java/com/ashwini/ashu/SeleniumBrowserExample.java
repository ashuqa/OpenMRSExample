package com.ashwini.ashu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBrowserExample {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bangalorecitycollege.org/application-form.html");
		String title = driver.getTitle();
		System.out.println("Title of the page :::"  + title);
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
	    
	    //textbox/textarea
		driver.findElement(By.name("name")).sendKeys("Fname");
		//radio/button/checkbox
		driver.findElement(By.name("gender")).click();
		//Select  the value from list box
		WebElement courseWE = driver.findElement(By.id("capp"));
		Select courseDropDown = new Select(null);
		courseDropDown.selectByVisibleText("M.sc Computer Science");
		

	}

}
