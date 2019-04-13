package kgf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By User=By.name("username");
	By Password=By.name("password");
	By LoginButton=By.id("tdb1");
	By ErrorMessage=By.xpath("/html/body/table[1]/tbody/tr/td");
	By Redirect=By.linkText("Online Catalog");
public LoginPage(WebDriver xyz) {
	this.driver=xyz;

}
public void userName(String uname) {
	driver.findElement(User).sendKeys(uname);
}
public void typePassword(String pwd) {
	driver.findElement(Password).sendKeys(pwd);
}
public void clickLoginButton() {
	driver.findElement(LoginButton).click();
}
public String printErrorMessage() {
	return driver.findElement(ErrorMessage).getText();
	
}
public void clickOnlineCatalog() {
	driver.findElement(Redirect).click();
}


}
