package fotf_Testcase;

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

public class AboutusPage_PageEditor_Article extends Basedriver{

	//SiteCore Login
	@BeforeMethod
	public static void LoginSitecore(){
		Driver.get("http://testpub.focusonthefamily.com/sitecore/login");
		Opr_Sitecore_AboutUs.loginSitecore();
	}	

	// Testcase for AboutUs_Article
	@Test
	public static void AboutUs_Article() throws InterruptedException {
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18396 - FOTF: About Us: Control Rendering: Article ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("Article");
			Opr_PageEditor_AboutUs.createLayout("Article");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("Article", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}
	
	//Testcase for AboutUs_ArticlePublicationDate
	@Test
	public static void AboutUs_ArticlePublicationDate() throws InterruptedException{
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: 18397 - FOTF: About Us: Control Rendering: Article Publication Date ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ArticlePubDate");
			Opr_PageEditor_AboutUs.createLayout("ArticlePubDate");
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ArticlePubDate", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly");
		}
	}
	
	//Testcase for AboutUs_MergeArticleAndArticle
	@Test	
	public static void AboutUs_MergeArticleAndArticle() throws InterruptedException{
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - PBI: B-01272 - FOTF: About Us: Control Rendering: Merge Article And Article***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("MergeArticleAndArticle");
			Opr_PageEditor_AboutUs.ArticlePageEditor();	
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("MergeArticleAndArticle", "PageEditor");
		}catch(Exception e){
			Driver.navigate().refresh();
			log.fatal("TEST METHOD FAILED: Terminated Abruptly " + e.getLocalizedMessage());
		}
	}
			
	//Testcase for AboutUs_ArticleIsFeatured
	@Test	
	public static void AboutUs_ArticleIsFeatured() throws InterruptedException{
		try{
			log.info("");
			log.info("PAGE EDITOR MODE");
			log.info("__________________________________________________________________________________________________");
			log.info("*** TestCase - User Story: B-01271 - FOTF: About Us: Control Rendering: AboutUs_ArticleIsFeatured ***");
			log.info("__________________________________________________________________________________________________");
			Opr_Sitecore_AboutUs.navigateToFOTFcom();
			Opr_Sitecore_AboutUs.createAboutUs();
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("ArticleIsFeatured");			
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("marriage");
			Opr_Sitecore_AboutusDatasource.AboutUsDatasource("parenting");
			Opr_PageEditor_AboutUs.createLayout("ArticleIsFeatured");	
			Opr_Sitecore_AboutUs_Assert.AssertAboutus("ArticleIsFeatured", "PageEditor");
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
