package pges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StSelectionPage {
	WebDriver driver;
	
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
	By selectseat= By.xpath("/html/body/main/div/form/div[6]/section/div/div[3]/div[66]/div[1]/div/div[4]/div/input[4]");
	By showlayout= By.xpath("/html/body/main/div/form/div[6]/section/div/div[3]/div[66]/div[4]/div/div[1]/input");
	By seatsel= By.xpath("/html/body/main/div/form/div[6]/section/div/div[3]/div[66]/div[4]/div/div[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[7]");
	By mob= By.xpath("//*[@id=\"mobileNo\"]");
	By email= By.xpath("//*[@id=\"email\"]");
	By gender= By.name("genderCodeId");
	By n= By.xpath("//*[@id=\"passengerNameForward0\"]");
	By age= By.xpath("//*[@id=\"passengerAgeForward0\"]");
	By cont= By.name("BookNowBtn");
	
	public StSelectionPage(WebDriver driver) {

		this.driver=driver;
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

	public void mobile(String mobnum) {
		driver.findElement(mob).click();
		driver.findElement(mob).sendKeys(mobnum);
	}

	public void email(String mail) {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(mail);
		
	}

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

	
}
