package com.appium.definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.appium.base.AppiumBase;
import com.appium.exceptions.BaseException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.implementation.bind.annotation.Super;

    public class Initialize extends AppiumBase {
    	
    	public Initialize(String osType) throws Throwable {
			super(osType);
		}
		
    	public static void main(String[] args) throws Throwable {
    		Initialize obj = null;
    		try {
    			AppiumBase app = new AppiumBase("android");
    			AppiumDriver<WebElement> driver =app.driver;
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
        		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		driver.findElementByXPath("//android.widget.TextView[@text='LOGIN']").click();
        		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		driver.findElementByXPath("//android.widget.EditText[@text='Mobile No']").sendKeys("9486704144");
        		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("White@123");
        		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		driver.findElementByXPath("//android.widget.TextView[@text='LOGIN']").click();
        		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        		driver.findElementByXPath("//android.widget.TextView[@text='Bengaluru']").click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.TextView[@text='Banking']").click(); 
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.TextView[@text='Stalin']").click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.TextView[@text='Stalin Associates']"). click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.TextView[@text='More']").click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.CheckedTextView[@text='Me']").click();
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.findElementByXPath("//android.widget.TextView[@text='Log Out']").click();
    		}catch(Exception ex) {
    			throw new BaseException(ex.getMessage());
    		}
    		
    		
//    		obj.driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
    		
    		
    	}
}