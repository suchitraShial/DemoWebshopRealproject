package com.tricenties.objectrepository;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RegisterPage 
	{
			public RegisterPage(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}
			//declare
			@FindBy(xpath="//input[@value='F']")
			private WebElement genderRadioButton;
			
			@FindBy(id="FirstName")
			private WebElement firstNameTextField;

			@FindBy(name="LastName")
			private WebElement LastNameTextField;
			
			@FindBy(id="Email")
			private WebElement emailTextField;
			
			@FindBy(id="Password")
			private WebElement passwordTextField;
			
			@FindBy(id="ConfirmPassword")
			private WebElement confirmpasswordTextField;
			
			@FindBy(xpath="//input[@value='Register']")
			private WebElement registerbutton;
			
			@FindBy(xpath="//input[@value='Continue']")
			private WebElement continuebutton;

			public WebElement getGenderRadioButton() {
				return genderRadioButton;
			}

			public WebElement getFirstNameTextField() {
				return firstNameTextField;
			}

			public WebElement getLastNameTextField() {
				return LastNameTextField;
			}

			public WebElement getEmailTextField() {
				return emailTextField;
			}

			public WebElement getPasswordTextField() {
				return passwordTextField;
			}

			public WebElement getConfirmpasswordTextField() {
				return confirmpasswordTextField;
			}

			public WebElement getRegisterbutton() {
				return registerbutton;
			}

			public WebElement getContinuebutton() {
				return continuebutton;
			}


			}

