package kgf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pom {
	public static WebDriver abc;
	static int i;
	static String BrowserName;

	public static void main(String[] args) throws InterruptedException {
		for(i=1;i<=2;i++) {
			if(i==1) {
			
		
		System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
	 abc=new ChromeDriver();
		abc.manage().window().maximize();
		BrowserName="Chrome Browser";
			}
			else {
				System.setProperty("webdriver.gecko.driver", "D:\\programs java\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				abc=new FirefoxDriver();
				BrowserName="Firefox Browser";
				abc.manage().window().maximize();

			}
		LoginPage obj=new LoginPage(abc);
		abc.get("http://www.gcrit.com/build3/admin/login.php?action=process");
		obj.userName("admin");
		obj.typePassword("admin@123");
		obj.clickLoginButton();
		String url=abc.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("login succesful in "+BrowserName);
		}
		else {
			System.out.println("login Failed in "+BrowserName);

		}
		obj.clickOnlineCatalog();
		String url2=abc.getCurrentUrl();
		if(url2.contains("http://www.gcrit.com/build3/")) {
			System.out.println("Redirection passed in "+BrowserName);
			
		}	
		else {
			System.out.println("redirection failed in "+BrowserName);
		}
				Thread.sleep(4000);	
		abc.navigate().to("http://www.gcrit.com/build3/admin/login.php?action=process");
		obj.userName("admin1");
		obj.typePassword("admin@123");
		obj.clickLoginButton();
		String msg1=obj.printErrorMessage();
		if(msg1.contains("Error: Invalid administrator login attempt.")) {
			System.out.println("Error handling succesfull in "+BrowserName);
		}
		else {
			System.out.println("error handling failed in "+BrowserName);
		}
		abc.close();
		}
	}
}
