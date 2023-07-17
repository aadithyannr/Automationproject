package tst;

import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pges.StSelectionPage;

public class StSelectionTest extends SourceandDestinationTest{
@Test
public void seatselection() throws InterruptedException {
	StSelectionPage select=new StSelectionPage(driver);
	
	select.bustype();
	Thread.sleep(2000);
	select.buscategory();
	select.boardingpoint();
	select.droppingpoint();	
	
	String ph=driver.getWindowHandle();
	System.out.println("parent handle is:"+ph);
	
	select.sorting();
	Thread.sleep(3000);
	
	Set<String>handles=driver.getWindowHandles();
	for(String handle:handles) {
		System.out.println(handle);
		if(!handle.equals(ph)) {
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			driver.close();
			
		}
	}
	
	driver.switchTo().window(ph);
	System.out.println("Switched back");
	
	select.selectseat();
	Thread.sleep(3000);
	select.layout();
	Thread.sleep(5000);
	select.seatselect();
	Thread.sleep(2000);
	select.mobile("8089728151");
	select.email("aadithyannr@gmail.com");
	
	select.gender("MALE");
	select.name("Arjun");
	select.age("25");
	//Thread.sleep(3000);
	//select.continu();
	//Thread.sleep(2000);
	//ob.scroll();
}

@AfterTest
public void teardown(){
driver.close();	
}
}
