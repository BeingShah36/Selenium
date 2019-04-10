package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\programs java\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		WebElement shah=driver.findElement(By.name("country"));
	System.out.println(shah.isDisplayed());
	System.out.println(shah.isEnabled());
		Select dropdown=new Select(shah);
		dropdown.selectByVisibleText("Bangladesh");
		Thread.sleep(4000);
		List <WebElement> e=dropdown.getOptions();
		System.out.println(e.size());
		driver.close();

	}

}
