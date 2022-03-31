package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.home_page;
import com.pom.login_page;

public class Page_object_manager {

	public WebDriver driver;
	// private ClassName object
	private home_page hp; //null
	private login_page lp;
	
	public Page_object_manager(WebDriver driver2) {
		this.driver= driver2;
	}


	public home_page get_instance_hp(){
		
		if (hp==null) {
			hp = new home_page(driver);
		}
		return hp;
	}
	
	public login_page get_instance_lp(){
		
		if(lp==null) {
			lp = new login_page(driver);
		}
		return lp;
	}
}
