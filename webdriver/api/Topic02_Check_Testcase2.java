package api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic02_Check_Testcase2 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		//mở app
		driver = new FirefoxDriver();
		driver.get("https://google.com.vn/");
		}
	
  @Test
  public void test_case_01() {
  }
  @Test
  public void test_case_02() {
  }
  @Test
  public void test_case_03() {
  }

  @AfterClass
  public void afterClass() {
	  //Đóng trình duyệt
	  driver.quit();
  }

}
