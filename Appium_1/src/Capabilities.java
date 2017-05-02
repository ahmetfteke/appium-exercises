import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Capabilities {
	AndroidDriver driver;
	@Test 
	public void testAppium() throws MalformedURLException{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "TqBot1");
		capability.setCapability("platformVersion", "4.4.2");
		capability.setCapability("platformName", "Android");
		
		File file = new File("C:\\AndroidWorks\\Appium_1\\apk\\VyprVPN.apk");
		capability.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver(new URL("http://192.168.101.12:4723/wd/hub"), capability);
		
	}
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
}
