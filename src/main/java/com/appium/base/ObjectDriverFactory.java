package com.appium.base;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.appium.exceptions.BaseException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author DeanJones
 *
 */
public class ObjectDriverFactory  extends BaseException{
	public ObjectDriverFactory(String msg) {
		super(msg);
	}

	private AppiumDriver<WebElement> driverFatory;
	
	/**
	 * @param applicationOSType
	 * @return
	 * @throws Throwable
	 */
	public AppiumDriver<WebElement> setUp(String applicationOSType) throws Throwable {
		
		try {
			if(applicationOSType.equalsIgnoreCase("android")) {
				android();
				
			}else if(applicationOSType.equalsIgnoreCase("ios")) {
				ios();
			}
			
		}catch(Exception ex) {
			throw new ObjectDriverFactory(ex.getMessage());
		}
		return this.driverFatory;
        
    }
	
	/**
	 * @throws BaseException
	 */
	private void android() throws BaseException{
		try {
			 final File classpathRoot = new File("src/main/resources/apk");
	            final File app = new File(classpathRoot.getCanonicalPath(), "app-debugBase.apk");
	            System.out.println(app.getAbsolutePath());
	            final DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PDA");
	            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	            capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);//reinstalls the application
	            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
	            this.driverFatory =  new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new ObjectDriverFactory(ex.getMessage());
		}
           
	}
	
	/**
	 * @throws BaseException 
	 * @throws Throwable
	 */
	private void ios() throws BaseException {
		try {
			  final File classpathRoot = new File("src/main/resources/apk");
	            final File app = new File(classpathRoot.getCanonicalPath(), "app-debugSkip.apk");
	            System.out.println(app.getAbsolutePath());
	            final DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PDA");
	            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	            capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);//reinstalls the application
	            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
	            this.driverFatory =  new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		}catch (Exception ex) {
			throw new ObjectDriverFactory(ex.getMessage());
		}
          
	}
	

}
