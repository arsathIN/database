package org.userLab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pommm extends BaseCls_UsrDfindCls{
	public Pommm(){
	PageFactory.initElements(driver, this); 
	}
	@CacheLookup
	@FindBy(id="email")private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(id="pass")private WebElement password;
	@FindBy(name="login")private WebElement login;
	@FindBy(xpath="(//*[@type='search'])[1]")private WebElement logout;
}




