package kgf;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BatchTesting {
	
public static WebDriver driver;
   
 public void launchBrowser() {
	 System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	  }
 public void twitterLogin(String name,String pwd) {
	 driver.get("https://twitter.com/login");
	 driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input")).sendKeys(name);
	 driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[2]/input")).sendKeys(pwd);
	 driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button")).click();
 }
 public void closeBrowser() {
	 driver.close();
 }
	public static void main(String[] args) {
		
BatchTesting obj=new BatchTesting();
obj.launchBrowser();
obj.twitterLogin("*****", "*****");

String url1=driver.getCurrentUrl();
if(url1.contains("https://twitter.com/")) {
	System.out.println("login successful-passed");
	}
else {
	System.out.println("login unsuccessful-failed");

}
obj.closeBrowser();
obj.launchBrowser();
obj.twitterLogin("******", "*****");
driver.findElement(By.xpath("//*[@id=\"global-nav-home\"]/a/span[3]")).click();
String pop=driver.getCurrentUrl();
if(pop.equals("https://twitter.com/")) {
	System.out.println("Redirecting to home passed");
}
else {
	System.out.println("Redirecting to home Failed");

}
obj.closeBrowser();

obj.launchBrowser();
obj.twitterLogin("*****", "****");
Select e=new Select(driver.findElement(By.xpath("//*[@id=\"user-dropdown-toggle\"]")));
e.selectByIndex(8);
String url2=driver.getCurrentUrl();
if(url2.contains("https://twitter.com/?logout=1554906905525")) {
	System.out.println("logout succesfull passed");
}
else {
	System.out.println("logout unsuccesfull Failed");

}
obj.closeBrowser();
	}

}
