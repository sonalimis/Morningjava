package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginTest 
{
	public WebDriver driver= null;

	@Given("i open browser {string}")
	public void i_open_browser(String string)
	{
	  if(string.equals("chrome"))
		
	  {
		driver=new ChromeDriver();
	  }
	  else if(string.equals("firefox"))
			  {
				  driver=new FirefoxDriver();
				  
			  }
	
		
	}
	@Given("I navigate to {string}")
	public void i_navigate_to(String string) 
	{
	    driver.navigate().to(string);;
	    driver.manage().window().maximize();
	}
	@When("i enter usernmae {string}")
	public void i_enter_usernmae(String string) 
	{
	    
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(string);
	}
	@When("i enter password {string}")
	public void i_enter_password(String string) 
	   

	{
	  

		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("wrong passwd");
	}
	    
	@When("I click submit")
	public void i_click_submit()
	{
	   
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
	}
	@Then("error message must come")
	public void error_message_must_come()
	{
		
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[1]/div[2]")).getText();
		
		
	}
	
	
	
	
	
	
}
