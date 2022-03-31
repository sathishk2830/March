package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
	
	
	public WebDriver driver;//----> null
	
	@FindBy(className="login") 
	private WebElement lg;

	public home_page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLg() {
		return lg;
	}

	

}
