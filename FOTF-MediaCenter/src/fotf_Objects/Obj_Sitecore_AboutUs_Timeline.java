package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs_Timeline extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs_Timeline(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	
	// Timeline Basic Components
			@FindBy(css="ul[class='aboutus_timeline--container']")
			public static WebElement aboutusTimelineContainer;

			@FindBy(css="div[class='aboutus_timeline--content']")
			public static WebElement aboutusTimelineContent;
			
			@FindBy(css="h3[class='aboutus_timeline_year--data']")
			public static WebElement aboutusTimelineYear;
			
			@FindBy(css="div[class='aboutus_timeline_month--data']")
			public static WebElement aboutusTimelineMonth;
	
	
	
}

