package com.tricenties.objectrepository;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	//declare
		@FindBy(id="Email")
		private WebElement emailTextfield;
		
		@FindBy(id="Password")
		private WebElement passWordTextField;
		
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement loginButton;
		
		//getter

		public WebElement getEmailTextfield() {
			return emailTextfield;
		}

		public WebElement getPassWordTextField() {
			return passWordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

	}


