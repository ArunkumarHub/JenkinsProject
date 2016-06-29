package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_TwoItem extends Basedriver{
	

	// Verify SideBySide Component Image for AutoAboutUs Preview page
		public static void VerifySideBySide_Image(){
			String actualSideBySideImage="";
			try{
				actualSideBySideImage=sitecoreObj_TwoItem.aboutusSideBySideImage.getAttribute("class");
				Assert.assertEquals(actualSideBySideImage, expectedData.getProperty("SideBySideImage"));
				log.info("The Actual AboutUs SideBySide Image - "+actualSideBySideImage);
				log.info("The Expected AboutUs SideBySide Image - "+expectedData.getProperty("SideBySideImage"));
				log.info("TEST PASSED: The Actual and Expected AboutUs SideBySide Images are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs SideBySide Image- "+actualSideBySideImage);
				log.error("The Expected AboutUs SideBySide Image- "+expectedData.getProperty("SideBySideImage"));
				log.error("TEST FAILED: The Actual and Expected AboutUs SideBySide Images are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On SideBySide Container");
			}
		}
		
		// Verify SideBySide Component ContentLink for AutoAboutUs Preview page
		public static void VerifySideBySide_Link(){
			String actualSideBySideLink="";
			try{
				actualSideBySideLink=sitecoreObj_TwoItem.aboutusSideBySideLink.getAttribute("class");
				Assert.assertEquals(actualSideBySideLink, expectedData.getProperty("SideBySideLink"));
				log.info("The Actual AboutUs SideBySide Link- "+actualSideBySideLink);
				log.info("The Expected AboutUs SideBySide Link- "+expectedData.getProperty("SideBySideLink"));
				log.info("TEST PASSED: The Actual and Expected AboutUs SideBySide Content Links are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs SideBySide Link- "+actualSideBySideLink);
				log.error("The Expected AboutUs SideBySide Link- "+expectedData.getProperty("SideBySideLink"));
				log.error("TEST FAILED: The Actual and Expected AboutUs SideBySide Links are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Link On SideBySide Container");
			}
		}
		
		// Verify SideBySideCentered Component HeaderText for AutoAboutUs Preview page
		public static void VerifySideBySideCentered_HeaderText(){
			boolean actualSideBySideCenteredHeaderText = false;
			try{
				actualSideBySideCenteredHeaderText=sitecoreObj_TwoItem.aboutusSideBySideCenteredHeaderText.isDisplayed();
				Assert.assertEquals(actualSideBySideCenteredHeaderText, true);
				log.info("The Actual AboutUs SideBySideCentered HeaderText - <"+sitecoreObj_TwoItem.aboutusSideBySideCenteredHeaderText.getTagName()+">");
				log.info("The Expected AboutUs SideBySideCentered HeaderText - <p>");
				log.info("TEST PASSED: The Actual and Expected AboutUs SideBySideCentered HeaderTexts are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs SideBySideCentered HeaderText - <"+sitecoreObj_TwoItem.aboutusSideBySideCenteredHeaderText.getTagName()+">");
				log.error("The Expected AboutUs SideBySideCentered HeaderText - <p>");
				log.error("TEST FAILED: The Actual and Expected AboutUs SideBySideCentered HeaderTexts are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No HeaderText element On SideBySideCentered Container");
			}		
		}
		
		// Verify SideBySideCentered Component Image for AutoAboutUs Preview page
		public static void VerifySideBySideCentered_Image(){
			String actualSideBySideCenteredImage="";
			try{
				actualSideBySideCenteredImage=sitecoreObj_TwoItem.aboutusSideBySideCenteredImage.getAttribute("class");
				Assert.assertEquals(actualSideBySideCenteredImage, expectedData.getProperty("SideBySideCenteredImage"));
				log.info("The Actual AboutUs SideBySideCentered Image- "+actualSideBySideCenteredImage);
				log.info("The Expected AboutUs SideBySideCentered Image- "+expectedData.getProperty("SideBySideCenteredImage"));
				log.info("TEST PASSED: The Actual and Expected AboutUs SideBySideCentered Images are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs SideBySideCentered Image- "+actualSideBySideCenteredImage);
				log.error("The Expected AboutUs SideBySideCentered Image- "+expectedData.getProperty("SideBySideCenteredImage"));
				log.error("TEST FAILED: The Actual and Expected AboutUs SideBySideCentered Images are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On SideBySideCentered Container");
			}
		}
		
		// Verify SideBySideCentered Component Text for AutoAboutUs Preview page
		public static void VerifySideBySideCentered_Text(){
			String actualSideBySideCenteredText="";
			try{
				actualSideBySideCenteredText=sitecoreObj_TwoItem.aboutusSideBySideCenteredText.getAttribute("class");
				Assert.assertEquals(actualSideBySideCenteredText, expectedData.getProperty("SideBySideCenteredText"));
				log.info("The Actual AboutUs SideBySideCentered Text- "+actualSideBySideCenteredText);
				log.info("The Expected AboutUs SideBySideCentered Text- "+expectedData.getProperty("SideBySideCenteredText"));
				log.info("TEST PASSED: The Actual and Expected AboutUs SideBySideCentered Texts are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs SideBySideCentered Text- "+actualSideBySideCenteredText);
				log.error("The Expected AboutUs SideBySideCentered Text- "+expectedData.getProperty("SideBySideCenteredText"));
				log.error("TEST FAILED: The Actual and Expected AboutUs SideBySideCentered Texts are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Text On SideBySideCentered Container");
			}
		}
	
}
