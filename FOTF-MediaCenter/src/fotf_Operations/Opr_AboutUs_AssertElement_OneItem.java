package fotf_Operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import fotf_Config.Basedriver;

public class Opr_AboutUs_AssertElement_OneItem extends Basedriver{
	
	// Verify Right Image Element for AutoAboutUs Preview page
	public static void VerifyRightImage(){
		String actualRightImg="";
		try{
			actualRightImg=sitecoreObj_OneItem.aboutusRightImage.getAttribute("class");
			Assert.assertEquals(actualRightImg, expectedData.getProperty("imageOnRight"));
			log.info("The Actual AboutUs Right image - "+actualRightImg);
			log.info("The Expected AboutUs Right image - "+expectedData.getProperty("imageOnRight"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Right images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Right image - "+actualRightImg);
			log.error("The Expected AboutUs Right image - "+expectedData.getProperty("imageOnRight"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Right images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Right element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}

	// Verify Right Image Element for AutoAboutUs Preview page
	public static void VerifyButtonWithRightImage(){
		String actualRightImg="";
		try{
			actualRightImg=sitecoreObj_OneItem.aboutusButtonWithRightImage.getAttribute("class");
			Assert.assertEquals(actualRightImg, expectedData.getProperty("buttonImageOnRight"));
			log.info("The Actual AboutUs Right image - "+actualRightImg);
			log.info("The Expected AboutUs Right image - "+expectedData.getProperty("imageOnRight"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Right images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Right image - "+actualRightImg);
			log.error("The Expected AboutUs Right image - "+expectedData.getProperty("imageOnRight"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Right images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Right element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
		
	// Verify Left Image Element for AutoAboutUs Preview page	
	public static void VerifyLeftImage(){
		String actualLeftImg="";
		try{
			actualLeftImg=sitecoreObj_OneItem.aboutusLeftImage.getAttribute("class");
			Assert.assertEquals(actualLeftImg, expectedData.getProperty("imageOnLeft"));
			log.info("The Actual AboutUs Left image - "+actualLeftImg);
			log.info("The Expected AboutUs Left image - "+expectedData.getProperty("imageOnLeft"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Left images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Left image - "+actualLeftImg);
			log.error("The Expected AboutUs Left image - "+expectedData.getProperty("imageOnLeft"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Left images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Left element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
		
	// Verify Right Button Element for AutoAboutUs Preview page	
	public static void VerifyButtonOnRight(){
		String actualRightButton="";
		try{
			actualRightButton=sitecoreObj_OneItem.aboutusRightButton.getAttribute("class");
			Assert.assertEquals(actualRightButton, expectedData.getProperty("buttonOnRight"));
			log.info("The Actual AboutUs Right button - "+actualRightButton);
			log.info("The Expected AboutUs Right button - "+expectedData.getProperty("buttonOnRight"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Right buttons are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Right button - "+actualRightButton);
			log.error("The Expected AboutUs Right button - "+expectedData.getProperty("buttonOnRight"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Right buttons are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No button On Right element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
		
	// Verify Left Button Element for AutoAboutUs Preview page
	public static void VerifyButtonOnLeft(){
		String actualLeftButton="";
		try{
			actualLeftButton=sitecoreObj_OneItem.aboutusLeftButton.getAttribute("class");
			Assert.assertEquals(actualLeftButton, expectedData.getProperty("buttonOnLeft"));
			log.info("The Actual AboutUs Left button - "+actualLeftButton);
			log.info("The Expected AboutUs Left button - "+expectedData.getProperty("buttonOnLeft"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Left buttons are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Left button - "+actualLeftButton);
			log.error("The Expected AboutUs Left button - "+expectedData.getProperty("buttonOnLeft"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Left buttons are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No button On Left element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
		
	// Verify Description Element for the Right Image Component on AutoAboutUs Preview page
	public static void VerifyImageRightDescription(){
		String actualRightImg ="";
		try{
			actualRightImg=sitecoreObj_OneItem.aboutusRightImageDescription.getAttribute("class");
			Assert.assertEquals(actualRightImg, expectedData.getProperty("imageDescriptionOnRight"));
			log.info("The Actual AboutUs Right Description - "+actualRightImg);
			log.info("The Expected AboutUs Right Description - "+expectedData.getProperty("imageDescriptionOnRight"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Right Descriptions are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Right Description - "+actualRightImg);
			log.error("The Expected AboutUs Right Description - "+expectedData.getProperty("imageDescriptionOnRight"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Right Descriptions are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On Right element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}

	// Verify Description Element for the Left Image Component on AutoAboutUs Preview page
	public static void VerifyImageLeftDescription(){
		String actualLeftImg ="";
		try{
			actualLeftImg=sitecoreObj_OneItem.aboutusLeftImageDescription.getAttribute("class");
			Assert.assertEquals(actualLeftImg, expectedData.getProperty("imageDescriptionOnLeft"));
			log.info("The Actual AboutUs Left Description - "+actualLeftImg);
			log.info("The Expected AboutUs Left Description - "+expectedData.getProperty("imageDescriptionOnLeft"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Left Descriptions are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Left Description - "+actualLeftImg);
			log.error("The Expected AboutUs Left Description - "+expectedData.getProperty("imageDescriptionOnLeft"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Left Descriptions are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On Left element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
		
	// Verify Center Image Element for AutoAboutUs Preview page	
	public static void VerifyCenterImage(){
		String actualCenterImg="";
		try{
			actualCenterImg=sitecoreObj_OneItem.aboutusCenterImage.getAttribute("class");
			Assert.assertEquals(actualCenterImg, expectedData.getProperty("imageOnCenter"));
			log.info("The Actual AboutUs Center image - "+actualCenterImg);
			log.info("The Expected AboutUs Center image - "+expectedData.getProperty("imageOnCenter"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Center images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Center image - "+actualCenterImg);
			log.error("The Expected AboutUs Center image - "+expectedData.getProperty("imageOnCenter"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Center images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Center element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
			
	// Verify Center Button Element for AutoAboutUs Preview page
	public static void VerifyButtonOnCenter(){
		String actualCenterButton="";
		try{
			actualCenterButton=sitecoreObj_OneItem.aboutusCenterButton.getAttribute("class");
			Assert.assertEquals(actualCenterButton, expectedData.getProperty("buttonOnCenter"));
			log.info("The Actual AboutUs Center button - "+actualCenterButton);
			log.info("The Expected AboutUs Center button - "+expectedData.getProperty("buttonOnCenter"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Center buttons are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Center button - "+actualCenterButton);
			log.error("The Expected AboutUs Center button - "+expectedData.getProperty("buttonOnCenter"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Center buttons are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No button On Center element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
			
	// Verify List Icon Element for AutoAboutUs Preview page
	public static void VerifyListIcon(String renderingControl){
		String actualListIcon="";
		try{
			actualListIcon=sitecoreObj_OneItem.aboutusListIcon.getAttribute("class");
			Assert.assertEquals(actualListIcon, expectedData.getProperty("aboutusListIcon"));
			log.info("The Actual AboutUs " + renderingControl + " List Icon - "+actualListIcon);
			log.info("The Expected AboutUs " + renderingControl + " List Icon - "+expectedData.getProperty("aboutusListIcon"));
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " List Icon are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " List Icon - "+actualListIcon);
			log.error("The Expected AboutUs " + renderingControl + " List Icon - "+expectedData.getProperty("aboutusListIcon"));
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " List Icon are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No List Icon on " + renderingControl + " element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
				
	// Verify List Text Element for AutoAboutUs Preview page
	public static void VerifyListText(String renderingControl){
		String actualListText="";
		try{
			actualListText=sitecoreObj_OneItem.aboutusListText.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("aboutusListText"));
			log.info("The Actual AboutUs " + renderingControl + " List Text - "+actualListText);
			log.info("The Expected AboutUs " + renderingControl + " List Text - "+expectedData.getProperty("aboutusListText"));
			log.info("TEST PASSED: The Actual and Expected AboutUs " + renderingControl + " List Text are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs " + renderingControl + " List Text - "+actualListText);
			log.error("The Expected AboutUs " + renderingControl + " List Text - "+expectedData.getProperty("aboutusListText"));
			log.error("TEST FAILED: The Actual and Expected AboutUs " + renderingControl + " List Text are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No List Text on " + renderingControl + " element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
	
	// Verify Left-align Image Element for AutoAboutUs Preview page	
	public static void VerifyLeft_AlignImage(){
		String actualLeftAlignImg="";
		try{
			actualLeftAlignImg=sitecoreObj_OneItem.aboutusLeftAlignImage.getAttribute("class");
			Assert.assertEquals(actualLeftAlignImg, expectedData.getProperty("imageOnLeft-align"));
			log.info("The Actual AboutUs Left-align image - "+actualLeftAlignImg);
			log.info("The Expected AboutUs Left-align image - "+expectedData.getProperty("imageOnLeft-align"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Left-align images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Left-align image - "+actualLeftAlignImg);
			log.error("The Expected AboutUs Left-align image - "+expectedData.getProperty("imageOnLeft-align"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Left-align images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Left-align element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
				
	// Verify Description Element for the LeftAlign Image Component on AutoAboutUs Preview page
	public static void VerifyImageLeftAlignDescription(){
		String actualLeftAligndesc="";
		try{
			actualLeftAligndesc=sitecoreObj_OneItem.aboutusLeftAlignedImageDescription.getAttribute("class");
			Assert.assertEquals(actualLeftAligndesc, expectedData.getProperty("leftAlignDescription"));
			log.info("The Actual AboutUs LeftAlign Description - "+actualLeftAligndesc);
			log.info("The Expected AboutUs LeftAlign Description - "+expectedData.getProperty("leftAlignDescription"));
			log.info("TEST PASSED: The Actual and Expected AboutUs LeftAlign Descriptions are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs LeftAlign Description - "+actualLeftAligndesc);
			log.error("The Expected AboutUs LeftAlign Description - "+expectedData.getProperty("leftAlignDescription"));
			log.error("TEST FAILED: The Actual and Expected AboutUs LeftAlign Descriptions are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On LeftAlign element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
	
	// Verify Right-align Image Element for AutoAboutUs Preview page	
	public static void VerifyRight_AlignImage(){
		String actualRightAlignImg="";
		try{
			actualRightAlignImg=sitecoreObj_OneItem.aboutusRightAlignImage.getAttribute("class");
			Assert.assertEquals(actualRightAlignImg, expectedData.getProperty("imageOnRight-align"));
			log.info("The Actual AboutUs Right-align image - "+actualRightAlignImg);
			log.info("The Expected AboutUs Right-align image - "+expectedData.getProperty("imageOnRight-align"));
			log.info("TEST PASSED: The Actual and Expected AboutUs Right-align images are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs Right-align image - "+actualRightAlignImg);
			log.error("The Expected AboutUs Right-align image - "+expectedData.getProperty("imageOnRight-align"));
			log.error("TEST FAILED: The Actual and Expected AboutUs Right-align images are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Image On Right-align element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
				
	// Verify Description Element for the RightAlign Image Component on AutoAboutUs Preview page
	public static void VerifyImageRightAlignDescription(){
		String actualRightAligndesc="";
		try{
			actualRightAligndesc=sitecoreObj_OneItem.aboutusRightAlignedImageDescription.getAttribute("class");
			Assert.assertEquals(actualRightAligndesc, expectedData.getProperty("rightAlignDescription"));
			log.info("The Actual AboutUs RightAlign Description - "+actualRightAligndesc);
			log.info("The Expected AboutUs RightAlign Description - "+expectedData.getProperty("rightAlignDescription"));
			log.info("TEST PASSED: The Actual and Expected AboutUs RightAlign Descriptions are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs RightAlign Description - "+actualRightAligndesc);
			log.error("The Expected AboutUs RightAlign Description - "+expectedData.getProperty("rightAlignDescription"));
			log.error("TEST FAILED: The Actual and Expected AboutUs RightAlign Descriptions are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On RightAlign element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
	
	// Verify Description Element for the IFrame RightAlign Image Component on AutoAboutUs Preview page
	public static void VerifyIFrameOnRightAlignDescription(){
		String actualCenterButton="";				
		try{
			boolean flag=sitecoreObj_OneItem.aboutusIFrameonRightDescription.isDisplayed();
			Assert.assertEquals(flag, true);
			log.info("The Actual AboutUs RightAlign Description - <"+sitecoreObj_OneItem.aboutusIFrameonRightDescription.getTagName()+">");
			log.info("The Expected AboutUs RightAlign Description - <p>");
			log.info("TEST PASSED: TThe Actual and Expected AboutUs RightAlign Descriptions are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs RightAlign Description - " + sitecoreObj_OneItem.aboutusIFrameonRightDescription.getTagName());
			log.error("The Expected AboutUs RightAlign Description - <p>");
			log.error("TEST FAILED: The Actual and Expected AboutUs RightAlign Descriptions are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On RightAlign element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
	
	// Verify Description Element for the IFrame RightAlign Image Component on AutoAboutUs Preview page
	public static void VerifyPageEditorIFrameOnRightAlignDescription(){					
		try{
			boolean flag=sitecoreObj_OneItem.aboutusIFrameonRightDescription.isDisplayed();
			Assert.assertEquals(flag, true);
			log.info("The Actual AboutUs RightAlign Description - <"+sitecoreObj_OneItem.aboutusIFrameonRightDescription.getTagName()+">");
			log.info("The Expected AboutUs RightAlign Description - <p>");
			log.info("TEST PASSED: TThe Actual and Expected AboutUs RightAlign Descriptions are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs RightAlign Description - " + sitecoreObj_OneItem.aboutusIFrameonRightDescription.getTagName());
			log.error("The Expected AboutUs RightAlign Description - <p>");
			log.error("TEST FAILED: The Actual and Expected AboutUs RightAlign Descriptions are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Description On RightAlign element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}
	
	// Verify IFrame List Text Element for AutoAboutUs Preview page
	public static void VerifyIFrameListText(){
		String actualListText="";
		try{
			actualListText=sitecoreObj_OneItem.aboutusListTextForIFrame.getAttribute("class");
			Assert.assertEquals(actualListText, expectedData.getProperty("iFrameAboutusListText"));
			log.info("The Actual AboutUs List Text - "+actualListText);
			log.info("The Expected AboutUs List Text - "+expectedData.getProperty("iFrameAboutusListText"));
			log.info("TEST PASSED: The Actual and Expected AboutUs List Text are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs List Text - "+actualListText);
			log.error("The Expected AboutUs List Text - "+expectedData.getProperty("iFrameAboutusListText"));
			log.error("TEST FAILED: The Actual and Expected AboutUs List Text are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No List Text element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
	}

	// Verify IFrame On Right Element for AutoAboutUs Preview page
	public static void VerifyIFrameOnRightAlignWithListItems(){				
		String strIFrameClass="";
		try{
			Driver.switchTo().frame(1);
			strIFrameClass=sitecoreObj_OneItem.aboutusIFrameonRightIFrame.getAttribute("class");
			Assert.assertEquals(strIFrameClass, expectedData.getProperty("iFrameAboutusRightIframe"));
			log.info("The Actual AboutUs IFrame Right IFrame - "+strIFrameClass);
			log.info("The Expected AboutUs IFrame Right IFrame - "+expectedData.getProperty("iFrameAboutusRightIframe"));
			log.info("TEST PASSED: The Actual and Expected AboutUs List Text are Same");
		}catch(AssertionError e){
			log.error("The Actual AboutUs IFrame Right IFrame - "+strIFrameClass);
			log.error("The Expected AboutUs IFrame Right IFrame - "+expectedData.getProperty("iFrameAboutusRightIframe"));
			log.error("TEST FAILED: The Actual and Expected AboutUs IFrame Right IFrame are NOT same");
		}catch(org.openqa.selenium.NoSuchElementException e){
			log.error("TEST FAILED: There is No Right IFrame element");
		}
		catch(Exception e){
			log.error("TEST CASE FAILED: Terminated Abruptly " + e.getLocalizedMessage());	
		}
		Driver.switchTo().defaultContent();
	}
	
	
}
