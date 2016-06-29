package fotf_Testcase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Objects.Obj_Channel;
import fotf_Objects.Obj_Home;

public class Fotf_Homepage extends Basedriver{
	@BeforeMethod
	public static void baseUrl(){
		Driver.get("http://test.focusonthefamily.com");
	}
	// Testcase for verifying FOTF Home page
	@Test
	public static void verify_fotf_logo(){
		log.info("Testcase Execution starts for verify Operation on FOTF Home Page Content");
		
		homepageObj.home_logo();
			
		
	}
	/*// Testcase for clicking FOTF Home page Objects
	@Test
	public static void click_fotf_channels(){
		log.info("Testcase Execution starts for click Operation on FOTF Home Page Channel Content");
		
		channelObj=homepageObj.channel_url();
		
		
	}*/
	
	
}
