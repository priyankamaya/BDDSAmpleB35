package stepDefs;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver;
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize(); 
	    driver.get("https://the-internet.herokuapp.com/login");
	    
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//	}
	
//	parametrised Scenario Outline
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser,String strPwd) {
//			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
//			driver.findElement(By.id("password")).sendKeys(strPwd);
//			driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//	}
	
//	//Using Datatable as List
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable dataTable) {
//		List<List<String>> data=dataTable.asLists();
//		String strUser=data.get(0).get(0);
//		String strPwd=data.get(0).get(1);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//	}
	
	//Using Datatable as Map
		@When("User enters credentials")
		public void user_enters_credentials(DataTable dataTable) {
			List<Map<String,String>> data=dataTable.asMaps();
			//data.size();
			String strUser=data.get(0).get("username");
			String strPwd=data.get(0).get("password");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
			driver.findElement(By.id("password")).sendKeys(strPwd);
			driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		}
	
	@Then("User should be navigated to Home Page")
	public void user_should_be_navigated_to_home_page() {
	
		boolean isValid=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		assertTrue(isValid);
	    
	}

}
