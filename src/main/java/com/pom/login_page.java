package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;//----> null
	
	@FindBy(id="email_create") private WebElement em;
	@FindBy(id="SubmitCreate") private WebElement sc;
	@FindBy(xpath="//input[@id='id_gender1']") private WebElement tt;
	@FindBy(xpath="//input[@id='customer_firstname']") private WebElement fn;
	@FindBy(id="customer_lastname") private WebElement ln;
	@FindBy(id="passwd") private WebElement pwd;
	@FindBy(xpath="//select[@name='days']") private WebElement dy;
	@FindBy(xpath="//select[@name='months']") private WebElement mt;
	@FindBy(xpath="//select[@name='years']") private WebElement ys;
	@FindBy(id="address1") private WebElement ad;
	@FindBy(id="id_country") private WebElement St;
	@FindBy(id="city") private WebElement cit;
	@FindBy(id="id_state") private WebElement ct;
	@FindBy(id="postcode") private WebElement pt;
	@FindBy(id="phone_mobile") private WebElement pm;
	@FindBy(id="alias") private WebElement al;
	@FindBy(id="submitAccount") private WebElement rgst;
	@FindBy(xpath="//a[@title='Return to Home']") private WebElement hme;
	
	
	
	
	

	public login_page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}






	public WebElement getEm() {
		return em;
	}


	public WebElement getSc() {
		return sc;
	}


	public WebElement getTt() {
		return tt;
	}



	public WebElement getFn() {
		return fn;
	}



	public WebElement getLn() {
		return ln;
	}


	public WebElement getPwd() {
		return pwd;
	}


	public WebElement getDy() {
		return dy;
	}


	public WebElement getMt() {
		return mt;
	}


	public WebElement getYs() {
		return ys;
	}


	public WebElement getAd() {
		return ad;
	}


	public WebElement getCt() {
		return ct;
	}


	public WebElement getPt() {
		return pt;
	}


	public WebElement getPm() {
		return pm;
	}


	public WebElement getAl() {
		return al;
	}


	public WebElement getRgst() {
		return rgst;
	}



	public WebElement getSt() {
		return St;
	}

	
	public WebElement getCit() {
		return cit;
	}






	public WebElement getHme() {
		return hme;
	}



}
