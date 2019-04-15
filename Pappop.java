package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pappop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement go=driver.findElement(By.name("proceed"));
		go.click();
		Thread.sleep(2000);
		Alert pappu=driver.switchTo().alert();
		System.out.println(pappu.getText());
		pappu.accept();
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("615467321");
		driver.findElement(By.name("passwd")).sendKeys("465488");
        go.click();
		

	}

}
