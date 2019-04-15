package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shahenshah {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","D:\\programs java\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//WebElement shah=driver.findElement(By.name("email"));
	//shah.sendKeys("******");
	//Thread.sleep(4000);
WebElement shah=driver.findElement(By.xpath("//*[@id=\"u_0_9\"]"));
shah.click();
System.out.println(shah.isSelected());
Thread.sleep(4000);
	boolean abd=shah.isSelected();
System.out.println(abd);
	}

}
