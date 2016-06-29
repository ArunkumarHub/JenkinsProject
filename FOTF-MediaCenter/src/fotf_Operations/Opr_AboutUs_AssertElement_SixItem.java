package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_SixItem extends Basedriver{
	
	// [SixItems ThreeColumn]
			// Verify SixItemsThreeColumn Component ContentImage for AutoAboutUs Preview page
			public static void VerifySixItemsThreeColumn_ContentImage(){
				String actualContentImage="";
				try{
					actualContentImage=sitecoreObj_SixItem.aboutusSixItemsThreeColumnsContentImage.getAttribute("class");
					Assert.assertEquals(actualContentImage, expectedData.getProperty("SixItemsThreeColumnContentImage"));
					log.info("The Actual AboutUs SixItemsThreeColumn ContentImage - "+actualContentImage);
					log.info("The Expected AboutUs SixItemsThreeColumn ContentImage - "+expectedData.getProperty("SixItemsThreeColumnContentImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsThreeColumn ContentImage are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsThreeColumn ContentImage - "+actualContentImage);
					log.error("The Expected AboutUs SixItemsThreeColumn ContentImage - "+expectedData.getProperty("SixItemsThreeColumnContentImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsThreeColumn ContentImage are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentImage On SixItemsThreeColumn Container");
				}
			}
			
			// Verify SixItemsThreeColumn Component ContentImage Link for AutoAboutUs Preview page
			public static void VerifySixItemsThreeColumn_ContentImageLink(){
				boolean actualThreeColumnContentTitle = false;
				try{
					actualThreeColumnContentTitle=sitecoreObj_SixItem.aboutusSixItemsThreeColumnsContentImageLink.isDisplayed();
					Assert.assertEquals(actualThreeColumnContentTitle, true);
					log.info("The Actual AboutUs SixItemsThreeColumn ContentImage Link - <"+sitecoreObj_SixItem.aboutusSixItemsThreeColumnsContentImageLink.getTagName()+">");
					log.info("The Expected AboutUs SixItemsThreeColumn ContentImage Link - <a>");
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsThreeColumn ContentImage Links are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsThreeColumn ContentImage Link - <"+sitecoreObj_SixItem.aboutusSixItemsThreeColumnsContentImageLink.getTagName() +">");
					log.error("The Expected AboutUs SixItemsThreeColumn ContentImage Link - <a>");
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsThreeColumn ContentImage Links are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentImage Link element On SixItemsThreeColumn Container");
				}		
			}
			
			// [SixItems SixColumn]
			// Verify SixItemsSixColumn Component ContentImage for AutoAboutUs Preview page
			public static void VerifySixItemsSixColumn_ContentImage(){
				String actualContentImage="";
				try{
					actualContentImage=sitecoreObj_SixItem.aboutusSixItemsSixColumnsContentImage.getAttribute("class");
					Assert.assertEquals(actualContentImage, expectedData.getProperty("SixItemsSixColumnContentImage"));
					log.info("The Actual AboutUs SixItemsSixColumn ContentImage - "+actualContentImage);
					log.info("The Expected AboutUs SixItemsSixColumn ContentImage - "+expectedData.getProperty("SixItemsSixColumnContentImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsSixColumn ContentImage are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsSixColumn ContentImage - "+actualContentImage);
					log.error("The Expected AboutUs SixItemsSixColumn ContentImage - "+expectedData.getProperty("SixItemsSixColumnContentImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsSixColumn ContentImage are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentImage On SixItemsSixColumn Container");
				}
			}
			
			// Six Items / Six Columns With Text
			// Verify Six Items / SixColumnsWithText Component ContentImage for AutoAboutUs Preview page
			public static void VerifySixColumnWithText_ContentImage(){
				String actualContentImage="";
				try{
					actualContentImage=sitecoreObj_SixItem.aboutusSixColumnWithTextContentImage.getAttribute("class");
					Assert.assertEquals(actualContentImage, expectedData.getProperty("SixItemsSixColumnWithTextContentImage"));
					log.info("The Actual AboutUs Six Items / SixColumnsWithText ContentImage - "+actualContentImage);
					log.info("The Expected AboutUs Six Items / SixColumnsWithText ContentImage - "+expectedData.getProperty("SixItemsSixColumnWithTextContentImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs Six Items / SixColumnsWithText ContentImage are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs Six Items / SixColumnsWithText ContentImage - "+actualContentImage);
					log.error("The Expected AboutUs Six Items / SixColumnsWithText ContentImage - "+expectedData.getProperty("SixItemsSixColumnWithTextContentImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs Six Items / SixColumnsWithText ContentImage are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentImage On Six Items / SixColumnsWithText Container");
				}
			}	
			
			// Verify Six Items / Six ColumnsWithText Component ContentMoreLink for AutoAboutUs Preview page
			public static void VerifySixColumnWithText_ContentMoreLink(){
				String actualContentMoreLink="";
				try{
					actualContentMoreLink=sitecoreObj_SixItem.aboutusSixColumnWithTextContentMoreLink.getAttribute("class");
					Assert.assertEquals(actualContentMoreLink, expectedData.getProperty("SixItemsSixColumnWithTextContentMoreLink"));
					log.info("The Actual AboutUs Six Items / SixColumnsWithText ContentMoreLink - "+actualContentMoreLink);
					log.info("The Expected AboutUs Six Items / SixColumnsWithText ContentMoreLink - "+expectedData.getProperty("SixItemsSixColumnWithTextContentMoreLink"));
					log.info("TEST PASSED: The Actual and Expected AboutUs Six Items / SixColumnsWithText ContentMoreLink are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs Six Items / SixColumnsWithText ContentMoreLink - "+actualContentMoreLink);
					log.error("The Expected AboutUs Six Items / SixColumnsWithText ContentMoreLink - "+expectedData.getProperty("SixItemsSixColumnWithTextContentMoreLink"));
					log.error("TEST FAILED: The Actual and Expected AboutUs Six Items / SixColumnsWithText ContentMoreLink are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentMoreLink On Six Items / SixColumnsWithText Container");
				}
			}
			
			
			/***********************************************************************/
			// Verify Title Element for the [TwoColumn Six Item] Component on AutoAboutUs Preview page
			public static void VerifySixItemsTwoColumns_Title(){
				boolean actualSixItemsTwoColumnsContentTitle = false;
				try{
					actualSixItemsTwoColumnsContentTitle=sitecoreObj_SixItem.aboutusSixItemTwoColumnsTitle.isDisplayed();
					Assert.assertEquals(actualSixItemsTwoColumnsContentTitle, true);
					log.info("The Actual AboutUs SixItemsTwoColumns ContentTitle - <"+sitecoreObj_SixItem.aboutusSixItemTwoColumnsTitle.getTagName()+">");
					log.info("The Expected AboutUs SixItemsTwoColumns ContentTitle - <h2>");
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsTwoColumns ContentTitle are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsTwoColumns ContentTitle - <"+sitecoreObj_SixItem.aboutusSixItemTwoColumnsTitle.getTagName() +">");
					log.error("The Expected AboutUs SixItemsTwoColumns ContentTitle - <h2>");
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsTwoColumns ContentTitle are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No ContentTitle element On SixItemsTwoColumns Container");
				}		
			}
		
			// Verify SideBySideCentered Component Description for AutoAboutUs Preview page
			public static void VerifySixItemsTwoColumns_Description(){
				boolean actualSixItemsTwoColumnsText = false;
				try{
					actualSixItemsTwoColumnsText=sitecoreObj_SixItem.aboutusSixItemTwoColumnsDescription.isDisplayed();
					Assert.assertEquals(actualSixItemsTwoColumnsText, true);
					log.info("The Actual AboutUs SixItemsTwoColumns Description - <"+sitecoreObj_SixItem.aboutusSixItemTwoColumnsDescription.getTagName()+">");
					log.info("The Expected AboutUs SixItemsTwoColumns Description - <p>");
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsTwoColumns Description are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsTwoColumns Description - <"+sitecoreObj_SixItem.aboutusSixItemTwoColumnsDescription.getTagName()+">");
					log.error("The Expected AboutUs SixItemsTwoColumns Description - <p>");
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsTwoColumns Description are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Description element On SixItemsTwoColumns Container");
				}		
			}
			
			// Verify SixItemsTwoColumns Component Image for AutoAboutUs Preview page
			public static void VerifySixItemsTwoColumns_Image(){
				String actualSixItemsTwoColumnsImage="";
				try{
					actualSixItemsTwoColumnsImage=sitecoreObj_SixItem.aboutusSixItemTwoColumnsImage.getAttribute("class");
					Assert.assertEquals(actualSixItemsTwoColumnsImage, expectedData.getProperty("SixItemTwoColumnsImage"));
					log.info("The Actual AboutUs SixItemsTwoColumns Image- "+actualSixItemsTwoColumnsImage);
					log.info("The Expected AboutUs SixItemsTwoColumns Image- "+expectedData.getProperty("SixItemTwoColumnsImage"));
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsTwoColumns Images are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsTwoColumns Image- "+actualSixItemsTwoColumnsImage);
					log.error("The Expected AboutUs SixItemsTwoColumns Image- "+expectedData.getProperty("SixItemTwoColumnsImage"));
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsTwoColumns Images are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Image On SixItemsTwoColumns Container");
				}
			}	
			
			// Verify SixItemsTwoColumns Component Text for AutoAboutUs Preview page
			public static void VerifySixItemsTwoColumns_Text(){
				String actualSixItemsTwoColumnsText="";
				try{
					actualSixItemsTwoColumnsText=sitecoreObj_SixItem.aboutusSixItemTwoColumnsText.getAttribute("class");
					Assert.assertEquals(actualSixItemsTwoColumnsText, expectedData.getProperty("SixItemTwoColumnsText"));
					log.info("The Actual AboutUs SixItemsTwoColumns Text- "+actualSixItemsTwoColumnsText);
					log.info("The Expected AboutUs SixItemsTwoColumns Text- "+expectedData.getProperty("SixItemTwoColumnsText"));
					log.info("TEST PASSED: The Actual and Expected AboutUs SixItemsTwoColumns Texts are Same");
				}catch(AssertionError e){
					log.error("The Actual AboutUs SixItemsTwoColumns Text- "+actualSixItemsTwoColumnsText);
					log.error("The Expected AboutUs SixItemsTwoColumns Text- "+expectedData.getProperty("SixItemTwoColumnsText"));
					log.error("TEST FAILED: The Actual and Expected AboutUs SixItemsTwoColumns Texts are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Text On SixItemsTwoColumns Container");
				}
			}
			
	
}
