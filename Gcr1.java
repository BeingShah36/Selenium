package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gcr1 {
	WebDriver driver;
	@Test(priority=5)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Test(priority=8)
	public void login() {
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
	}
	@Test(priority=10)
	public void verification() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://www.gcrit.com/build3/admin/index.php");
	}
	@Test(priority=12)
	public void closeBrowser() {
		driver.close();
	}

}
