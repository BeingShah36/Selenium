package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
driver.switchTo().frame(2);
driver.findElement(By.linkText("org.openqa.selenium")).click();
Thread.sleep(4000);
driver.switchTo().defaultContent();

driver.switchTo().frame(0);
driver.findElement(By.linkText("org.openqa.selenium.tools")).click();
Thread.sleep(4000);
driver.switchTo().defaultContent();


driver.navigate().back();


driver.switchTo().frame(1);
driver.findElement(By.xpath("/html/body/div/ul/li[10]/a")).click();
Thread.sleep(4000);
driver.switchTo().defaultContent();

driver.close();

	}

}
