package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		Thread.sleep(4000);
		if(url1.contains("wikipedia")) {
			System.out.println("create account is an internal link");
		}
		else {
			System.out.println("create account is an outgoing link");

		}
		if(url2.contains("wikipedia")) {
			System.out.println("selenium.org is an internal link");
		}
		else {
			System.out.println("selenium.org is an outgoing link");

		}
driver.close();
		
		

	}

}
