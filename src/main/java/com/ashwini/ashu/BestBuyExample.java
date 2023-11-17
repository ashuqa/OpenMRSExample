package com.ashwini.ashu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BestBuyExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		String title = driver.getTitle();
		System.out.println("Title of the page :::" + title);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   // WebElement e = driver.findElement(By.linkText("Account"));
	    //Actions action = new Actions(driver);
	    //action.moveToElement(e);
	    //action.click();
	    driver.findElement(By.xpath("//*[@id=\"account-menu-account-button\"]/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Create Account")).click();
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("//*[@id=\"shop-account-menu-53690293\"]/div/div/div[1]/div/div/div/div/a[2]")).click();
	    
	    driver.findElement(By.name("firstName")).sendKeys("ABC");
	    Thread.sleep(1000);
	    driver.findElement(By.name("lastName")).sendKeys("xyz");
	    Thread.sleep(1000);
	    driver.findElement(By.name("email")).sendKeys("ABC2@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.name("fld-p1")).sendKeys("123abc$$$");
	    Thread.sleep(1000);
	    driver.findElement(By.name("reenterPassword")).sendKeys("123abc$$$");
	    Thread.sleep(1000);
	    driver.findElement(By.name("phone")).sendKeys("1234567564");
	    Thread.sleep(1000);
	    
	    
	}

}
//First Name-  name-firstName
//Last Name- name- lastName
//Email Address-name-email
//Password-name- fld-p1
//Confirm Password-name-reenterPassword
//Mobile Phone Number-name- phone
