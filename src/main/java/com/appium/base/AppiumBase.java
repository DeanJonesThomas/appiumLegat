package com.appium.base;

import org.openqa.selenium.WebElement;

import com.appium.exceptions.BaseException;

import io.appium.java_client.AppiumDriver;

public class AppiumBase
{
    public AppiumDriver<WebElement> driver;
    
    public AppiumBase(String osType) throws Throwable {
        try {
        	ObjectDriverFactory odf = new ObjectDriverFactory(osType);
        	driver = odf.setUp(osType);
        }
        catch (Exception ex) {
        	throw new BaseException(ex.getMessage());
        }
    }
}