package pges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SourceandDestinationPage {
	WebDriver driver;
	
	By source = By.xpath("//*[@id=\"fromPlaceName\"]");
	By sourcesuggest = By.xpath("/html/body/ul[1]/li");
	By destination = By.xpath("//*[@id=\"toPlaceName\"]");
	By destsuggest = By.xpath("/html/body/ul[2]/li");
	By DateofDeparture = By.xpath("//*[@id=\"txtJourneyDate\"]");
	By month = By.xpath("/html/body/div/div/div/span[1]");
	By rightarrow = By.xpath("/html/body/div/div/a[2]");
	By alldays = By.xpath("/html/body/div/table/tbody/tr/td/a");
	By Searchbutton = By.xpath("/html/body/main/form/section[1]/div[2]/div/div[2]/div[1]/div[5]/input");
	
	public SourceandDestinationPage(WebDriver driver) {

		this.driver=driver;
		}
	
	public void sourceselection(String sname) throws InterruptedException {
		driver.findElement(source).click();
		driver.findElement(source).sendKeys(sname);
		Thread.sleep(2000);
		
		List<WebElement>s=driver.findElements(sourcesuggest);
		s.get(0).click();
	}
	
	public void destination(String dname) throws InterruptedException {
		driver.findElement(destination).click();
		driver.findElement(destination).sendKeys(dname);
		Thread.sleep(2000);
		List<WebElement> ds=driver.findElements(destsuggest);
		ds.get(0).click();
	}
	
	public void monthselection(String prefmonth) {
		driver.findElement(DateofDeparture).click();
		while(true) {
			driver.findElement(month);
			String month1=driver.findElement(month).getText();
			if(month1.equals(prefmonth)) {
				System.out.println("The month is: "+month1);
				break;
			}
			else {
				driver.findElement(rightarrow).click();
				
			}
			}
	}
	
	public void dateselection(String prefdate) {
		List<WebElement>ad=driver.findElements(alldays);
		for(WebElement dayelement:ad) {
			String day=dayelement.getText();
			if(day.equals(prefdate)) {
				dayelement.click();
				System.out.println("day selected="+day);
				break;
			}
			}
	}
	
	
	public void searchbus() {
		driver.findElement(Searchbutton).click();
	}
}
