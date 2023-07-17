package tst;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pges.Loginpage;

public class LoginTest extends Bseclss {
@Test
public void logintest() throws InterruptedException {
	Loginpage log=new Loginpage(driver);
	
	log.signin();
	log.username("aadithyannr@gmail.com");
	Thread.sleep(2000);
	log.password("ksrtc123.");
	log.login();
	
	
}

@AfterTest
public void teardown(){
driver.close();	
}
}
