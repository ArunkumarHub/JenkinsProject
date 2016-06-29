package fotf_Testcase;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fotf_Config.Basedriver;
import fotf_Datasource.Opr_AboutUsDataSource_DataProvider;
import fotf_Datasource.Opr_Sitecore_AboutusDatasource;
import fotf_Operations.Opr_AboutUs_AssertElement;
import fotf_Operations.Opr_AboutUs_AssertElement_FourItem;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs_Assert;

public class AboutusPage_ContentEditor_OneItem extends Basedriver{

    //SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		//Driver.get("http://10.194.5.65/sitecore/login");
		Driver.get(baseFotfUrl+"focusonthefamily.com/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}

    //Testcase for AboutUs_ImageOnRight
	@Test
	public static void AboutUs_ImageOnRight() throws InterruptedException{		
		try{
			log.info("");
			log.info("__________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17825 - FOTF: About Us: Rendering: Image on Right ***");
			log.info("__________________________________________________________________________________");		
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ImageRight");
			Opr_ContentEditor_AboutUs.createLayout("ImageRight");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ImageRight", "ContentEditor");			
			for(int i=0; i<=5; i++)	{
				for(int j=0; j<=5; j++){	
					if(!(i==0 && j==0)){
						//log.info("i=="+ i	+	"	j=="+j );
						//Opr_Sitecore_AboutUs.navigateToFOTFcom();
						Opr_AboutUsDataSource_DataProvider.CommonComponentImageShape("ImageRight", "", i);
						Opr_AboutUsDataSource_DataProvider.CommonComponentImageSize("ImageRight", "ContentEditor", j);	
						
						Thread.sleep(5000);
						Opr_AboutUs_AssertElement.VerifyCommonComponent_ImageShapeWithImageSize("ImageRight", i, j);
						Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD")).close();
						Thread.sleep(3000);
						Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("PARENT"));
						Thread.sleep(3000);
					}
				}
			}
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());		
		}
	}

	//Testcase for AboutUs_ImageOnLeft
	@Test
	public static void AboutUs_ImageOnLeft() throws InterruptedException{		
		try{
			log.info("");
			log.info("__________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17826 - FOTF: About Us: Rendering: Image on Left ***");
			log.info("__________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ImageLeft");
			Opr_ContentEditor_AboutUs.createLayout("ImageLeft");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ImageLeft", "ContentEditor");
			for(int i=0; i<=5; i++)	{
				for(int j=0; j<=5; j++){	
					if(!(i==0 && j==0)){
						Opr_AboutUsDataSource_DataProvider.CommonComponentImageShape("ImageLeft", "", i);
						Opr_AboutUsDataSource_DataProvider.CommonComponentImageSize("ImageLeft", "ContentEditor", j);	
						
						Thread.sleep(5000);
						Opr_AboutUs_AssertElement.VerifyCommonComponent_ImageShapeWithImageSize("ImageLeft", i, j);
						Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("CHILD")).close();
						Thread.sleep(3000);
						Driver.switchTo().window(Opr_Sitecore_AboutUs_Assert.GetChildWindow("PARENT"));
						Thread.sleep(3000);
					}
				}
			}
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}

	//Testcase for AboutUs_ButtonOnRight
	@Test
	public static void AboutUs_ButtonOnRight() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17721 - FOTF: About Us: Rendering: Button on Right ***");
			log.info("__________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ButtonRight");
			Opr_ContentEditor_AboutUs.createLayout("ButtonRight");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ButtonRight", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}

	//Testcase for AboutUs_ButtonOnLeft
	@Test
	public static void AboutUs_ButtonOnLeft() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17823 - FOTF: About Us: Rendering: Button on Left ***");
			log.info("__________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ButtonLeft");
			Opr_ContentEditor_AboutUs.createLayout("ButtonLeft");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ButtonLeft", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}		
	}

	//Testcase for AboutUs_ButtonOnBottom
	@Test
	public static void AboutUs_ButtonOnBottom() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17827 - FOTF: About Us: Rendering: Button on Bottom ***");
			log.info("__________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ButtonBottom");
			Opr_ContentEditor_AboutUs.createLayout("ButtonBottom");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ButtonBottom", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for AboutUs_LeftAlignedImageListItems
	@Test
	public static void AboutUs_LeftAlignedImageListItems() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17822 - FOTF: About Us: Rendering: Left-Aligned Image with List Items ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("LeftImageList");
			Opr_ContentEditor_AboutUs.createLayout("LeftImageList");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("LeftImageList", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for AboutUs_RightAlignedImageListItems
	@Test
	public static void AboutUs_RightAlignedImageListItems() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17824 - FOTF: About Us: Rendering: Right-Aligned Image with List Items ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("RightImageList");
			Opr_ContentEditor_AboutUs.createLayout("RightImageList");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("RightImageList", "ContentEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
	
	//Testcase for AboutUs_IFrameOnRightAlignedImageListItems
	@Test
	public static void AboutUs_IFrameOnRightAlignedImageListItems() throws InterruptedException{
		try{
			log.info("");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 17829 - FOTF: About Us: Rendering: IFrame on Right with list Items ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("IFrameRightImageList");
			Opr_ContentEditor_AboutUs.createLayout("IFrameRightImageList");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("IFrameRightImageList", "ContentEditor");
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
