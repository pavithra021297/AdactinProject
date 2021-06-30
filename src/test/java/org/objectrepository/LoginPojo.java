package org.objectrepository;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() 
	{
    PageFactory.initElements(driver, this);	
    }
	@FindBy(id="username")
	  public WebElement txtusername;
	  
    @FindBy(id="password")
	  public WebElement txtpassword;
	  
    @FindBy(id="login")
	  public WebElement btnlogin;
	  
    public WebElement gettxtUserName() {
		return txtusername;
	}

	public WebElement gettxtPassword() {
		return txtpassword;
	}

	public WebElement getbtnLogin() {
		return btnlogin;
	}
	
}
