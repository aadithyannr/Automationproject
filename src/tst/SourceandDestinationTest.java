package tst;

import org.testng.annotations.Test;

import pges.SourceandDestinationPage;

public class SourceandDestinationTest extends Bseclss{
@Test
public void sourceandDestinationTest() throws InterruptedException {
	SourceandDestinationPage sd=new SourceandDestinationPage(driver);
	
	
	sd.sourceselection("Ernakulam");
	sd.destination("Trivandrum");
	sd.monthselection("July");
	sd.dateselection("29");
	sd.searchbus();
	Thread.sleep(3000);
	
}
}
