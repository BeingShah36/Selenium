package kgf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\programs java\\chromedriver_win32\\chromedriver.exe");
		
		FileReader file=new FileReader("C:\\Users\\ULTIIMATE\\Desktop\\fb.txt");
		BufferedReader r=new BufferedReader(file);
		int count=0;
		int iteration=0;
		String line;
		while((line=r.readLine())!=null) {
			count=count+1;
			if(count>1) {
				iteration=iteration+1;
				String [] c=line.split(" , ", 2);
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.gcrit.com/build3/admin/login.php");
				driver.findElement(By.name("username")).sendKeys(c[0]);
				driver.findElement(By.name("password")).sendKeys(c[1]);
				driver.findElement(By.id("tdb1")).click();
			Thread.sleep(4000);
				String home=driver.getCurrentUrl();
				if(home.contains("http://www.gcrit.com/build3/admin/index.php")) {
					System.out.println(iteration+"login sucessfull");
				}
				
				else {
					System.out.println(iteration+ " login failed");
				}
				driver.close();

			}
		}
		
		r.close();
		
	}

}
