package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartyBanti {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://accounts.google.com/");
	WebElement cool=driver.findElement(By.partialLinkText("more"));
	System.out.println(cool.isDisplayed());
	System.out.println(cool.isEnabled());
	System.out.println(cool.getText());
	Thread.sleep(2000);
	cool.click(); 
	
	}
	

}
