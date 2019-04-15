package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\programs java\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
	//	driver.findElement(By.name("username")).sendKeys("admin");
		WebElement shah=driver.findElement(By.name("username"));
		shah.sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[1]")).click();
		String kohli=driver.getTitle();
		System.out.println(kohli);
		//String url=driver.getCurrentUrl();
		//if(url.contains("http://www.gcrit.com/build3/admin/index.php"))
		//{
		//	System.out.println("login succesfull passed");
	//	}
	//	else {
	//		System.out.println("login unsuccesfull failed");
	//	}

	}

}
