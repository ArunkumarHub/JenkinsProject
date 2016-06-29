package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_Showhide extends Basedriver{
	
	public static void VerifyImage_ShowhideImageLeft(){
		String actualLeftAlignImg="";
		try{
			actualLeftAlignImg=sitecoreObj_Showhide.aboutusShowhideItemImage.getAttribute("class");
			Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("ShowhideImageOnLeft"));
			log.info("The Actual AboutUs Showhide Left image - "+actualLeftAlignImg);
			log.info("The Expected AboutUs Showhide Left image - "+expectedData.getProperty("ShowhideImageOnLeft"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Showhide Left images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Showhide Left image - "+actualLeftAlignImg);
			log.error("The Expected AboutUs Showhide Left image - "+expectedData.getProperty("ShowhideImageOnLeft"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Showhide Left images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Showhide Left element");
		}
	}	
	
	public static void VerifyExpandableHeader_ShowhideImageLeft(){
		String actualLeftAlignImg="";
		try{
			actualLeftAlignImg=sitecoreObj_Showhide.aboutusShowhideExpandableHeader.getAttribute("class");
			Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("ShowhideExpandableHeader"));
			log.info("The Actual AboutUs Showhide Expandable Header - "+actualLeftAlignImg);
			log.info("The Expected AboutUs Showhide Expandable Header - "+expectedData.getProperty("ShowhideExpandableHeader"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Showhide Expandable Headers are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Showhide Expandable Header - "+actualLeftAlignImg);
			log.error("The Expected AboutUs Showhide Expandable Header - "+expectedData.getProperty("ShowhideExpandableHeader"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Showhide Expandable Headers are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Showhide Expandable Header element");
		}
	}
	
	// Verify Showhide Image Left ExpandableContent for AutoAboutUs Preview page
		public static void VerifyExpandableContent_ShowhideImageLeft(){
			String actualLeftAlignImg="";
			try{
				actualLeftAlignImg=sitecoreObj_Showhide.aboutusShowhideExpandableContent.getAttribute("class");
				Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("ShowhideExpandableContent"));
				log.info("The Actual AboutUs Showhide Expandable Content - "+actualLeftAlignImg);
				log.info("The Expected AboutUs Showhide Expandable Content - "+expectedData.getProperty("ShowhideExpandableContent"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Showhide Expandable Contents are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Showhide Expandable Content - "+actualLeftAlignImg);
				log.error("The Expected AboutUs Showhide Expandable Content - "+expectedData.getProperty("ShowhideExpandableContent"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Showhide Expandable Contents are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Showhide Expandable Content element");
			}
		}
		
		// Verify Showhide Image Left ExpandableHeaderfor AutoAboutUs Preview page
		public static void VerifyExpandableHeaderOpen_ShowhideImageLeft(){
			String actualLeftAlignImg="";
			try{
				actualLeftAlignImg=sitecoreObj_Showhide.aboutusShowhideExpandableHeaderOpen.getAttribute("class");
				Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("ShowhideExpandableHeaderOpen"));
				log.info("The Actual AboutUs Showhide Expandable Open Header - "+actualLeftAlignImg);
				log.info("The Expected AboutUs Showhide Expandable Open Header - "+expectedData.getProperty("ShowhideExpandableHeaderOpen"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Showhide Expandable Open Headers are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Showhide Expandable Open Header - "+actualLeftAlignImg);
				log.error("The Expected AboutUs Showhide Expandable Open Header - "+expectedData.getProperty("ShowhideExpandableHeaderOpen"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Showhide Expandable Open Headers are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Showhide Expandable Open Header element");
			}
		}	
		
		// Verify Showhide Image Left ExpandableContentfor AutoAboutUs Preview page
		public static void VerifyExpandableContentOpen_ShowhideImageLeft(){
			String actualLeftAlignImg="";
			try{
				actualLeftAlignImg=sitecoreObj_Showhide.aboutusShowhideExpandableContentOpen.getAttribute("class");
				Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("ShowhideExpandableContentOpen"));
				log.info("The Actual AboutUs Showhide Expandable Open Content - "+actualLeftAlignImg);
				log.info("The Expected AboutUs Showhide Expandable Open Content - "+expectedData.getProperty("ShowhideExpandableContentOpen"));
				log.info("TEST PASSED: The Actual and Expected AboutUs Showhide Expandable Open Contents are Same");
			}catch(AssertionError e){
				log.error("The Actual AboutUs Showhide Expandable Open Content - "+actualLeftAlignImg);
				log.error("The Expected AboutUs Showhide Expandable Open Content - "+expectedData.getProperty("ShowhideExpandableContentOpen"));
				log.error("TEST FAILED: The Actual and Expected AboutUs Showhide Expandable Open Contents are NOT same");
			}catch(org.openqa.selenium.NoSuchElementException e){
				log.error("TEST FAILED: There is No Image On Showhide Expandable Open Content element");
			}
		}
	
		// Verify ContentTitle Element for the TitleText Component on AutoAboutUs Preview page
				public static void VerifyTitleText_ContentTitle(String headerTag){
					String actualTitleTextContentTitle = null;
					for(int i=1; i<=3; i++){
					try{
						actualTitleTextContentTitle=Driver.findElement(By.xpath(headerTag + i +"]")).getText();
						Assert.assertEquals(actualTitleTextContentTitle, dataSourceProvider.getProperty("Article" + i + "Title"));
						log.info("The Actual AboutUs Title Text is - "+actualTitleTextContentTitle);
						log.info("The Expected AboutUs Title Text is - "+dataSourceProvider.getProperty("Article" + i + "Title"));
						log.info("TEST PASSED: The Actual and Expected AboutUs  Title Text are Same");
					}catch(AssertionError e){
						log.error("The Actual AboutUs Title Text is - "+actualTitleTextContentTitle);
						log.error("The Expected AboutUs Title Text is - "+dataSourceProvider.getProperty("Article" + i + "Title"));
						log.error("TEST FAILED: The Actual and Expected AboutUs TitleText ContentTitle are NOT same");
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No ContentTitle element On TitleText Container");
					}		
				  }
				}
				
				// Verify Showhide grouping happen year wise
				public static void VerifyGroupByYear(){
					String actualTitleTextContentTitle = null;
					String articlePublishYear = null;
					String publishYear = null;
					String articleTitle = null;
					int articleYearCount;
					int headerTagCount=Driver.findElements(By.xpath("//h3[@class='showhide--expandable_header']")).size();
					
					for(int i=1; i<=headerTagCount; i++){
					try{
						sitecoreObj.aboutusShowHideexpand.click();
						//articleYearCount=Driver.findElements(By.xpath("//h3[@class='showhide--expandable_header js--is_open'][" + i + "/following-sibling::div/div[@class='news_release']/em")).size();
						articleYearCount=Driver.findElements(By.xpath("//div[@class='showhide--expandable_content js--is_open'][" + i + "]/div[@class='news_release']/em")).size();
						String showHideTitleText = Driver.findElement(By.xpath("//h3[@class='showhide--expandable_header js--is_open'][" + i +"]")).getText();
						String titleYear = showHideTitleText.substring(0, 4);
						for (int j=1; j<=articleYearCount; j++){
							try{
							articlePublishYear = Driver.findElement(By.xpath("//div[@class='showhide--expandable_content js--is_open'][" + i + "]/div[@class='news_release']/em[" + j +"]")).getText();
							publishYear = articlePublishYear.substring(articlePublishYear.length()-4);
							articleTitle = Driver.findElement(By.xpath("//div[@class='showhide--expandable_content js--is_open'][" + i + "]/div[@class='news_release']/h4[" + j +"]")).getText();
							Assert.assertEquals(publishYear,titleYear);
							log.info("Article's (" + articleTitle + ") published year (" + publishYear +") matching with expandable header title's year " + titleYear);
						}catch(AssertionError e){
							log.error("Article's (" + articleTitle + ") published year (" + publishYear +") not matching with expandable header title's year " + titleYear);
						}
					}
						
						/*Assert.assertEquals(actualTitleTextContentTitle, dataSourceProvider.getProperty("Article" + i + "Title"));
						log.info("The Actual AboutUs Title Text is - "+actualTitleTextContentTitle);
						log.info("The Expected AboutUs Title Text is - "+dataSourceProvider.getProperty("Article" + i + "Title"));
						log.info("TEST PASSED: The Actual and Expected AboutUs  Title Text are Same");*/
					}catch(org.openqa.selenium.NoSuchElementException e){
						log.error("TEST FAILED: There is No element for Showhide component");
					}		
				  }
				}
}
