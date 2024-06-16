package com.tricenties.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
		
		


		@FindBy(linkText="Log out")
		private WebElement logoutLink;
		
		@FindBy(partialLinkText = "BOOKS")
		private WebElement booksLink;
		
		

      @FindBy(partialLinkText = "COMPUTERS")
		private WebElement computerLink;
		
		
      @FindBy(xpath = "//p[@class='content']")
  	private WebElement confirmMessage;

		
		
		public WebElement getConfirmMessage() {
		return confirmMessage;
	}
		public WebElement getLogoutLink() {
			return logoutLink;
		}
		public WebElement getBooksLink() {
			return booksLink;
		}
		public WebElement getComputerLink() {
			return computerLink;
		}
		
}
