package com.appium.definitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import com.appium.base.AppiumBase;

    public class Legat_Skip extends AppiumBase {
    	private AndroidDriver<WebElement> driver;
    	public static void main(String[] args) {
    		Legat_Skip obj = new Legat_Skip();
    		obj.driver = obj.setUp();
    		
    		obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		obj.driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
    		obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		obj.driver.findElementByXPath("//android.widget.TextView[@text='LOGIN']").click();
    		obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		obj.driver.findElementByXPath("//android.widget.EditText[@text='Mobile No']").sendKeys("9486704144");
    		obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		obj.driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("White@123");
    		obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		obj.driver.findElementByXPath("//android.widget.TextView[@text='LOGIN']").click();
    		obj.driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
    		obj.driver.findElementByXPath("//android.widget.TextView[@text='Bengaluru']").click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.TextView[@text='Banking']").click(); 
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.TextView[@text='Stalin']").click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.TextView[@text='Stalin Associates']"). click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.TextView[@text='More']").click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.CheckedTextView[@text='Me']").click();
			obj.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obj.driver.findElementByXPath("//android.widget.TextView[@text='Log Out']").click();
//    		obj.driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
    		
    		
    	}
}