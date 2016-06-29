package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_OneItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_OneItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(css="figure[class='aboutus_img--right']")
	public static WebElement aboutusRightImage;
	
	@FindBy(css="figure[class='aboutus_btn_left--img_right']")
	public static WebElement aboutusButtonWithRightImage;	
	
	@FindBy(css="div[class='aboutus_text--left']")
	public static WebElement aboutusRightImageDescription;
	
	@FindBy(css="figure[class='aboutus_img--left']")
	public static WebElement aboutusLeftImage;
	
	@FindBy(css="a[class='aboutus_btn_right--more_link']")
	public static WebElement aboutusRightButton;
	
	@FindBy(css="a[class='aboutus_btn_left--more_link']")
	public static WebElement aboutusLeftButton;
	
	@FindBy(css="div[class='aboutus_text--right']")
	public static WebElement aboutusLeftImageDescription;
	
	
	@FindBy(css="figure[class='aboutus_btn_bottom--img_center']")
	public static WebElement aboutusCenterImage;
	
	@FindBy(css="a[class='aboutus_btn_bottom--more_link']")
	public static WebElement aboutusCenterButton;
	
	@FindBy(css="span[class='aboutus_listitems--img']")
	public static WebElement aboutusListIcon;
	
	@FindBy(css="div[class='aboutus_listitems--content']")
	public static WebElement aboutusListText;
	
	@FindBy(css="figure[class='aboutus_leftaligned_image--image']")
	public static WebElement aboutusLeftAlignImage;	
	
	@FindBy(css="div[class='aboutus_leftaligned_image--text']")
	public static WebElement aboutusLeftAlignedImageDescription;
	
	@FindBy(css="figure[class='aboutus_rightaligned_image--image']")
	public static WebElement aboutusRightAlignImage;
	
	@FindBy(css="div[class='aboutus_rightaligned_image--text']")
	public static WebElement aboutusRightAlignedImageDescription;
	
	@FindBy(xpath="html/body/div[2]/div/div/div/div/div/p")
	public static WebElement aboutusIFrameonRightDescription;
	
	@FindBy(css="div[class='aboutus_iframe_listitems--content']")
	public static WebElement aboutusListTextForIFrame;
	
	@FindBy(xpath=".//*[@id='mapDiv']/div")
	public static WebElement aboutusIFrameonRightIFrame;
	
	
	
	
}

