package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_PageComponentHeader extends Basedriver{	
	// Verify PageComponentHeader Title for AutoAboutUs Preview page
	public static void VerifyPageComponentHeader_Title(){
		String actualPageComponentHeaderTitle = "";
		try{			
			actualPageComponentHeaderTitle = sitecoreObj_PageComponentHeader.aboutusPageComponentTitle.getText().trim();
			Assert.assertEquals(actualPageComponentHeaderTitle, expectedData.getProperty("PageComponentHeaderTitle"));
			log.info("The Actual AboutUs PageComponentHeader Title is - " + actualPageComponentHeaderTitle);
			log.info("The Expected AboutUs PageComponentHeader Title is - " + expectedData.getProperty("PageComponentHeaderTitle"));
			log.info("TEST PASSED: The Actual and Expected AboutUs PageComponentHeader Title are Same");
		}catch(AssertionError e){
			log.info("The Actual AboutUs PageComponentHeader Title is - " + actualPageComponentHeaderTitle);
			log.info("The Expected AboutUs PageComponentHeader Title is - " + expectedData.getProperty("PageComponentHeaderTitle"));
			log.error("TEST FAILED: The Actual and Expected AboutUs PageComponentHeader Title are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No AboutUs PageComponentHeader Title");
		}
	}
	
	// Verify PageComponentHeader Siblings Title for AutoAboutUs Preview page
	public static void VerifyPageComponentHeader_SiblingsTitle(){				
		for(int i=1; i<=3; i++){
			String actualSiblingsTitle = null; String expectedSiblingsTitle = null;	
			String xPath = sitecoreObj_PageComponentHeader.siblingsXpath.replace("1", Integer.toString(i));
			try{
				actualSiblingsTitle = Driver.findElement(By.xpath(xPath)).getText().trim();
				expectedSiblingsTitle = expectedData.getProperty("PageComponentHeaderSibling") + i;
				Assert.assertEquals(actualSiblingsTitle, expectedSiblingsTitle);
				log.info("The Actual AboutUs PageComponentHeader Sibling " + i + " Title is - " + actualSiblingsTitle);
				log.info("The Expected AboutUs PageComponentHeader Sibling " + i + " Title is - " + expectedSiblingsTitle);
				log.info("TEST PASSED: The Actual and Expected AboutUs PageComponentHeader Siblings Title are Same");
			}catch(AssertionError e){
				log.info("The Actual AboutUs PageComponentHeader Sibling " + i + " Title is - " + actualSiblingsTitle);
				log.info("The Expected AboutUs PageComponentHeader Sibling " + i + " Title is - " + expectedSiblingsTitle);				
				log.error("TEST FAILED: The Actual and Expected AboutUs PageComponentHeader Siblings Title are NOT Same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No AboutUs PageComponentHeader Siblings Title");
		}		
	  }
	}	
	
	// Verify PageComponentHeader More Siblings Container for AutoAboutUs Preview page
	public static void VerifyPageComponentHeader_MoreSiblingsContainer(){
		String actualMoreContainer="";
		try{
			actualMoreContainer=sitecoreObj_PageComponentHeader.aboutusPageComponentMoreContainer.getAttribute("class");
			Assert.assertEquals(actualMoreContainer, expectedData.getProperty("PageComponentHeaderMoreSiblingContainer"));
			log.info("The Actual AboutUs PageComponentHeader More Siblings Container - " + actualMoreContainer);
			log.info("The Expected AboutUs PageComponentHeader More Siblings Container - " + expectedData.getProperty("PageComponentHeaderMoreSiblingContainer"));
			log.info("TEST PASSED: The Actual and Expected AboutUs PageComponentHeader More Siblings Container are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs PageComponentHeader More Siblings Container - " + actualMoreContainer);
			log.error("The Expected AboutUs PageComponentHeader More Siblings Container - " + expectedData.getProperty("PageComponentHeaderMoreSiblingContainer"));
			log.error("TEST FAILED: The Actual and Expected AboutUs PageComponentHeader More Siblings Container are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No PageComponentHeader More Siblings Container");
		}
	}	
		
	// Verify PageComponentHeader More Siblings Title for AutoAboutUs Preview page
	public static void VerifyPageComponentHeader_MoreSiblingsTitle(){		
		for(int i=1; i<=2; i++){			
			String actualMoreSiblingsTitle = null; String expectedMoreSiblingsTitle = null;
			String xPath = sitecoreObj_PageComponentHeader.moreSiblingsXpath.replace("1", Integer.toString(i));
			try{
				actualMoreSiblingsTitle = Driver.findElement(By.xpath(xPath)).getText().trim();
				expectedMoreSiblingsTitle = expectedData.getProperty("PageComponentHeaderSibling") + (i+3);
				Assert.assertEquals(actualMoreSiblingsTitle, expectedMoreSiblingsTitle);
				log.info("The Actual AboutUs PageComponentHeader More Sibling " + i + " Title is - " + actualMoreSiblingsTitle);
				log.info("The Expected AboutUs PageComponentHeader More Sibling " + i + " Title is - " + expectedMoreSiblingsTitle);
				log.info("TEST PASSED: The Actual and Expected AboutUs PageComponentHeader More Siblings Title are Same");
			}catch(AssertionError e){
				log.info("The Actual AboutUs PageComponentHeader More Sibling " + i + " Title is - " + actualMoreSiblingsTitle);
				log.info("The Expected AboutUs PageComponentHeader More Sibling " + i + " Title is - " + expectedMoreSiblingsTitle);				
				log.error("TEST FAILED: The Actual and Expected AboutUs PageComponentHeader More Siblings Title are NOT Same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No AboutUs PageComponentHeader More Siblings Title");
			}		
		}
	}
	
}