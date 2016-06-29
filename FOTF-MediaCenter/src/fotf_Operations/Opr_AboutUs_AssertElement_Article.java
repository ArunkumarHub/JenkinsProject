package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;
import fotf_Datasource.Opr_AboutUsDataSource_DataProvider;

public class Opr_AboutUs_AssertElement_Article extends Basedriver{
	
	//Article Component				
		// Verify Article Component Bread Crumbs for AutoAboutUs Preview page
		public static void VerifyArticle_BreadCrumbs(){
			String actualBreadCrumbs="";
			try{
				actualBreadCrumbs=sitecoreObj_Article.aboutusArticleBreadCrumbs.getAttribute("class");
				Assert.assertEquals(actualBreadCrumbs, expectedData.getProperty("ArticleBreadCrumbs"));
				log.info("The Actual AboutUs Article Bread Crumbs - "+actualBreadCrumbs);
				log.info("The Expected AboutUs Article Bread Crumbs - "+expectedData.getProperty("ArticleBreadCrumbs"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Bread Crumbs are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Bread Crumbs - "+actualBreadCrumbs);
				log.error("The Expected AboutUs Article Bread Crumbs - "+expectedData.getProperty("ArticleBreadCrumbs"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Bread Crumbs are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Article Bread Crumbs element");
			}
		}
		
		// Verify Article Component Title for AutoAboutUs Preview page
		public static void VerifyArticle_Title(){
			String actualTitle="";
			try{
				actualTitle=sitecoreObj_Article.aboutusArticleTitle.getAttribute("class");
				Assert.assertEquals(actualTitle, expectedData.getProperty("ArticleTitle"));
				log.info("The Actual AboutUs Article Title - "+actualTitle);
				log.info("The Expected AboutUs Article Title - "+expectedData.getProperty("ArticleTitle"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Title are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Title - "+actualTitle);
				log.error("The Expected AboutUs Article Title - "+expectedData.getProperty("ArticleTitle"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Title are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Article Title element");
			}
		}
		
		// Verify Article Component Author for AutoAboutUs Preview page
		public static void VerifyArticle_Author(){
			String actualAuthor="";
			try{
				actualAuthor=sitecoreObj_Article.aboutusArticleAuthor.getAttribute("class");
				Assert.assertEquals(actualAuthor, expectedData.getProperty("ArticleAuthor"));
				log.info("The Actual AboutUs Article Author - "+actualAuthor);
				log.info("The Expected AboutUs Article Author - "+expectedData.getProperty("ArticleAuthor"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Author are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Author - "+actualAuthor);
				log.error("The Expected AboutUs Article Author - "+expectedData.getProperty("ArticleAuthor"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Author are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Article Author element");
			}
		}
		
		// Verify Article Component Topic for AutoAboutUs Preview page
		public static void VerifyArticle_Topic(){
			String actualTopic="";
			try{
				actualTopic=sitecoreObj_Article.aboutusArticleTopic.getAttribute("class");
				Assert.assertEquals(actualTopic, expectedData.getProperty("ArticleTopic"));
				log.info("The Actual AboutUs Article Topic - "+actualTopic);
				log.info("The Expected AboutUs Article Topic - "+expectedData.getProperty("ArticleTopic"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Topic are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Topic - "+actualTopic);
				log.error("The Expected AboutUs Article Topic - "+expectedData.getProperty("ArticleTopic"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Topic are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Topic On Article Topic element");
			}
		}
		
		// Verify Article Component Image for AutoAboutUs Preview page
		public static void VerifyArticle_Image(){
			String actualImage="";
			try{
				actualImage=sitecoreObj_Article.aboutusArticleImage.getAttribute("class");
				Assert.assertEquals(actualImage, expectedData.getProperty("ArticleImage"));
				log.info("The Actual AboutUs Article Image - "+actualImage);
				log.info("The Expected AboutUs Article Image - "+expectedData.getProperty("ArticleImage"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Image are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Image - "+actualImage);
				log.error("The Expected AboutUs Article Image - "+expectedData.getProperty("ArticleImage"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Image are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Article Image element");
			}
		}
		
		// Verify Article Component Description for AutoAboutUs Preview page
		public static void VerifyArticle_Description(){
			boolean actualHeaderText=false;
			try{
				actualHeaderText=sitecoreObj_Article.aboutusArticleDescription.isDisplayed();
				Assert.assertEquals(actualHeaderText, true);
				log.info("The Actual AboutUs Article Description - <"+sitecoreObj_Article.aboutusArticleDescription.getTagName()+">");
				log.info("The Expected AboutUs Article Description - <p>");	
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Description are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Description - <"+sitecoreObj_Article.aboutusArticleDescription.getTagName()+">");
				log.error("The Expected AboutUs Article Description - <p>");						
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Description are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Article Description");
			}
		}
		
		public static void VerifyArticle_PublicationDate()
		{
			String actualPubDate="";
			try{
				actualPubDate=sitecoreObj_Article.aboutusArticleAuthor.getAttribute("class");
				Assert.assertEquals(actualPubDate, expectedData.getProperty("ArticleAuthor"));
				
				log.info("The Actual AboutUs Article Publication Date Text - "+sitecoreObj_Article.aboutusArticleAuthor.getText());
				log.info("The Actual AboutUs Article Publication Date - "+actualPubDate);
				log.info("The Expected AboutUs Article Publication Date - "+expectedData.getProperty("ArticleAuthor"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Publication Date are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Publication Date Text - "+sitecoreObj_Article.aboutusArticleAuthor.getText());
				log.error("The Actual AboutUs Article Publication Date - "+actualPubDate);
				log.error("The Expected AboutUs Article Publication Date - "+expectedData.getProperty("ArticleAuthor"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article Publication Date are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Publication Date On Article element");
			}
		}
		
		// Verify Article ContentTitle Element for the TitleText Component on AutoAboutUs Preview page
				public static void VerifyArticleTitleText_ContentTitle(){
					String actualTitleTextContentTitle = null;
					
					try{
						actualTitleTextContentTitle=sitecoreObj_Article.aboutusArticleTitleText.getText();
						Assert.assertEquals(actualTitleTextContentTitle, expectedData.getProperty("ArticleTitleText"));
						log.info("The Actual AboutUs Article Title Text is - "+actualTitleTextContentTitle);
						log.info("The Expected AboutUs Article Title Text is - "+expectedData.getProperty("ArticleTitleText"));
						log.info("TEST PASSED: The Actual and Expected AboutUs Article Title Text are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs Article Title Text is - "+actualTitleTextContentTitle);
						log.error("The Expected AboutUs Article Title Text is - "+expectedData.getProperty("ArticleTitleText"));
						log.error("TEST FAILED: The Actual and Expected AboutUs Article TitleText ContentTitle are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Override article ContentTitle element On Article TitleText Container");
					}		
				  }
				
		// Verify Article Component Bread Crumbs Text for AutoAboutUs Preview page
				public static void VerifyArticle_BreadCrumbsText(){
					String actualBreadCrumbs="";
					try{
						actualBreadCrumbs=sitecoreObj_Article.aboutusArticleBreadCrumbs.getText();
						Assert.assertEquals(actualBreadCrumbs, expectedData.getProperty("ArticleBreadCrumbsText"));
						log.info("The Actual AboutUs Article Bread Crumbs Text - "+actualBreadCrumbs);
						log.info("The Expected AboutUs Article Bread Crumbs Text - "+expectedData.getProperty("ArticleBreadCrumbsText"));
						log.info("TEST PASSED: The Actual and Expected AboutUs Article Bread Crumbs Text are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs Article Bread Crumbs Text - "+actualBreadCrumbs);
						log.error("The Expected AboutUs Article Bread Crumbs Text - "+expectedData.getProperty("ArticleBreadCrumbsText"));
						log.error("TEST FAILED: The Actual and Expected AboutUs Article Bread Crumbs Text are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Image On Article Bread Crumbs Text ");
					}
				}

		// Verify Article ContentRich Element for the RichText Component on AutoAboutUs Preview page
		public static void VerifyArticleRichText_ContentRich(){
			String actualRichTextContent = null;
			
			try{
				actualRichTextContent=sitecoreObj_Article.aboutusArticleRichText.getText();
				Assert.assertEquals(actualRichTextContent, expectedData.getProperty("ArticleRichText"));
				log.info("The Actual AboutUs Article Rich Text is - "+actualRichTextContent);
				log.info("The Expected AboutUs Article Rich Text is - "+expectedData.getProperty("ArticleRichText"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Rich Text are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Rich Text is - "+actualRichTextContent);
				log.error("The Expected AboutUs Article Rich Text is - "+expectedData.getProperty("ArticleRichText"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Article RichText ContentRich are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Override article ContentRich element On Article RichText Container");
			}		
		  }
		
		// Verify Article ContentTitle Element for the RecentArticleTitleText Component on AutoAboutUs Preview page
		public static void VerifyRecentArticleTitleText_ContentTitle(){
			String actualRecentArticleTitleTextContentTitle = null;
			for(int i=1; i<=3; i++){
			try{
				actualRecentArticleTitleTextContentTitle=Driver.findElement(By.xpath(sitecoreObj_Article.aboutusRecentArticleTitleText.replace("*", Integer.toString(i)))).getText();
				Assert.assertEquals(actualRecentArticleTitleTextContentTitle, AboutusCommonClass.clonedRecentArticleTitle[i]);
				log.info("The Actual AboutUs Article Title Text is - "+ actualRecentArticleTitleTextContentTitle);
				log.info("The Expected AboutUs Article Title Text is - "+ AboutusCommonClass.clonedRecentArticleTitle[i]);
				log.info("TEST PASSED: The Actual and Expected AboutUs Article Title Text are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Article Title Text is - "+ actualRecentArticleTitleTextContentTitle);
				log.error("The Expected AboutUs Article Title Text is - "+ AboutusCommonClass.clonedRecentArticleTitle[i]);
				log.error("TEST FAILED: The Actual and Expected AboutUs Article RecentArticleTitleText ContentTitle are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Override article ContentTitle element On Article RecentArticleTitleText Container");
			}		
			}
		  }
}
