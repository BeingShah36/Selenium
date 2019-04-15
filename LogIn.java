package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
static String msg;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin1");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(4000);
		String url=driver.getCurrentUrl();
		if(!url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			 msg=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
			System.out.println(msg);
		}
       if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
    	   System.out.println("login successful passed");
       }
       else if(msg.contains("Error: Invalid administrator login attempt.")) {
    	   System.out.println("login unssuccesful but showing right error message");
    	    }
       else {
    	   System.out.println("login unsuccessful and displaying incorrect error message");
       }
    	   
driver.close();
	}

}
