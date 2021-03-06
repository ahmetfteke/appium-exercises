
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class findingElements {
	AndroidDriver driver;
	@Test 
	public void testAppium() throws MalformedURLException, InterruptedException{

		
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "TqBot1");
		capability.setCapability("platformVersion", "4.4.2");
		capability.setCapability("platformName", "Android");
		
		File file = new File("C:\\AndroidWorks\\Appium_1\\apk\\VyprVPN.apk");
		capability.setCapability("app", file.getAbsolutePath());
		
		driver = new AndroidDriver(new URL("http://192.168.101.12:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.goldenfrog.vyprvpn.app:id/connect_button_connect_doconnect")).click();
		Thread.sleep(10000);
		//WebElement connect = driver.findElementById("com.goldenfrog.vyprvpn.app:id/connect_button_connect_label");
		//System.out.println(connect.getAttribute("text"));
		//driver.findElementByXPath("//android.widget.TextView[@id='com.goldenfrog.vyprvpn.app:id/connect_button_connect_label']").click(); xpath = class attribute
		//List<WebElement> buttons = driver.findElementsByClassName("android.widget.TextView");
		
		for (int i = 0; i < buttons.size(); i++){
			System.out.println(buttons.get(i).getText());
			if(buttons.get(i).getText().equals("Connect")){
				buttons.get(i).click();
			}
		}
		//for(WebElement button: buttons){
		//	System.out.println(button.getText());
		//}
		
		DesiredCapabilities capability2 = new DesiredCapabilities();
		capability2.setCapability("deviceName", "TqBot1");
		capability2.setCapability("platformVersion", "4.4.2");
		capability2.setCapability("platformName", "Android");
		
		File file2 = new File("C:\\AndroidWorks\\Appium_1\\apk\\textPlusFree.apk");
		capability2.setCapability("app", file2.getAbsolutePath());

		driver = new AndroidDriver(new URL("http://192.168.101.12:4723/wd/hub"), capability2);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.id("com.gogii.textplus:id/signup_button")).click();
		driver.findElement(By.id("com.gogii.textplus:id/email_address_field")).sendKeys("testeterer@gmail.com");
		driver.findElement(By.id("com.gogii.textplus:id/verify_button")).click();

		driver.findElement(By.id("com.gogii.textplus:id/userProfile_table_birthday_value")).click();
		
		
	}
	@AfterTest
	public void afterTest() throws InterruptedException{
		Thread.sleep(5000);
	}
}
