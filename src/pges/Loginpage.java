package pges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;
	
	//object repository
By signin = By.xpath("//a[@class='ml-2']");
By uname = By.xpath("//label[@for='userName']");
By un =By.id("userName");
By passw=By.xpath("//label[@for='password']");
By pass = By.id("password");
By login = By.id("submitBtn");

public Loginpage(WebDriver driver) {

this.driver=driver;
}

public void signin() {
	driver.findElement(signin).click();
}

public void username(String usrname) {
	driver.findElement(uname).click();
	driver.findElement(un).sendKeys(usrname);
}

public void password(String passwrd) {
	driver.findElement(passw).click();
	driver.findElement(pass).sendKeys(passwrd);
}

public void login() {
	driver.findElement(login).click();
}

}
