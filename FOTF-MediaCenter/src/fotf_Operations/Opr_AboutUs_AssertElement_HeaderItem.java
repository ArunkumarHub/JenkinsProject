package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_HeaderItem extends Basedriver{
	

	// Verify Header Image Left for AutoAboutUs Preview page
	public static void VerifyHeaderImageOnLeft(){
		String actualLeftAlignImg="";
		try{
			actualLeftAlignImg=sitecoreObj_HeaderItem.aboutusHeaderItemLeftImage.getAttribute("class");
			Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("headerImageOnLeft"));
			log.info("The Actual AboutUs Header Left image - "+actualLeftAlignImg);
			log.info("The Expected AboutUs Header Left image - "+expectedData.getProperty("headerImageOnLeft"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Left images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Left image - "+actualLeftAlignImg);
			log.error("The Expected AboutUs Header Left image - "+expectedData.getProperty("headerImageOnLeft"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Left images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Header Left element");
		}
	}
	
	// Verify Header Image Right for AutoAboutUs Preview page
	public static void VerifyHeaderImageOnRight(){	
		String actualRightAlignImg="";
		try{
			actualRightAlignImg=sitecoreObj_HeaderItem.aboutusHeaderItemRightImage.getAttribute("class");
			Assert.assertEquals(actualRightAlignImg, expectedData.getProperty("headerImageOnRight"));
			log.info("The Actual AboutUs Header Right image - "+actualRightAlignImg);
			log.info("The Expected AboutUs Header Right image - "+expectedData.getProperty("headerImageOnRight"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Right images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Right image - "+actualRightAlignImg);
			log.error("The Expected AboutUs Header Right image - "+expectedData.getProperty("headerImageOnRight"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Right images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Header Right element");
		}
	}
	
	// Verify Header Image Top for AutoAboutUs Preview page
	public static void VerifyHeaderImageOnTop(){
		String actualTopAlignImg="";
		try{
			actualTopAlignImg=sitecoreObj_HeaderItem.aboutusHeaderItemTopImage.getAttribute("class");
			Assert.assertEquals(actualTopAlignImg, expectedData.getProperty("headerImageOnTop"));
			log.info("The Actual AboutUs Header Top image - "+actualTopAlignImg);
			log.info("The Expected AboutUs Header Top image - "+expectedData.getProperty("headerImageOnTop"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Top images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Top image - "+actualTopAlignImg);
			log.error("The Expected AboutUs Header Top image - "+expectedData.getProperty("headerImageOnTop"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Top images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Header Top element");
		}
	}	
	
	// Verify Video Element for AutoAboutUs Preview page
	public static void VerifyHeaderVideo(){
		String actualListText="";
		try{
			actualListText=sitecoreObj_HeaderItem.aboutusHeaderVideo.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("headerVideoOnRight"));
			log.info("The Actual AboutUs Header Video - "+actualListText);
			log.info("The Expected AboutUs Header Video - "+expectedData.getProperty("headerVideoOnRight"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Video are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Video - "+actualListText);
			log.error("The Expected AboutUs Header Video - "+expectedData.getProperty("headerVideoOnRight"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Video are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Header Video element");
		}
	}
	
	// Verify Video Link Items Element for AutoAboutUs Preview page
	public static void HeaderVideoLinkItems(){
		String actualListText="";
		try{
			actualListText=sitecoreObj_HeaderItem.aboutusHeaderVideoLinkItems.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("headerVideoLinkItems"));
			log.info("The Actual AboutUs Header Video Link Items - "+actualListText);
			log.info("The Expected AboutUs Header Video Link Items - "+expectedData.getProperty("headerVideoLinkItems"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Video Link Items are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Video Link Items - "+actualListText);
			log.error("The Expected AboutUs Header Video Link Items - "+expectedData.getProperty("headerVideoLinkItems"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Video Link Items are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Header Video Link Items element");
		}
	}
	
	// Verify Image Carousel Element for AutoAboutUs Preview page
	public static void VerifyHeaderImageCarousel(){
		String actualListText="";
		try{
			actualListText=sitecoreObj_HeaderItem.aboutusHeaderImageCarousel.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("HeaderImageCarouselItems"));
			log.info("The Actual AboutUs Header Image Carousel Items- "+actualListText);
			log.info("The Expected AboutUs Header Image Carousel Items - "+expectedData.getProperty("HeaderImageCarouselItems"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Image Carousel Items are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Image Carousel Items - "+actualListText);
			log.error("The Expected AboutUs Header Image Carousel Items - "+expectedData.getProperty("HeaderImageCarouselItems"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Image Carousel Items are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Header Image Carousel Items element");
		}
	}
	
	// Verify Image Carousel Description Element for AutoAboutUs Preview page
	public static void VerifyHeaderImageCarouselDescription(){
		String actualListText="";
		try{
			actualListText=sitecoreObj_HeaderItem.aboutusHeaderImageCarouselItemDesc.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("HeaderImageCarouselDescription"));
			log.info("The Actual AboutUs Header Image Carousel Description - "+actualListText);
			log.info("The Expected AboutUs Header Image Carousel Description - "+expectedData.getProperty("HeaderImageCarouselDescription"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Header Image Carousel Description are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Header Image Carousel Description - "+actualListText);
			log.error("The Expected AboutUs Header Image Carousel Description - "+expectedData.getProperty("HeaderImageCarouselDescription"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Header Image Carousel Description are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Header Image Carousel Description element");
		}
	}
}
