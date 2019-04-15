package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,30);
	driver.get("https://accounts.google.com/");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("********.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	WebElement path=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));
	
	path.sendKeys("********");
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
	//WebElement shah=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]")));
			//shah.click();
	//driver.findElement(By.xpath("//*[@id=\\\"yDmH0d\\\"]\"")).click();
			//driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	} 

}
//implicit;by default 3000ms wait//
//explicit:we can make wait of our wish//
