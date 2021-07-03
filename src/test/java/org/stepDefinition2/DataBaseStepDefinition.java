package org.stepDefinition2;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.userLab.BaseCls_UsrDfindCls;
import org.userLab.Pommm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataBaseStepDefinition extends BaseCls_UsrDfindCls{
	
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
	launchBrowser("chrome");
	launchUrl("https://www.facebook.com/");
	}

	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	 Map<String, String> Map = dataTable.asMap(String.class, String.class);
	   String email = Map.get("voilet");
	   String pass = Map.get("voilet@123");
	   Pommm p=new Pommm();
	   passValue(p.getUsername(), email);
	   passValue(p.getPassword(), pass);
	}

	@When("User click login button")
	public void user_click_login_button() throws Exception {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);
	}   
	

	@Then("User must be in invalid credentials page")
	public void user_must_be_in_invalid_credentials_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check the url", currentUrl.contains("privacy_mutation_token"));
	
		
		
	    }




	
	

}
