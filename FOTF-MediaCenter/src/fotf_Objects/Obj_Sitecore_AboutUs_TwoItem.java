package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_TwoItem extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_TwoItem(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	
	
		//Side By Side	
			
			@FindBy(css="figure[class='twoitems_sidebyside--img']")
			public static WebElement aboutusSideBySideImage;	
			
			@FindBy(css="a[class='twoitems_sidebyside_link']")
			public static WebElement aboutusSideBySideLink;	
			
		//Side By SideCentered				
			@FindBy(xpath="//div[@class='common--component_box']/div/div/p")
			public static WebElement aboutusSideBySideCenteredHeaderText;
			
			@FindBy(css="figure[class='twoitems_sidebyside_center--img']")
			public static WebElement aboutusSideBySideCenteredImage;		
			
			@FindBy(css="div[class='twoitems_sidebyside_center--text']")
			public static WebElement aboutusSideBySideCenteredText;	
	
	
}

