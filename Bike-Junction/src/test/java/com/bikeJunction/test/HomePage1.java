package com.bikeJunction.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	
	private WebDriver driver;
//	private Actions act;
	
	@FindBy (xpath="//a[@title='Bike Loan']") 
	private WebElement bikeLoan;
	
	@FindBy (xpath="//a[@title='Dealers']")
	private WebElement dealer;
	
	@FindBy (xpath="(//a[@title='Compare Bikes'])[2]")
	private WebElement compareBike;
	
	@FindBy (xpath="//a[@title='EMI Calculator']")
	private WebElement emiCalulator;
	
	@FindBy (xpath="//a[@title='Get On-Road Price']")
	private WebElement getOnRoadPrice;
	
	@FindBy (xpath="//a[@title='News']")
	private WebElement news;
	
	@FindBy (xpath="//a[@title='Bikes']")
	private WebElement bikesDropdown;
	
	@FindBy (xpath="//a[@title='Best bikes']")
	private WebElement bestBikesDropdown;
	
	@FindBy (xpath="//a[@title='Latest Bikes']")
	private WebElement latestBikesDropdown;
	
	public HomePage1(WebDriver driver) {
//		new Actions(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnBikeLoanButton()
	{
		bikeLoan.click();
	}
	public void clickOnDealerButton()
	{
		dealer.click();
	}
	public void clickOnCompareBikeButton()
	{
		compareBike.click();
	}
	public void clickOnemiCalculaterButton()
	{
		emiCalulator.click();
	}
	public void clickOnGetOnRoadPriceButton()
	{
		getOnRoadPrice.click();
	}
	public void clickOnNewsButton()
	{
		news.click();
	}
	public void clickOnbestBikesDropdownButton()
	{
		Actions act = new Actions(driver);
		act.moveToElement(bikesDropdown).perform();
		act.moveToElement(bestBikesDropdown).click().build().perform();
	}
	public void clickOnLatestBikesDropdownButton()
	{
		Actions act = new Actions(driver);
		act.moveToElement(bikesDropdown).perform();
		act.moveToElement(latestBikesDropdown).click().build().perform();
	}

}
