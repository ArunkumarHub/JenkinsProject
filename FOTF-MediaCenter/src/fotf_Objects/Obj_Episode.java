package fotf_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Episodepage;

public class Obj_Episode extends Opr_Episodepage{
	public Obj_Episode(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	// Object Declaration for Episodes Search Item
	@FindBy(xpath=".//*[@id='past-episodes']/div[1]/form/input")
	public static WebElement episodeSearchTextBox;
	
	@FindBy(xpath="//*[contains(text(),'Talking With Your Kids About Money')]")
	public static WebElement pastEpisodeTitle;
}
