package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_FiveItem extends Basedriver{
	
	
	// Verify FiveColumn Component container for AutoAboutUs Preview page
		public static void VerifyFiveColumn_Container(){
			String actualcontainer="";
			try{
				actualcontainer=sitecoreObj_FiveItem.aboutusFiveColumnContainer.getAttribute("class");
				Assert.assertEquals(actualcontainer, expectedData.getProperty("FiveColumnContainer"));
				log.info("The Actual AboutUs FiveColumn container - "+actualcontainer);
				log.info("The Expected AboutUs FiveColumn container - "+expectedData.getProperty("FiveColumnContainer"));
				log.info("TEST PASSED: The Actual and Expected AboutUs FiveColumn container are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs FiveColumn container - "+actualcontainer);
				log.error("The Expected AboutUs FiveColumn container - "+expectedData.getProperty("FiveColumnContainer"));
				log.error("TEST FAILED: The Actual and Expected AboutUs FiveColumn container are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No container On FiveColumn Container");
			}
		}
		
		// Verify FiveColumn Component Content for AutoAboutUs Preview page
		public static void VerifyFiveColumn_Content(){
			String actualContent="";
			try{
				actualContent=sitecoreObj_FiveItem.aboutusFiveColumnContent.getAttribute("class");
				Assert.assertEquals(actualContent, expectedData.getProperty("FiveColumnContent"));
				log.info("The Actual AboutUs FiveColumn Content - "+actualContent);
				log.info("The Expected AboutUs FiveColumn Content - "+expectedData.getProperty("FiveColumnContent"));
				log.info("TEST PASSED: The Actual and Expected AboutUs FiveColumn Content are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs FiveColumn Content - "+actualContent);
				log.error("The Expected AboutUs FiveColumn Content - "+expectedData.getProperty("FiveColumnContent"));
				log.error("TEST FAILED: The Actual and Expected AboutUs FiveColumn Content are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Content On FiveColumn Container");
			}
		}
		
		// Verify FiveColumn Component ContentImage for AutoAboutUs Preview page
		public static void VerifyFiveColumn_ContentImage(){
			String actualContentImage="";
			try{
				actualContentImage=sitecoreObj_FiveItem.aboutusFiveColumnContentImage.getAttribute("class");
				Assert.assertEquals(actualContentImage, expectedData.getProperty("FiveColumnContentImage"));
				log.info("The Actual AboutUs FiveColumn ContentImage - "+actualContentImage);
				log.info("The Expected AboutUs FiveColumn ContentImage - "+expectedData.getProperty("FiveColumnContentImage"));
				log.info("TEST PASSED: The Actual and Expected AboutUs FiveColumn ContentImage are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs FiveColumn ContentImage - "+actualContentImage);
				log.error("The Expected AboutUs FiveColumn ContentImage - "+expectedData.getProperty("FiveColumnContentImage"));
				log.error("TEST FAILED: The Actual and Expected AboutUs FiveColumn ContentImage are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No ContentImage On FiveColumn Container");
			}
		}
		
		// Verify FiveColumn Component ContentDescription for AutoAboutUs Preview page
		public static void VerifyFiveColumn_ContentDescription(){
			String actualContentDescription="";
			try{
				actualContentDescription=sitecoreObj_FiveItem.aboutusFiveColumnContentDescription.getAttribute("class");
				Assert.assertEquals(actualContentDescription, expectedData.getProperty("FiveColumnContentDescription"));
				log.info("The Actual AboutUs FiveColumn ContentDescription - "+actualContentDescription);
				log.info("The Expected AboutUs FiveColumn ContentDescription - "+expectedData.getProperty("FiveColumnContentDescription"));
				log.info("TEST PASSED: The Actual and Expected AboutUs FiveColumn ContentDescription are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs FiveColumn ContentDescription - "+actualContentDescription);
				log.error("The Expected AboutUs FiveColumn ContentDescription - "+expectedData.getProperty("FiveColumnContentDescription"));
				log.error("TEST FAILED: The Actual and Expected AboutUs FiveColumn ContentDescription are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No ContentDescription On FiveColumn Container");
			}
		}
		
		// Verify FiveColumn Component ContentMoreLink for AutoAboutUs Preview page
		public static void VerifyFiveColumn_ContentMoreLink(){
			String actualContentMoreLink="";
			try{
				actualContentMoreLink=sitecoreObj_FiveItem.aboutusFiveColumnContentMoreLink.getAttribute("class");
				Assert.assertEquals(actualContentMoreLink, expectedData.getProperty("FiveColumnContentMoreLink"));
				log.info("The Actual AboutUs FiveColumn ContentMoreLink - "+actualContentMoreLink);
				log.info("The Expected AboutUs FiveColumn ContentMoreLink - "+expectedData.getProperty("FiveColumnContentMoreLink"));
				log.info("TEST PASSED: The Actual and Expected AboutUs FiveColumn ContentMoreLink are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs FiveColumn ContentMoreLink - "+actualContentMoreLink);
				log.error("The Expected AboutUs FiveColumn ContentMoreLink - "+expectedData.getProperty("FiveColumnContentMoreLink"));
				log.error("TEST FAILED: The Actual and Expected AboutUs FiveColumn ContentMoreLink are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No ContentMoreLink On FiveColumn Container");
			}
		}
		
		// Verify 2x3 Component container for AutoAboutUs Preview page
		public static void Verify2x3_Container(){
			String actualcontainer="";
			try{
				actualcontainer=sitecoreObj_FiveItem.aboutus2x3Container.getAttribute("class");
				Assert.assertEquals(actualcontainer, expectedData.getProperty("TwoByThreeContainer"));
				log.info("The Actual AboutUs 2x3 container - "+actualcontainer);
				log.info("The Expected AboutUs 2x3 container - "+expectedData.getProperty("TwoByThreeContainer"));
				log.info("TEST PASSED: The Actual and Expected AboutUs 2x3 container are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs 2x3 container - "+actualcontainer);
				log.error("The Expected AboutUs 2x3 container - "+expectedData.getProperty("TwoByThreeContainer"));
				log.error("TEST FAILED: The Actual and Expected AboutUs 2x3 container are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No container On 2x3 Container");
			}
		}	
		
		// Verify 2x3 Component Content for AutoAboutUs Preview page
		public static void Verify2x3_Content(){
			String actualContent="";
			try{
				actualContent=sitecoreObj_FiveItem.aboutus2x3Content.getAttribute("class");
				Assert.assertEquals(actualContent, expectedData.getProperty("TwoByThreeContent"));
				log.info("The Actual AboutUs 2x3 Content - "+actualContent);
				log.info("The Expected AboutUs 2x3 Content - "+expectedData.getProperty("TwoByThreeContent"));
				log.info("TEST PASSED: The Actual and Expected AboutUs 2x3 Content are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs 2x3 Content - "+actualContent);
				log.error("The Expected AboutUs 2x3 Content - "+expectedData.getProperty("TwoByThreeContent"));
				log.error("TEST FAILED: The Actual and Expected AboutUs 2x3 Content are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Content On 2x3 Container");
			}
		}
		
		// Verify 2x3 Component Content for AutoAboutUs Preview page
		public static void Verify2x3_ContentForArticle(){
			String actualContent="";
			try{
				actualContent=sitecoreObj_FiveItem.aboutus2x3ContentForArticle.getAttribute("class");
				Assert.assertEquals(actualContent, expectedData.getProperty("TwoByThreeContentForArticle"));
				log.info("The Actual AboutUs 2x3 Content - "+actualContent);
				log.info("The Expected AboutUs 2x3 Content - "+expectedData.getProperty("TwoByThreeContentForArticle"));
				log.info("TEST PASSED: The Actual and Expected AboutUs 2x3 Content are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs 2x3 Content - "+actualContent);
				log.error("The Expected AboutUs 2x3 Content - "+expectedData.getProperty("TwoByThreeContentForArticle"));
				log.error("TEST FAILED: The Actual and Expected AboutUs 2x3 Content are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is no Content On 2x3 Container");
			}
		}
					
		// Verify 2x3 Component ContentLink for AutoAboutUs Preview page
		public static void Verify2x3_ContentLink(){
			String actualContentLink="";
			try{
				actualContentLink=sitecoreObj_FiveItem.aboutus2x3ContentLink.getAttribute("class");
				Assert.assertEquals(actualContentLink, expectedData.getProperty("TwoByThreeContentLink"));
				log.info("The Actual AboutUs 2x3 Link- "+actualContentLink);
				log.info("The Expected AboutUs 2x3 Link- "+expectedData.getProperty("TwoByThreeContentLink"));
				log.info("TEST PASSED: The Actual and Expected AboutUs 2x3 Content Links are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs 2x3 Link- "+actualContentLink);
				log.error("The Expected AboutUs 2x3 Link- "+expectedData.getProperty("TwoByThreeContentLink"));
				log.error("TEST FAILED: The Actual and Expected AboutUs 2x3 Links are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Link On 2x3 Container");
			}
		}		
		
		
		// Verify Content Image Element for the 2x3 Component on AutoAboutUs Preview page
		public static void Verify2x3_ContentImage(){
			boolean actualContentImage = false;
			try{
				actualContentImage=sitecoreObj_FiveItem.aboutus2x3ContentImage.isDisplayed();
				Assert.assertEquals(actualContentImage, true);
				log.info("The Actual AboutUs 2x3 Content Image - <"+sitecoreObj_FiveItem.aboutus2x3ContentImage.getTagName()+">");
				log.info("The Expected AboutUs 2x3 Content Image - <img>");
				log.info("TEST PASSED: The Actual and Expected AboutUs 2x3 Content Images are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs 2x3 Content Image - <"+sitecoreObj_FiveItem.aboutus2x3ContentImage.getTagName()+">");
				log.error("The Expected AboutUs 2x3 Content Image - <img>");
				log.error("TEST FAILED: The Actual and Expected AboutUs 2x3 Content Images are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Content Image element On 2x3 Container");
			}		
		}
					
		// Verify Content Text Element for the 2x3 Component on AutoAboutUs Preview page
		public static void Verify2x3_ContentText(){
			boolean actualContentText = false;
			try{
				actualContentText=sitecoreObj_FiveItem.aboutus2x3ContentText.isDisplayed();
				Assert.assertEquals(actualContentText, true);
				log.info("The Actual AboutUs 2x3 Content Text - <"+sitecoreObj_FiveItem.aboutus2x3ContentText.getTagName()+">");
				log.info("The Expected AboutUs 2x3 Content Text - <em>");
				log.info("TEST PASSED: The Actual and Expected AboutUs 2x3 Content Texts are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs 2x3 Content Text - <"+sitecoreObj_FiveItem.aboutus2x3ContentText.getTagName()+">");
				log.error("The Expected AboutUs 2x3 Content Text - <em>");
				log.error("TEST FAILED: The Actual and Expected AboutUs 2x3 Content Texts are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Content Text element On 2x3 Container");
			}		
		}
	
}
