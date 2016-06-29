package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_Showhide extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_Showhide(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(css="figure[class='aboutus_showhide_image_left--image']")
	public static WebElement aboutusShowhideItemImage;
	
	@FindBy(css="h3[class='showhide--expandable_header']")
	public static WebElement aboutusShowhideExpandableHeader;
	
	@FindBy(css="div[class='showhide--expandable_content']")
	public static WebElement aboutusShowhideExpandableContent;
	
	@FindBy(css="h3[class='showhide--expandable_header js--is_open']")
	public static WebElement aboutusShowhideExpandableHeaderOpen;	
	
	@FindBy(css="div[class='showhide--expandable_content js--is_open']")
	public static WebElement aboutusShowhideExpandableContentOpen;	
	
	
	
	
}

