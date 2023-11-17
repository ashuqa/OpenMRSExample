package com.ashwini.ashu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMRSExample {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		String title = driver.getTitle();
		System.out.println("Title of the page :::" + title);
		
		Thread.sleep(2000);
		
		//Login to open MRS page
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		String actualLoginMsg = driver.findElement(By.xpath("//h4[contains(text(),'Logged in as Super User (admin) at Inpatient Ward.')]")).getText();
		String expectedLoginMsg= "Logged in as Super User (admin) at Inpatient Ward.";
		if(actualLoginMsg.equals(expectedLoginMsg))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login unsucessful");

		}
		
		//Register a Patient
		
		driver.findElement(By.xpath("//a[normalize-space()='Register a patient']")).click();
		//driver.findElement(By.id("fr6735-field")).sendKeys("ABC");
		driver.findElement(By.name("givenName")).sendKeys("ABC");
		//driver.findElement(By.xpath("//*[@id=\'fr6735-field\']")).getText();
		//*[@id="fr6735-field"]
		driver.findElement(By.name("middleName")).sendKeys("xyz");
		driver.findElement(By.name("familyName")).sendKeys("pqr");
		//driver.findElement(By.id("checkbox-unknown-patient")).click();
		//driver.findElement(By.id("next-button")).isEnabled();
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		//driver.findElement(By.id("gender-field")).click();
		driver.findElement(By.name("gender")).sendKeys("Male");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		//driver.findElement(By.xpath("//*[@id=\'gender-field\']/option[1]")).click();
		
		//driver.findElement(By.name("gender")).click();

		//driver.findElement(By.name("gender")).sendKeys("Male");
		//driver.findElement(By.name("gender")).sendKeys("Female");
		//driver.findElement(By.id("next-button")).submit();

		//driver.findElement(By.className("confirm right")).click();
		//driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		//driver.findElement(By.xpath("//*[@id='gender-field']/option[1]")).click();
		//*[@id="gender-field"]/option[1]
		//*[@id="gender-field"]/option[2]
		//driver.findElement(By.xpath("//*[@id='gender-field']/option[2]")).click();
		//driver.findElement(By.id("next-button")).submit();
		
		driver.findElement(By.id("birthdateDay-field")).sendKeys("11");
		Select objSelect = new Select(driver.findElement(By.name("birthdateMonth")));
		objSelect.selectByValue("5");
		//driver.findElement(By.name("birthdateMonth")).sendKeys("5");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("2001");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("address1")).sendKeys("aaa");
		driver.findElement(By.id("address2")).sendKeys("bbb");
		driver.findElement(By.id("cityVillage")).sendKeys("ccc");
		driver.findElement(By.id("stateProvince")).sendKeys("ddd");
		driver.findElement(By.id("country")).sendKeys("eee");
		driver.findElement(By.id("postalCode")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("1232323212");
		Thread.sleep(2000);
		driver.findElement(By.id("next-button")).click();
		Select objSelect1 = new Select(driver.findElement(By.name("relationship_type")));
		objSelect1.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
		
		driver.findElement(By.cssSelector(".person-typeahead")).click();
		driver.findElement(By.cssSelector(".person-typeahead")).sendKeys("123vfdhdh");
		Thread.sleep(2000);
		//driver.findElement(By.name("relatioship_type")).sendKeys("Doctor");
		//driver.findElement(By.id("type")).sendKeys("ggg");
		driver.findElement(By.id("next-button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='relationship_type']")).click();
		//*[@id="relationship_type"]
		//driver.findElement(By.xpath("//*[@id='cancelSubmission']")).click();
		//*[@id="cancelSubmission"]
		//driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
		driver.findElement(By.id("submit")).click();
		
		//*[@id="submit"]
	
		
        //Find a Patient
		driver.findElement(By.xpath("//a[normalize-space()='Find Patient Record']")).click();
		String expectedPatientID="100HNY";
		driver.findElement(By.id("patient-search")).sendKeys(expectedPatientID);
		String actualPatientID = driver.findElement(By.xpath("//*[@id=\'patient-search-results-table\']")).getText();
		if(actualPatientID.contains(expectedPatientID))
		{
			System.out.println("Find a patient record is successful");
		
		}
		else
		{
			System.out.println("Find a patient record is unsuccessful");
		}
	}

}

