package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_CustomInitiative extends Basedriver{
	

	// Verify Custom Initiative Title Image for Initiative Preview page
		public static void VerifyCustomInitiative_TitleImage(){
			String actualCustomInitiativeTitleImage="";
			try{
				actualCustomInitiativeTitleImage=sitecoreObj_CustomInitiative.customInitiativeTitleImage.getAttribute("class");
				Assert.assertEquals(actualCustomInitiativeTitleImage, expectedData.getProperty("CustomInitiativeTitleImage"));
				log.info("The Actual Custom Initiative Title Image - "+actualCustomInitiativeTitleImage);
				log.info("The Expected Custom Initiative Title Image - "+expectedData.getProperty("CustomInitiativeTitleImage"));
				log.info("TEST PASSED: The Actual and Expected Custom Initiative Title Image are Same");
			}catch(AssertionError e){
				log.error("The Actual Custom Initiative Title Image - "+actualCustomInitiativeTitleImage);
				log.error("The Expected Custom Initiative Title Image - "+expectedData.getProperty("CustomInitiativeTitleImage"));
				log.error("TEST FAILED: The Actual and Expected Custom Initiative Title Image are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Custom Initiative Title Image On Hero Image Left");
			}
		}
		
	// Verify Custom Initiative Title for Initiative Preview page
		public static void VerifyCustomInitiative_Title(){
			String actualCustomInitiativeTitle="";
			try{
				actualCustomInitiativeTitle=sitecoreObj_CustomInitiative.customInitiativeTitle.getAttribute("class");
				Assert.assertEquals(actualCustomInitiativeTitle, expectedData.getProperty("CustomInitiativeTitleText"));
				log.info("The Actual Custom Initiative Title - "+actualCustomInitiativeTitle);
				log.info("The Expected Custom Initiative Title - "+expectedData.getProperty("CustomInitiativeTitleText"));
				log.info("TEST PASSED: The Actual and Expected Custom Initiative Title are Same");
			}catch(AssertionError e){
				log.error("The Actual Custom Initiative Title - "+actualCustomInitiativeTitle);
				log.error("The Expected Custom Initiative Title - "+expectedData.getProperty("CustomInitiativeTitleText"));
				log.error("TEST FAILED: The Actual and Expected Custom Initiative Title are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Custom Initiative Title On Title");
			}
		}
		
	// Verify CustomInitiative Component Description for AutoAboutUs Preview page
		public static void VerifyCustomInitiative_Description(){
			boolean actualHeaderText=false;
			try{
				actualHeaderText=sitecoreObj_CustomInitiative.customInitiativeDescription.isDisplayed();
				Assert.assertEquals(actualHeaderText, true);
				log.info("The Actual Custom Initiative Description - <"+sitecoreObj_CustomInitiative.customInitiativeDescription.getTagName()+">");
				log.info("The Expected Custom Initiative Description - <p>");	
				log.info("TEST PASSED: The Actual and Expected Custom Initiative Description are Same");
			}catch(AssertionError e){
				log.error("The Actual Custom Initiative Description - <"+sitecoreObj_CustomInitiative.customInitiativeDescription.getTagName()+">");
				log.error("The Expected Custom Initiative Description - <p>");						
				log.error("TEST FAILED: The Actual and Expected Custom Initiative Description are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No CustomInitiative Description");
			}
		}
		
	// Verify Custom Initiative Button for Initiative Preview page
		public static void VerifyCustomInitiative_Button(){
			String actualCustomInitiativeButton="";
			try{
				actualCustomInitiativeButton=sitecoreObj_CustomInitiative.customInitiativeButton.getAttribute("class");
				Assert.assertEquals(actualCustomInitiativeButton, expectedData.getProperty("CustomInitiativeButton"));
				log.info("The Actual Custom Initiative Button - "+actualCustomInitiativeButton);
				log.info("The Expected Custom Initiative Button - "+expectedData.getProperty("CustomInitiativeButton"));
				log.info("TEST PASSED: The Actual and Expected Custom Initiative Button are Same");
			}catch(AssertionError e){
				log.error("The Actual Custom Initiative Button - "+actualCustomInitiativeButton);
				log.error("The Expected Custom Initiative Button - "+expectedData.getProperty("CustomInitiativeButton"));
				log.error("TEST FAILED: The Actual and Expected Custom Initiative Button are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Custom Initiative Button On Button");
			}
		}
		
		// Verify Custom Initiative Hero Image Left for Initiative Preview page
			public static void VerifyCustomInitiative_HeroImageLeft(){
				String actualCustomInitiativeHeroImageLeft="";
				try{
					actualCustomInitiativeHeroImageLeft=sitecoreObj_CustomInitiative.customInitiativeHeroImageLeft.getAttribute("class");
					Assert.assertEquals(actualCustomInitiativeHeroImageLeft, expectedData.getProperty("CustomInitiativeHeroImageLeft"));
					log.info("The Actual Custom Initiative Hero Image Left - "+actualCustomInitiativeHeroImageLeft);
					log.info("The Expected Custom Initiative Hero Image Left - "+expectedData.getProperty("CustomInitiativeHeroImageLeft"));
					log.info("TEST PASSED: The Actual and Expected Custom Initiative Hero Image Left are Same");
				}catch(AssertionError e){
					log.error("The Actual Custom Initiative Hero Image Left - "+actualCustomInitiativeHeroImageLeft);
					log.error("The Expected Custom Initiative Hero Image Left - "+expectedData.getProperty("CustomInitiativeHeroImageLeft"));
					log.error("TEST FAILED: The Actual and Expected Custom Initiative Hero Image Left are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Custom Initiative Hero Image Left On Hero Image Left");
				}
			}
			
	// Verify Custom Initiative Hero Image Right for Initiative Preview page
		public static void VerifyCustomInitiative_HeroImageRight(){
			String actualCustomInitiativeHeroImageRight="";
			try{
				actualCustomInitiativeHeroImageRight=sitecoreObj_CustomInitiative.customInitiativeHeroImageRight.getAttribute("class");
				Assert.assertEquals(actualCustomInitiativeHeroImageRight, expectedData.getProperty("CustomInitiativeHeroImageRight"));
				log.info("The Actual Custom Initiative Hero Image Right - "+actualCustomInitiativeHeroImageRight);
				log.info("The Expected Custom Initiative Hero Image Right - "+expectedData.getProperty("CustomInitiativeHeroImageRight"));
				log.info("TEST PASSED: The Actual and Expected Custom Initiative Hero Image Right are Same");
			}catch(AssertionError e){
				log.error("The Actual Custom Initiative Hero Image Right - "+actualCustomInitiativeHeroImageRight);
				log.error("The Expected Custom Initiative Hero Image Right - "+expectedData.getProperty("CustomInitiativeHeroImageRight"));
				log.error("TEST FAILED: The Actual and Expected Custom Initiative Hero Image Right are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Custom Initiative Hero Image Right On Hero Image Right");
			}
		}
		// Verify Custom Initiative Hero Video Left for Initiative Preview page
			public static void VerifyCustomInitiative_HeroVideoLeft(){
				String actualCustomInitiativeHeroVideoLeft="";
				try{
					actualCustomInitiativeHeroVideoLeft=sitecoreObj_CustomInitiative.customInitiativeHeroVideoLeft.getAttribute("class");
					Assert.assertEquals(actualCustomInitiativeHeroVideoLeft, expectedData.getProperty("CustomInitiativeHeroVideoLeft"));
					log.info("The Actual Custom Initiative Hero Video Left - "+actualCustomInitiativeHeroVideoLeft);
					log.info("The Expected Custom Initiative Hero Video Left - "+expectedData.getProperty("CustomInitiativeHeroVideoLeft"));
					log.info("TEST PASSED: The Actual and Expected Custom Initiative Hero Video Left are Same");
				}catch(AssertionError e){
					log.error("The Actual Custom Initiative Hero Video Left - "+actualCustomInitiativeHeroVideoLeft);
					log.error("The Expected Custom Initiative Hero Video Left - "+expectedData.getProperty("CustomInitiativeHeroVideoLeft"));
					log.error("TEST FAILED: The Actual and Expected Custom Initiative Hero Video Left are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Custom Initiative Hero Video Left On Hero Video Left");
				}
			}
		// Verify Custom Initiative Hero Video Right for Initiative Preview page
			public static void VerifyCustomInitiative_HeroVideoRight(){
				String actualCustomInitiativeHeroVideoRight="";
				try{
					actualCustomInitiativeHeroVideoRight=sitecoreObj_CustomInitiative.customInitiativeHeroVideoRight.getAttribute("class");
					Assert.assertEquals(actualCustomInitiativeHeroVideoRight, expectedData.getProperty("CustomInitiativeHeroVideoRight"));
					log.info("The Actual Custom Initiative Hero Video Right - "+actualCustomInitiativeHeroVideoRight);
					log.info("The Expected Custom Initiative Hero Video Right - "+expectedData.getProperty("CustomInitiativeHeroVideoRight"));
					log.info("TEST PASSED: The Actual and Expected Custom Initiative Hero Video Right are Same");
				}catch(AssertionError e){
					log.error("The Actual Custom Initiative Hero Video Right - "+actualCustomInitiativeHeroVideoRight);
					log.error("The Expected Custom Initiative Hero Video Right - "+expectedData.getProperty("CustomInitiativeHeroVideoRight"));
					log.error("TEST FAILED: The Actual and Expected Custom Initiative Hero Video Right are NOT same");
				}catch(org.openqa.selenium.NoSuchElementException e){
					log.error("TEST FAILED: There is No Custom Initiative Hero Video Right On Hero Video Right");
				}
			}
		
	}
