package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.gcrit.com/build3/");
        driver.findElement(By.linkText("create an account")).click();
        driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
        driver.findElement(By.name("firstname")).sendKeys("shahbazalam");
        driver.findElement(By.name("lastname")).sendKeys("sayyad");
        driver.findElement(By.name("dob")).sendKeys("07/22/1995");
        driver.findElement(By.name("email_address")).sendKeys("shahbazalam.sayyad@gmail.com");
        driver.findElement(By.name("company")).sendKeys("Tech Mahindra");
        driver.findElement(By.name("street_address")).sendKeys("Kale Colony");
        driver.findElement(By.name("postcode")).sendKeys("591201");
        driver.findElement(By.name("city")).sendKeys("Pune");
        driver.findElement(By.name("state")).sendKeys("Maharashtra");
        Select count=new Select(driver.findElement(By.name("country")));
        count.selectByVisibleText("India");
        driver.findElement(By.name("telephone")).sendKeys("8951101707");
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("password")).sendKeys("8861237482");
        driver.findElement(By.name("confirmation")).sendKeys("8861237482");
        driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
  String s=  driver.getCurrentUrl();
        System.out.println(s);
        if(s.equals("http://www.gcrit.com/build3/create_account_success.php")) {
        	System.out.println("Registration succesful-passed");
        }
        else {
        	System.out.println("Registration unsuccesful-Failed");

        }
        Thread.sleep(4000);
         driver.close();
        
	}

}
