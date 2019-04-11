package kgf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowerTesting {
	public static WebDriver driver;
	public static int i;
	public static String BrowserName;

	public static void main(String[] args) {
		for(i=1;i<=2;i++) {
			if(i==1) {
				System.setProperty("webdriver.gecko.driver", "D:\\programs java\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				BrowserName="Firefox Browser";
				}
		else {
			System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			BrowserName="Chrome Browser";

			}
			 driver.get("https://twitter.com/login");
			 driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[1]/input")).sendKeys("*****");
			 driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/fieldset/div[2]/input")).sendKeys("*****");
			 driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button")).click();
			 String title=driver.getTitle();
			 if(title.equals("Twitter")) {
				 System.out.println("twitter login succesfully in "+BrowserName);
			 }
			 else {
				 System.out.println("twitter login Failed in "+BrowserName);
			 }
			 driver.close();

			 
		}
		
	}

}
