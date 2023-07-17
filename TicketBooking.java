package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TicketBooking {
WebDriver driver;
	
	//object repository
By signin = By.xpath("//a[@class='ml-2']");
By uname = By.xpath("//label[@for='userName']");
By un =By.id("userName");
By passw=By.xpath("//label[@for='password']");
By pass = By.id("password");
By login = By.id("submitBtn");


By source = By.xpath("//*[@id=\"fromPlaceName\"]");
By sourcesuggest = By.xpath("/html/body/ul[1]/li");
By destination = By.xpath("//*[@id=\"toPlaceName\"]");
By destsuggest = By.xpath("/html/body/ul[2]/li");
By DateofDeparture = By.xpath("//*[@id=\"txtJourneyDate\"]");
By month = By.xpath("/html/body/div/div/div/span[1]");
By rightarrow = By.xpath("/html/body/div/div/a[2]");
By alldays = By.xpath("/html/body/div/table/tbody/tr/td/a");
By Searchbutton = By.xpath("/html/body/main/form/section[1]/div[2]/div/div[2]/div[1]/div[5]/input");
By bustype = By.xpath("//*[@id=\"BtFid\"]");
By bustypelist = By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li");
By btype=By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[1]/label/input");
By buscat= By.xpath("//*[@id=\"BtCid\"]");
By buscatlist= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li");
By buscat1= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[3]/div/div/ul/li[1]/label/input");
By buscat2= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[3]/div/div/ul/li[2]/label/input");
By boardingpoint= By.xpath("//*[@id=\"BpFid\"]");
By bplist= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[4]/div/div/ul/li");
By bp= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[4]/div/div/ul/li[2]/label/input");
By droppoint= By.xpath("//*[@id=\"DpFid\"]");
By dplist= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[5]/div/div/ul/li");
By dp= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[5]/div/div/ul/li[7]/label/input");
By sortby= By.xpath("//*[@id=\"ddOpen5\"]");
By sortlist= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[1]/div/div[5]/div/div/ul/li");
By sort= By.xpath("/html/body/main/div/form/div[6]/section/div/div[1]/div/div[2]/div/div[2]/ul/li[3]");
By selectseat= By.xpath("/html/body/main/div/form/div[6]/section/div/div[3]/div[62]/div[1]/div/div[4]/div/input[4]");
By showlayout= By.xpath("/html/body/main/div/form/div[6]/section/div/div[3]/div[62]/div[4]/div/div[1]/input");
By seatsel= By.xpath("/html/body/main/div/form/div[6]/section/div/div[3]/div[62]/div[4]/div/div[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[7]");
By mob= By.xpath("//*[@id=\"mobileNo\"]");
By email= By.xpath("//*[@id=\"email\"]");
By gender= By.name("genderCodeId");
By n= By.xpath("//*[@id=\"passengerNameForward0\"]");
By age= By.xpath("//*[@id=\"passengerAgeForward0\"]");
By cont= By.name("BookNowBtn");
By payment= By.name("PgBtn");




public TicketBooking(WebDriver driver) {

this.driver=driver;
}

public void signin(String usrname,String passwrd) throws InterruptedException  {
	
	driver.findElement(signin).click();
	driver.findElement(uname).click();
	driver.findElement(un).sendKeys(usrname);
	Thread.sleep(2000);
	driver.findElement(passw).click();
	driver.findElement(pass).sendKeys(passwrd);
	driver.findElement(login).click();

	
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

public void bustype() {
	driver.findElement(bustype).click();
	List<WebElement>bl=driver.findElements(bustypelist);
	bl.get(0);
	driver.findElement(btype).click();
}

public void buscategory() throws InterruptedException {
	driver.findElement(buscat).click();
	List<WebElement>bcatlist=driver.findElements(buscatlist);
	bcatlist.get(0);
	driver.findElement(buscat1).click();
	Thread.sleep(1000);
	driver.findElement(buscat2).click();
}

public void boardingpoint() {
	driver.findElement(boardingpoint).click();
	List<WebElement>bpl=driver.findElements(bplist);
	bpl.get(1);
	driver.findElement(bp).click();
}

public void droppingpoint() {
	driver.findElement(droppoint).click();
	List<WebElement>dpl=driver.findElements(dplist);
	dpl.get(6);
	driver.findElement(dp).click();
	driver.findElement(droppoint).click();
	
}

public void sorting() {
	driver.findElement(sortby).click();
	List<WebElement>sl=driver.findElements(sortlist);
	sl.get(2);
	driver.findElement(sort).click();
	
}

public void selectseat() throws InterruptedException {
	Thread.sleep(4000);
	if(driver.findElement(selectseat).isEnabled()) {
		System.out.println("select seat is enabled");
	}
	Thread.sleep(2000);
	driver.findElement(selectseat).click();
}

public void layout() {
	if(driver.findElement(showlayout).isEnabled()) {
		System.out.println("Layout is enabled");
		driver.findElement(showlayout).click();
	}
}

public void seatselect() {
	driver.findElement(seatsel).click();
}

/*public void mobile(String mobnum) {
	driver.findElement(mob).click();
	driver.findElement(mob).sendKeys(mobnum);
}

public void email(String mail) {
	driver.findElement(email).click();
	driver.findElement(email).sendKeys(mail);
	
}*/

public void gender(String Gender) {
	Select s=new Select(driver.findElement(gender));
	s.selectByVisibleText(Gender);
}

public void name(String name) {
	driver.findElement(n).click();
	driver.findElement(n).sendKeys(name);
}

public void age(String Age) {
	driver.findElement(age).click();
	driver.findElement(age).sendKeys(Age);
}

public void continu() {
	if(driver.findElement(cont).isEnabled()) {
		System.out.println("Continue button is enabled");
	}
	driver.findElement(cont).click();
}

public void scroll() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(payment));
}


	





}

