package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_PageComponentHeader extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_PageComponentHeader(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}	
	
	// PageComponentHeader Components
	@FindBy(xpath="//a[@class='aboutus--more_button js--expandable_trigger']")
	public static WebElement aboutusPageComponentMoreButton;

	@FindBy(css="div[class='aboutus_topics--container js--expandable_content js--expandable_topics js--is_open']")	
	public static WebElement aboutusPageComponentMoreContainer;
	
	@FindBy(xpath="//div[@class='aboutus_header--layout js--topic_list']/h1")
	public static WebElement aboutusPageComponentTitle;
	
	@FindBy(xpath="//div[@class='header_list--preview']/ul/li/a")
	public static WebElement aboutusPageComponentSiblings;
	
	@FindBy(xpath="//div[@class='aboutus_topics--container js--expandable_content js--expandable_topics']/ul/li/a")
	public static WebElement aboutusPageComponentMoreSiblings;	
	
	public String siblingsXpath = "//div[@class='header_list--preview']/ul/li[1]/a";
	public String moreSiblingsXpath = "//div[@class='aboutus_topics--container js--expandable_content js--expandable_topics js--is_open']/ul/li[1]/a";
}

