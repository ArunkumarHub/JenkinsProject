package fotf_Testcase;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Datasource.Opr_AboutUsDataSourceForChildItems_DataProvider;
import fotf_Datasource.Opr_AboutUsDataSource_DataProvider;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Datasource.Opr_Sitecore_CustomInitiativeDatasource;
import fotf_Operations.Opr_AboutUs_AssertElement;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class AboutusPage_ContentEditor_CustomInitiative extends Basedriver{

    //SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://testpub.focusonthefamily.com:91/sitecore");
		Opr_Sitecore_AboutUs.loginSitecore();
	}  

	//Testcase for Custom Initiative Hero Image Left
	@Test
	public static void Initiative_LeftHeroImage() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: B-01691 - FOTF: Custom Initiative Hero Image Left ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createCustomInitiativeComponent();
			Opr_Sitecore_CustomInitiativeDatasource.CustomInitiativeComponentDatasource("CustomInitiativeComponent");
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("InitiativeLeftHeroImage");
			Opr_ContentEditor_AboutUs.createCustomInitiativeLayout("InitiativeLeftHeroImage");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("InitiativeLeftHeroImage", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for Custom Initiative Hero Image Right
	@Test
	public static void Initiative_RightHeroImage() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: B-01691 - FOTF: Custom Initiative Hero Image Right ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createCustomInitiativeComponent();
			Opr_Sitecore_CustomInitiativeDatasource.CustomInitiativeComponentDatasource("CustomInitiativeComponent");
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("InitiativeRightHeroImage");
			Opr_ContentEditor_AboutUs.createCustomInitiativeLayout("InitiativeRightHeroImage");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("InitiativeRightHeroImage", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for Custom Initiative Hero Video Right
	@Test
	public static void Initiative_RightHeroVideo() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: B-01691 - FOTF: Custom Initiative Hero Video Right ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createCustomInitiativeComponent();
			Opr_Sitecore_CustomInitiativeDatasource.CustomInitiativeComponentDatasource("CustomInitiativeComponent");
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("InitiativeRightHeroVideo");
			Opr_ContentEditor_AboutUs.createCustomInitiativeLayout("InitiativeRightHeroVideo");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("InitiativeRightHeroVideo", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for Custom Initiative Hero Video Left
	@Test
	public static void Initiative_LeftHeroVideo() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: B-01691 - FOTF: Custom Initiative Hero Video Left ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createCustomInitiativeComponent();
			Opr_Sitecore_CustomInitiativeDatasource.CustomInitiativeComponentDatasource("CustomInitiativeComponent");
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("InitiativeLeftHeroVideo");
			Opr_ContentEditor_AboutUs.createCustomInitiativeLayout("InitiativeLeftHeroVideo");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("InitiativeLeftHeroVideo", "ContentEditor");
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
