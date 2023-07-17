package tests;




import java.util.Set;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.TicketBooking;

public class BookingTest extends BaseClass{

	
@Test
public void ticketbooking() throws InterruptedException {
	TicketBooking ob=new TicketBooking(driver);
	
	ob.signin("aadithyannr@gmail.com","ksrtc123.");
	
	
	
	ob.sourceselection("Ernakulam");
	ob.destination("Trivandrum");
	ob.monthselection("July");
	ob.dateselection("20");
	ob.searchbus();
	Thread.sleep(3000);
	ob.bustype();
	Thread.sleep(2000);
	ob.buscategory();
	ob.boardingpoint();
	ob.droppingpoint();
	
	String ph=driver.getWindowHandle();
	System.out.println("parent handle is:"+ph);
	
	ob.sorting();
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
	
	ob.selectseat();
	Thread.sleep(3000);
	ob.layout();
	Thread.sleep(5000);
	ob.seatselect();
	Thread.sleep(2000);
	//ob.mobile("8089728151");
	//ob.email("aadithyannr@gmail.com");
	
	ob.gender("MALE");
	ob.name("Arjun");
	ob.age("25");
	//Thread.sleep(3000);
	//ob.continu();
	//Thread.sleep(2000);
	//ob.scroll();
	

	}

@AfterTest
public void teardown(){
driver.close();	
}
}
