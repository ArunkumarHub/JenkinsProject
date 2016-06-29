package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_Timeline extends Basedriver{
	
	// Verify TimelineBasic Component container for AutoAboutUs Preview page
		public static void VerifyTimelineBasic_container(){
			String actualcontainer="";
			try{
				actualcontainer=sitecoreObj_Timeline.aboutusTimelineContainer.getAttribute("class");
				Assert.assertEquals(actualcontainer, expectedData.getProperty("TimelineBasicContainer"));
				log.info("The Actual AboutUs TimelineBasic container - "+actualcontainer);
				log.info("The Expected AboutUs TimelineBasic container - "+expectedData.getProperty("TimelineBasicContainer"));
				log.info("TEST PASSED: The Actual and Expected AboutUs TimelineBasic container are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs TimelineBasic container - "+actualcontainer);
				log.error("The Expected AboutUs TimelineBasic container - "+expectedData.getProperty("TimelineBasicContainer"));
				log.error("TEST FAILED: The Actual and Expected AboutUs TimelineBasic container are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No container On TimelineBasic container element");
			}
		}
		
		// Verify TimelineBasic Component Content for AutoAboutUs Preview page
		public static void VerifyTimelineBasic_Content(){
			String actualContent="";
			try{
				actualContent=sitecoreObj_Timeline.aboutusTimelineContent.getAttribute("class");
				Assert.assertEquals(actualContent, expectedData.getProperty("TimelineBasicContent"));
				log.info("The Actual AboutUs TimelineBasic Content - "+actualContent);
				log.info("The Expected AboutUs TimelineBasic Content - "+expectedData.getProperty("TimelineBasicContent"));
				log.info("TEST PASSED: The Actual and Expected AboutUs TimelineBasic Content are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs TimelineBasic Content - "+actualContent);
				log.error("The Expected AboutUs TimelineBasic Content - "+expectedData.getProperty("TimelineBasicContent"));
				log.error("TEST FAILED: The Actual and Expected AboutUs TimelineBasic Content are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Content On TimelineBasic Content element");
			}
		}
		
		
		// Verify TimelineBasic Component Year for AutoAboutUs Preview page
		public static void VerifyTimelineBasic_Year(){
			String actualYear="";
			try{
				actualYear=sitecoreObj_Timeline.aboutusTimelineYear.getAttribute("class");
				Assert.assertEquals(actualYear, expectedData.getProperty("TimelineBasicYear"));
				log.info("The Actual AboutUs TimelineBasic Year - "+actualYear);
				log.info("The Expected AboutUs TimelineBasic Year - "+expectedData.getProperty("TimelineBasicYear"));
				log.info("TEST PASSED: The Actual and Expected AboutUs TimelineBasic Year are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs TimelineBasic Year - "+actualYear);
				log.error("The Expected AboutUs TimelineBasic Year - "+expectedData.getProperty("TimelineBasicYear"));
				log.error("TEST FAILED: The Actual and Expected AboutUs TimelineBasic Year are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Year On TimelineBasic Year element");
			}
		}
		
		// Verify TimelineBasic Component Month for AutoAboutUs Preview page
		public static void VerifyTimelineBasic_Month(){
			String actualMonth="";
			try{
				actualMonth=sitecoreObj_Timeline.aboutusTimelineMonth.getAttribute("class");
				Assert.assertEquals(actualMonth, expectedData.getProperty("TimelineBasicMonth"));
				log.info("The Actual AboutUs TimelineBasic Month - "+actualMonth);
				log.info("The Expected AboutUs TimelineBasic Month - "+expectedData.getProperty("TimelineBasicMonth"));
				log.info("TEST PASSED: The Actual and Expected AboutUs TimelineBasic Month are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs TimelineBasic Month - "+actualMonth);
				log.error("The Expected AboutUs TimelineBasic Month - "+expectedData.getProperty("TimelineBasicMonth"));
				log.error("TEST FAILED: The Actual and Expected AboutUs TimelineBasic Month are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Month On TimelineBasic Month element");
			}
		}	

}
