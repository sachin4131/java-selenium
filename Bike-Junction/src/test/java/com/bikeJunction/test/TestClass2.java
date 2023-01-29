package com.bikeJunction.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {
		
	    WebDriver driver;
		HomePage1 homePage1;
		Actions bikesAct; 

		@BeforeClass
		public void lounchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\selenium setup\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikejunction.in/");
		
		}
		@BeforeMethod
		public void creatObject() {
			
		homePage1 =new HomePage1(driver);
		}
		@Test(priority=1)
		public void verifybikeLoan() {	
		homePage1.clickOnBikeLoanButton();
		String bikeLoanPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(bikeLoanPageUrl, "https://www.bikejunction.in/en/bike-loan");
		System.out.println("Bike Loan");
		}
		
		@Test(priority=2)
		public void verifydealer() {
		homePage1.clickOnDealerButton();
		String dealerPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(dealerPageUrl, "https://www.bikejunction.in/en/bike-dealer-showrooms");
		System.out.println("dealer");
		}
		
		@Test(priority=3)
		public void verifycompareBike() {
		homePage1.clickOnCompareBikeButton();
		String compareBikePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(compareBikePageUrl, "https://www.bikejunction.in/en/compare-bikes");
		System.out.println("compare bike");
		}
		
		@Test(priority=4)
		public void verifyemiCalculator() {
		homePage1.clickOnemiCalculaterButton();
		String emiCalculatorPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(emiCalculatorPageUrl , "https://www.bikejunction.in/en/bike-loan-emi-calculator");
		System.out.println("emi calculator");
		}
		
		@Test(priority=5)
		public void verifygetOnRoadPrice() {
		homePage1.clickOnGetOnRoadPriceButton();
		String getOnRoadPricePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(getOnRoadPricePageUrl, "https://www.bikejunction.in/en/check-on-road-price-in-india");
		System.out.println("get on road price");
		}
		
		@Test(priority=6)
		public void verifyNews() {
		homePage1.clickOnNewsButton();
		String newsPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(newsPageUrl, "https://www.bikejunction.in/en/news");
		System.out.println("News");
		}
		
		@Test(priority=7)
		public void verifyBestBikesDropdownPage() {
		homePage1.clickOnbestBikesDropdownButton();
		String bestBikesDropdownPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(bestBikesDropdownPageUrl, "https://www.bikejunction.in/en/best-bikes-in-india");
		}
		
		@Test(priority=8)
		public void verifyLatestBikesDropdownPage() {
		homePage1.clickOnLatestBikesDropdownButton();
		String latestBikesDropdownPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(latestBikesDropdownPageUrl, "https://www.bikejunction.in/en/latest-bikes");
		}
		
		@AfterClass
		public void closeBroweser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		}	
}
