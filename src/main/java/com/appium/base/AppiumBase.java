package com.appium.base;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumBase
{
    private AndroidDriver<WebElement> driver;
    
    public AndroidDriver<WebElement> setUp() {
        try {
            final File classpathRoot = new File("src/main/resources/apk");
            final File app = new File(classpathRoot.getCanonicalPath(), "app-debugSkip.apk");
            System.out.println(app.getAbsolutePath());
            final DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "AVDDevice2");
            capabilities.setCapability("app", app.getAbsolutePath());
          //  capabilities.setCapability("appPackage", "io.appium.android.apis");
           // capabilities.setCapability("appActivity", ".ApiDemos");
            driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            return driver;
        }
        catch (Exception ex) {
            return null;
        }
    }
}