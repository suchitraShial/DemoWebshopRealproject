package com.tricenties.shoppingcart;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tricenties.genericutility.BaseClass;

public class TC_WS_003_Test extends BaseClass {
@Test
public void addproducttocart() {
	driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
	boolean msgStatus=homePage.getConfirmMessage().isDisplayed();
	Asset.assertEq
}
}
