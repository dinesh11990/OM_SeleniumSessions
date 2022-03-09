package com.askomdch.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestCase {
	
	
	@Test
	public void guestCheckoutUsingDirectBankTransfer() throws InterruptedException {

		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\ArulPrasad Academy\\backup selenium and JDK\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://askomdch.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
		driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");
		driver.findElement(By.cssSelector("button[value='Search']")).click();
		
		Assert.assertEquals(
				
				driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText(),
				"Search results: “Blue”");
		
		driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[title='View cart']")).click();
		
		Assert.assertEquals(
				
				driver.findElement(By.cssSelector("td[class='product-name'] a")).getText(),"Blue Shoes");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward")).click();
		

	}

}
