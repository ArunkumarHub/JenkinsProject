package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_ThreeItem extends Basedriver{
	
	// Verify ThreeColumn Component container for AutoAboutUs Preview page
		public static void VerifyThreeColumn_Container(){
			String actualcontainer="";
			try{
				actualcontainer=sitecoreObj_ThreeItem.aboutusThreeColumnContainer.getAttribute("class");
				Assert.assertEquals(actualcontainer, expectedData.getProperty("ThreeColumnContainer"));
				log.info("The Actual AboutUs ThreeColumn container - "+actualcontainer);
				log.info("The Expected AboutUs ThreeColumn container - "+expectedData.getProperty("ThreeColumnContainer"));
				log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumn container are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs ThreeColumn container - "+actualcontainer);
				log.error("The Expected AboutUs ThreeColumn container - "+expectedData.getProperty("ThreeColumnContainer"));
				log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumn container are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No container On ThreeColumn Container");
			}
		}
		
		// Verify ThreeColumn Component Content for AutoAboutUs Preview page
				public static void VerifyThreeColumn_Content(){
					String actualContent="";
					try{
						actualContent=sitecoreObj_ThreeItem.aboutusThreeColumnContent.getAttribute("class");
						Assert.assertEquals(actualContent, expectedData.getProperty("ThreeColumnContent"));
						log.info("The Actual AboutUs ThreeColumn Content - "+actualContent);
						log.info("The Expected AboutUs ThreeColumn Content - "+expectedData.getProperty("ThreeColumnContent"));
						log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumn Content are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs ThreeColumn Content - "+actualContent);
						log.error("The Expected AboutUs ThreeColumn Content - "+expectedData.getProperty("ThreeColumnContent"));
						log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumn Content are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Content On ThreeColumn Container");
					}
				}
				
				// Verify ThreeColumn Component ContentImage for AutoAboutUs Preview page
				public static void VerifyThreeColumn_ContentImage(){
					String actualContentImage="";
					try{
						actualContentImage=sitecoreObj_ThreeItem.aboutusThreeColumnContentImage.getAttribute("class");
						Assert.assertEquals(actualContentImage, expectedData.getProperty("ThreeColumnContentImage"));
						log.info("The Actual AboutUs ThreeColumn ContentImage - "+actualContentImage);
						log.info("The Expected AboutUs ThreeColumn ContentImage - "+expectedData.getProperty("ThreeColumnContentImage"));
						log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumn ContentImage are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs ThreeColumn ContentImage - "+actualContentImage);
						log.error("The Expected AboutUs ThreeColumn ContentImage - "+expectedData.getProperty("ThreeColumnContentImage"));
						log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumn ContentImage are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentImage On ThreeColumn Container");
					}
				}
				
				
				// Verify ContentTitle Element for the ThreeColumn Component on AutoAboutUs Preview page
				public static void VerifyThreeColumn_ContentImageLink(){
					boolean actualThreeColumnContentTitle = false;
					try{
						actualThreeColumnContentTitle=sitecoreObj_ThreeItem.aboutusThreeColumnContentImageLink.isDisplayed();
						Assert.assertEquals(actualThreeColumnContentTitle, true);
						log.info("The Actual AboutUs ThreeColumn ContentImage Link - <"+sitecoreObj_ThreeItem.aboutusThreeColumnContentImageLink.getTagName()+">");
						log.info("The Expected AboutUs ThreeColumn ContentImage Link - <a>");
						log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumn ContentImage Links are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs ThreeColumn ContentImage Link - <"+sitecoreObj_ThreeItem.aboutusThreeColumnContentImageLink.getTagName() +">");
						log.error("The Expected AboutUs ThreeColumn ContentImage Link - <a>");
						log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumn ContentImage Links are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentImage Link element On ThreeColumn Container");
					}		
				}
				
				// Verify ContentTitle Element for the ThreeColumn Component on AutoAboutUs Preview page
				public static void VerifyThreeColumn_ContentTitleLink(){
					boolean actualThreeColumnContentTitle = false;
					try{
						actualThreeColumnContentTitle=sitecoreObj_ThreeItem.aboutusThreeColumnContentTitleLink.isDisplayed();
						Assert.assertEquals(actualThreeColumnContentTitle, true);
						log.info("The Actual AboutUs ThreeColumn ContentTitle Link - <"+sitecoreObj_ThreeItem.aboutusThreeColumnContentTitleLink.getTagName()+">");
						log.info("The Expected AboutUs ThreeColumn ContentTitle Link - <a>");
						log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumn ContentTitle Links are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs ThreeColumn ContentTitle Link - <"+sitecoreObj_ThreeItem.aboutusThreeColumnContentTitleLink.getTagName() +">");
						log.error("The Expected AboutUs ThreeColumn ContentTitle Link - <a>");
						log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumn ContentTitle Links are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentTitle Link element On ThreeColumn Container");
					}		
				}
				
				// Verify StackedImageLeft Component container for AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_Container(){
					String actualcontainer="";
					try{
						actualcontainer=sitecoreObj_ThreeItem.aboutusStackedImageLeftContainer.getAttribute("class");
						Assert.assertEquals(actualcontainer, expectedData.getProperty("StackedImageLeftContainer"));
						log.info("The Actual AboutUs StackedImageLeft container - "+actualcontainer);
						log.info("The Expected AboutUs StackedImageLeft container - "+expectedData.getProperty("StackedImageLeftContainer"));
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft container are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft container - "+actualcontainer);
						log.error("The Expected AboutUs StackedImageLeft container - "+expectedData.getProperty("StackedImageLeftContainer"));
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft container are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No container On StackedImageLeft Container");
					}
				}
				
				// Verify StackedImageLeft Component Content for AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_Content(){
					String actualContent="";
					try{
						actualContent=sitecoreObj_ThreeItem.aboutusStackedImageLeftContent.getAttribute("class");
						Assert.assertEquals(actualContent, expectedData.getProperty("StackedImageLeftContent"));
						log.info("The Actual AboutUs StackedImageLeft Content - "+actualContent);
						log.info("The Expected AboutUs StackedImageLeft Content - "+expectedData.getProperty("StackedImageLeftContent"));
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft Content are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft Content - "+actualContent);
						log.error("The Expected AboutUs StackedImageLeft Content - "+expectedData.getProperty("StackedImageLeftContent"));
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft Content are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Content On StackedImageLeft Container");
					}
				}			
				
				
				// Verify StackedImageLeft Component ContentImage for AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_ContentImage(){
					String actualContentImage="";
					try{
						actualContentImage=sitecoreObj_ThreeItem.aboutusStackedImageLeftContentImage.getAttribute("class");
						Assert.assertEquals(actualContentImage, expectedData.getProperty("StackedImageLeftContentImage"));
						log.info("The Actual AboutUs StackedImageLeft ContentImage - "+actualContentImage);
						log.info("The Expected AboutUs StackedImageLeft ContentImage - "+expectedData.getProperty("StackedImageLeftContentImage"));
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft ContentImage are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft ContentImage - "+actualContentImage);
						log.error("The Expected AboutUs StackedImageLeft ContentImage - "+expectedData.getProperty("StackedImageLeftContentImage"));
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft ContentImage are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentImage On StackedImageLeft Container");
					}
				}
				
				// Verify ContentTitle Element for the StackedImageLeft Component on AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_ContentImageLink(){
					boolean actualContentImageLink = false;
					try{
						actualContentImageLink=sitecoreObj_ThreeItem.aboutusStackedImageLeftContentImageLink.isDisplayed();
						Assert.assertEquals(actualContentImageLink, true);
						log.info("The Actual AboutUs StackedImageLeft ContentImage Link- <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentImageLink.getTagName()+">");
						log.info("The Expected AboutUs StackedImageLeft ContentImage Link - <a>");
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft ContentImage Links are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft ContentImage Link - <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentImageLink.getTagName() +">");
						log.error("The Expected AboutUs StackedImageLeft ContentImage Link - <a>");
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft ContentImage Links are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentImage Link element On StackedImageLeft Container");
					}		
				}
				
				// Verify ContentTitle Element for the StackedImageLeft Component on AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_ContentTitle(){
					boolean actualStackedImageLeftContentTitle = false;
					try{
						actualStackedImageLeftContentTitle=sitecoreObj_ThreeItem.aboutusStackedImageLeftContentTitle.isDisplayed();
						Assert.assertEquals(actualStackedImageLeftContentTitle, true);
						log.info("The Actual AboutUs StackedImageLeft ContentTitle - <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentTitle.getTagName()+">");
						log.info("The Expected AboutUs StackedImageLeft ContentTitle - <h3>");
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft ContentTitle are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft ContentTitle - <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentTitle.getTagName() +">");
						log.error("The Expected AboutUs StackedImageLeft ContentTitle - <h3>");
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft ContentTitle are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentTitle element On StackedImageLeft Container");
					}		
				}
				
				// Verify ContentTitle Element for the StackedImageLeft Component on AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_ContentTitleLink(){
					boolean actualStackedImageLeftContentTitleLink = false;
					try{
						actualStackedImageLeftContentTitleLink=sitecoreObj_ThreeItem.aboutusStackedImageLeftContentTitleLink.isDisplayed();
						Assert.assertEquals(actualStackedImageLeftContentTitleLink, true);
						log.info("The Actual AboutUs StackedImageLeft ContentTitle Link- <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentTitleLink.getTagName()+">");
						log.info("The Expected AboutUs StackedImageLeft ContentTitle Link - <a>");
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft ContentTitle Links are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft ContentTitle Link - <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentTitleLink.getTagName() +">");
						log.error("The Expected AboutUs StackedImageLeft ContentTitle Link - <a>");
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft ContentTitle Links are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentTitle Link element On StackedImageLeft Container");
					}		
				}
				
				// Verify SideBySideCentered Component Description for AutoAboutUs Preview page
				public static void VerifyStackedImageLeft_ContentDescription(){
					boolean actualStackedImageLeftText = false;
					try{
						actualStackedImageLeftText=sitecoreObj_ThreeItem.aboutusStackedImageLeftContentText.isDisplayed();
						Assert.assertEquals(actualStackedImageLeftText, true);
						log.info("The Actual AboutUs StackedImageLeft Description - <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentText.getTagName()+">");
						log.info("The Expected AboutUs StackedImageLeft Description - <p>");
						log.info("TEST PASSED: The Actual and Expected AboutUs StackedImageLeft Description are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs StackedImageLeft Description - <"+sitecoreObj_ThreeItem.aboutusStackedImageLeftContentText.getTagName()+">");
						log.error("The Expected AboutUs StackedImageLeft Description - <p>");
						log.error("TEST FAILED: The Actual and Expected AboutUs StackedImageLeft Description are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Description element On StackedImageLeft Container");
					}		
				}
				
				//***********************************
				// ThreeColumnsLinksOverlaid
				// Verify ThreeColumnsLinksOverlaid Component Link for AutoAboutUs Preview page
				public static void VerifyThreeColumnsLinksOverlaid_Link(){
					String actualLink="";
					try{
						actualLink=sitecoreObj_ThreeItem.aboutusThreeColumnsLinksOverlaidLink.getAttribute("class");
						Assert.assertEquals(actualLink, expectedData.getProperty("ThreeColumnsLinksOverlaidLink"));
						log.info("The Actual AboutUs ThreeColumnsLinksOverlaid Link - "+actualLink);
						log.info("The Expected AboutUs ThreeColumnsLinksOverlaid Link - "+expectedData.getProperty("ThreeColumnsLinksOverlaidLink"));
						log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumnsLinksOverlaid Link are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs ThreeColumnsLinksOverlaid Link - "+actualLink);
						log.error("The Expected AboutUs ThreeColumnsLinksOverlaid Link - "+expectedData.getProperty("ThreeColumnsLinksOverlaidLink"));
						log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumnsLinksOverlaid Link are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Link On ThreeColumnsLinksOverlaid Link");
					}
				}
				
				
				// Verify Text Element for the ThreeColumnsLinksOverlaid Component on AutoAboutUs Preview page
				public static void VerifyThreeColumnsLinksOverlaid_Text(){
					boolean actualThreeColumnsLinksText = false;
					try{
						actualThreeColumnsLinksText=sitecoreObj_ThreeItem.aboutusThreeColumnsLinksOverlaidText.isDisplayed();
						Assert.assertEquals(actualThreeColumnsLinksText, true);
						log.info("The Actual AboutUs ThreeColumnsLinksOverlaid Text - <"+sitecoreObj_ThreeItem.aboutusThreeColumnsLinksOverlaidText.getTagName()+">");
						log.info("The Expected AboutUs ThreeColumnsLinksOverlaid Text - <span>");
						log.info("TEST PASSED: The Actual and Expected AboutUs ThreeColumnsLinksOverlaid Text are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs ThreeColumnsLinksOverlaid Text - <"+sitecoreObj_ThreeItem.aboutusThreeColumnsLinksOverlaidText.getTagName() +">");
						log.error("The Expected AboutUs ThreeColumnsLinksOverlaid Text - <h3>");
						log.error("TEST FAILED: The Actual and Expected AboutUs ThreeColumnsLinksOverlaid Text are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No Text element On ThreeColumnsLinksOverlaid Container");
					}		
				}
				
				
	
}
