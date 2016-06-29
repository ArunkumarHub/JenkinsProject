package fotf_Testcase;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class AboutusPage_ContentEditor_Header extends Basedriver{

    //SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://10.194.5.65/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}

    		
	//Testcase for AboutUs_HeaderImageOnLeft
	@Test
	public static void AboutUs_HeaderImageOnLeft() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17718 - FOTF: About Us: Rendering: Header Image On Left ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("HeaderImageLeft");
			Opr_ContentEditor_AboutUs.createLayout("HeaderImageLeft");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("HeaderImageLeft", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
		
	//Testcase for AboutUs_HeaderImageOnLeft
	@Test
	public static void AboutUs_HeaderImageOnRight() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17719 - FOTF: About Us: Rendering: Header Image On Right ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("HeaderImageRight");
			Opr_ContentEditor_AboutUs.createLayout("HeaderImageRight");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("HeaderImageRight", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
				
	//Testcase for AboutUs_HeaderImageOnLeft
	@Test
	public static void AboutUs_HeaderImageOnTop() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17720 - FOTF: About Us: Rendering: Header Image On Top ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("HeaderImageTop");
			Opr_ContentEditor_AboutUs.createLayout("HeaderImageTop");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("HeaderImageTop", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for AboutUs_HeaderVideoOnRight
	@Test
	public static void AboutUs_HeaderVideoOnRight() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17821 - FOTF: About Us: Rendering: Header Video on the right ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("HeaderVideoRight");
			Opr_ContentEditor_AboutUs.createLayout("HeaderVideoRight");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("HeaderVideoRight", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for AboutUs_HeaderImageCarousel
	@Test
	public static void AboutUs_HeaderImageCarousel() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17819 - FOTF: About Us: Rendering: Header Image Carousel ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("HeaderImageCarousel");
			Opr_ContentEditor_AboutUs.createLayout("HeaderImageCarousel");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("HeaderImageCarousel", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	
	
	// Logout Sitecore
	@AfterMethod
	public static void LogoutSitecore() throws InterruptedException{
		Thread.sleep(2000);
		sitecoreObj.systemMenu.click();
		Thread.sleep(2000);
		sitecoreObj.logOut.click();
	}	
}
