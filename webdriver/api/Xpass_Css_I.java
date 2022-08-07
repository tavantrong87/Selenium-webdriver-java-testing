package api;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpass_Css_I {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	

	@BeforeClass
	  public void beforeClass() {
	  }

	@Test
  public void TC01_Empty_DATA() {
		//Use empty ID and pass
		driver.get("https://alada.vn/tai-khoan/dang-ky.html/");
		driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='field_btn']//button[@type='submit']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtFirstname-error']")).getText(), "Vui lòng nhập họ tên");
		Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtEmail-error']")).getText(), "Vui lòng nhập email");

  }
  

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
