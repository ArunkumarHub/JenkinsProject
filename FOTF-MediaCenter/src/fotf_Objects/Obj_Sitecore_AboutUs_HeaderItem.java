package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_HeaderItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_HeaderItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(css="figure[class='aboutus_header_image_left--image']")
	public static WebElement aboutusHeaderItemLeftImage;
	
	@FindBy(css="figure[class='aboutus_header_image_right--image']")
	public static WebElement aboutusHeaderItemRightImage;
	
	@FindBy(css="figure[class='aboutus_header_image_top--image']")
	public static WebElement aboutusHeaderItemTopImage;
	
	@FindBy(css="div[class='aboutus_header_video_right--media_player']")
	public static WebElement aboutusHeaderVideo;
	
	@FindBy(css="ul[class='aboutus_header_video_right--link_items']")
	public static WebElement aboutusHeaderVideoLinkItems;
	
	@FindBy(css="div[class='slider_inner--item drop-shadow lifted ng-scope']")
	public static WebElement aboutusHeaderImageCarousel;
	
	@FindBy(css="div[class='aboutus_header_image_carousel--text']")
	public static WebElement aboutusHeaderImageCarouselItemDesc;	
	
	
	
	
	
	
}

