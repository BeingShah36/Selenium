package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KabJeetegi {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");

System.out.println(driver.getCurrentUrl());
driver.navigate().to("https://www.facebook.com/");

System.out.println(driver.getCurrentUrl());
driver.navigate().back();
System.out.println(driver.getCurrentUrl());

driver.navigate().forward();
System.out.println(driver.getCurrentUrl());
driver.close();
	}

}
