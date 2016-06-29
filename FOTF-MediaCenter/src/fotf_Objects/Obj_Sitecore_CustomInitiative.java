package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_CustomInitiative extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_CustomInitiative(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(css="div[class='initiative_custom_title--image']")
	public static WebElement customInitiativeTitleImage;
	
	@FindBy(css="h1[class='initiative_custom--title']")
	public static WebElement customInitiativeTitle;
	
	@FindBy(xpath="//div[@class='initiative_custom_hero--image_layout']/div[2]/p")
	public static WebElement customInitiativeDescription;
	
	@FindBy(css="a[class='button button--size_large button--color_blue']")
	public static WebElement customInitiativeButton;
	
	@FindBy(css="div[class='initiative_custom_hero--image_left']")
	public static WebElement customInitiativeHeroImageLeft;
	
	@FindBy(css="div[class='initiative_custom_hero--image_right']")
	public static WebElement customInitiativeHeroImageRight;
	
	@FindBy(css="div[class='initiative_custom_hero--video_left']")
	public static WebElement customInitiativeHeroVideoLeft;
	
	@FindBy(css="div[class='initiative_custom_hero--video_right']")
	public static WebElement customInitiativeHeroVideoRight;
	
}

