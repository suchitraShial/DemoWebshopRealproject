package com.tricenties.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartrLink;
	@FindBy(xpath="//span[text()='wishlist']")
	private WebElement wishlistLink;
	
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getShoppingCartrLink() {
		return shoppingCartrLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
