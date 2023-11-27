package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCreateAccount {

	public static void main(String[] args) {
		ChromeDriver ca =new ChromeDriver();
	       
		ca.get("http://leaftaps.com/opentaps/control/main");
		ca.manage().window().maximize();
        ca.findElement(By.id("username")).sendKeys("DemoCSR");
		ca.findElement(By.id("password")).sendKeys("crmsfa");
		ca.findElement(By.className("decorativeSubmit")).click();
		ca.findElement(By.linkText("CRM/SFA")).click();
		
		//to select the account tab
		ca.findElement(By.linkText("Accounts")).click();
		ca.findElement(By.partialLinkText("Create ")).click();
		ca.findElement(By.id("accountName")).sendKeys("Kendo");
		ca.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = ca.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByIndex(3);
		
		WebElement owner = ca.findElement(By.name("ownershipEnumId"));
		Select own = new Select(owner);
		own.selectByVisibleText("S-Corporation");
		
		WebElement source = ca.findElement(By.id("dataSourceId"));
		Select src = new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");
		
		WebElement market = ca.findElement(By.id("marketingCampaignId"));
		Select mark = new Select(market);
		mark.selectByIndex(6);
		
		WebElement state = ca.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByValue("TX");
		WebElement country = ca.findElement(By.id("generalCountryGeoId"));
		Select ctry = new Select (country);
		ctry.selectByVisibleText("United States Minor Outlying Islands");
		
		ca.findElement(By.className("smallSubmit")).click();
		ca.close();
		
		

	}

}
