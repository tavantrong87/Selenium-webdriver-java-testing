package api;


import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;
import com.thoughtworks.selenium.webdriven.commands.GetText;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterClass;

public class Xpath_Css_Locator {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	

@BeforeClass
	  public void beforeClass() {
	  }

	@Test
  public void TC01_Reg with empty data() {
		//Sử dụng empty ID vs pass
		driver.get("https://alada.vn/tai-khoan/dang-ky.html/");
		driver.findElement(By.xpath('//input[@id="txtFirstname"]')).SendKey('');
		driver.findElement(By.xpath('//input[@id="txtEmail"]')).SendKey('');
		driver.findElement(By.xpath('//div[@class="field_btn"]//button[@type="submit"]')).click();
		
		Assert.assertEquals(driver.findElement(By.xpath('//label[@id="txtFirstname-error"]')).GetText();, "Vui lòng nhập họ tên");
		Assert.assertEquals(driver.findElement(By.xpath("//label[@id='txtEmail-error']")).GetText();, "Vui lòng nhập email");

  }
  

@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
