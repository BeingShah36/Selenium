package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	try {
	boolean b =	driver.findElement(By.linkText("Yahoo")).isDisplayed();
	
	if(b==true) {
		System.out.println("link exist-passed");
	}
	} 
	catch(NoSuchElementException e) {
		System.out.println("link doesnot exist-Failed");
	}
driver.close();
	}

}
