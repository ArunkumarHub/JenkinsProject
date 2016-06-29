package fotf_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fotf_Operations.Opr_Sitecore_AboutUs;

public class Obj_Sitecore_AboutUs extends Opr_Sitecore_AboutUs{
	public Obj_Sitecore_AboutUs(WebDriver Driver){
		PageFactory.initElements(Driver, this);
	}
	
	// Login Page for Sitecore Sandbox 
		@FindBy(xpath=".//*[@id='UserName']")
		public static WebElement userName;
		
		@FindBy(xpath=".//*[@id='Password']")
		public static WebElement passWord;
		
		@FindBy(xpath=".//*[@id='login']/input")
		public static WebElement loginButtion;
		
		@FindBy(xpath="//span[contains(text(), 'Content Editor')]")
		public static WebElement contentEditor;
		
	// Navigation to create Page Component on Sitecore 	
		@FindBy(xpath="//span[text()='Insert from template']")
		public static WebElement insertFromTemplate;
		
		@FindBy(xpath=".//*[@id='Templates_4842D1B1255843FF936FC5CCA0CB121B']/a/span")
		public static WebElement pageComponent;
	
		@FindBy(xpath="//span[text()='Custom Initiative Page']")
		public static WebElement customInitiativePageComponent;
		
		@FindBy(xpath=".//*[@id='Templates_EAD94BDA487647C6ADC4856C5D6BFA88']/a/span")
		public static WebElement commonComponent;
		
		@FindBy(xpath=".//*[@id='ItemName']")
		public static WebElement itemName;
		
		@FindBy(xpath=".//*[@id='OK']")
		public static WebElement insertButton;
		
		@FindBy(xpath=".//*[@id='OK']")
		public static WebElement okButton;
		
		@FindBy(xpath=".//*[@id='Templates_9E596A75A1BF43B8B7AF16538F128FDF']/img")
		public static WebElement componentsUnderCommon;
		
		@FindBy(xpath=".//*[@id='Templates_2E5892C5A5294646989B1F15DE10453E']/img")
		public static WebElement commonUnderTemplates;
		
	// Navigation to create Common Container for AutoAboutUs under FOTF.com on Sitecore 	
		//@FindBy(xpath="html/body/form/div[5]/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[2]//span[text()='auto-aboutus']")
		//public static WebElement autoAboutus;
		
		/*public static String autoAboutus = "html/body/form/div[5]/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[2]//span[text()='"
				+ pageComponentContentItemName + "']";*/
		
		@FindBy(xpath=".//*[@id='Ribbon_Nav_PresentationStrip']")
		public static WebElement presentation;
		
		@FindBy(xpath=".//*[@id='C5ED8240231C74EB98BC8440F61AAB8BE']/div[1]/a[1]/img")
		public static WebElement details;
		
		@FindBy(xpath=".//*[@id='LayoutPanelLayoutGrid']/tbody/tr[1]/td/div/div[2]/div[4]/span[1]")
		public static WebElement deviceEditor;	
		
		@FindBy(xpath=".//*[@id='tab_ControlsTab']")
		public static WebElement controls;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]")
		public static WebElement renderingControl;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[1]/img")
		public static WebElement renderingControlImg;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/table/tbody/tr/td[1]/img")
		public static WebElement renderingComponentImg;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/table/tbody/tr/td[2]/div/b")
		public static WebElement renderingComponent;
		
		@FindBy(xpath=".//*[@id='tabcontent_ControlsTab']/div/div[2]/button[1]")
		public static WebElement addControls;
		
		@FindBy(xpath=".//*[@id='tabcontent_ControlsTab']/div/div[2]/button[4]")
		public static WebElement changeControls;
		
		@FindBy(xpath=".//*[@id='tabcontent_ControlsTab']/div/div[2]/button[5]")
		public static WebElement removeControls;
						
		@FindBy(xpath=".//*[@id='Treeview_65D668F205F34614BEAAD2EDAF76754D']/a/span")
		public static WebElement imageOnRight;
		
		@FindBy(xpath=".//*[@id='Treeview_1D5A13FBDCCB4577A6423E7EF0C13817']/a/span")
		public static WebElement imageOnLeft;
		
		@FindBy(xpath=".//*[@id='Treeview_7822C86A41A34A3FA304107409425098']/a/span")
		public static WebElement buttonOnRight;
		
		@FindBy(xpath=".//*[@id='Treeview_5AB6D7172F0F4914A7F09DDA3078C3FA']/a/span")
		public static WebElement buttonOnLeft;
		
		@FindBy(xpath=".//*[@id='Treeview_34315BEEE3914E7FAF7D74DA735A5B66']/a/span")
		public static WebElement buttonOnBottom;
		
		@FindBy(xpath=".//*[@id='Treeview_7F4B6983EBEE4529A8D86A911F55AA53']/a/span")
		public static WebElement leftImageWithList;
		
		@FindBy(xpath=".//*[@id='Treeview_2E7A05C3D4244D2F9783A46077CBC803']/a/span")
		public static WebElement RightImageWithList;
		
		@FindBy(xpath=".//*[@id='Treeview_1EF76D510D4D4D85A49D51764B9FAD4D']/a/span")
		public static WebElement IFrameRightImageWithList;
		
		@FindBy(xpath=".//*[@id='Treeview_EA32264302B84493ABE6DF240E4782A8']/a/span")
		public static WebElement HeaderImageLeft;
		
		@FindBy(xpath=".//*[@id='Treeview_D301B360A7984FDC9238A5651D55C8E9']/a/span")
		public static WebElement HeaderImageRight;
		
		@FindBy(xpath=".//*[@id='Treeview_8529B360D67B40B3982CC2EDF5DFCCA3']/a/span")
		public static WebElement HeaderImageTop;
		
		@FindBy(xpath=".//*[@id='Treeview_F6669563B0C0432899DFCD7C0FE27AC9']/a/span")
		public static WebElement HeaderVideoRight;		
		
		@FindBy(xpath=".//*[@id='Treeview_545F497E91BD4ED08C52F455363ABA62']/a/span")
		public static WebElement HeaderImageCarousel;
				
		@FindBy(xpath=".//*[@id='Treeview_0B5B495F495C4C87BA082A4BEDDF9754']/a/span")
		public static WebElement ShowHideBasic;		
		
		@FindBy(xpath=".//*[@id='Treeview_176321F6564D4E20A1E2317DEB576641']/a/span")
		public static WebElement TimeLineBasic;
		
		@FindBy(xpath=".//*[@id='Treeview_D2903787965E445A8404151D102024B8']/a/span")
		public static WebElement HeroImageLeft;
		
		@FindBy(xpath=".//*[@id='Treeview_DEFAAF717C0F4C5B9E972EBB453A8398']/a/span")
		public static WebElement HeroImageRight;
		
		@FindBy(xpath=".//*[@id='Treeview_081048EEFDE44F138A45D0E1C6A12912']/a/span")
		public static WebElement HeroVideoLeft;
		
		@FindBy(xpath=".//*[@id='Treeview_5F7894789DF446A59FED740E8F67320A']/a/span")
		public static WebElement HeroVideoRight;
		
		@FindBy(xpath=".//*[@id='Treeview_FEFC212408F743AE845E633EC6C6678F']/a/span")
		public static WebElement fiveColumn;
		
		@FindBy(xpath=".//*[@id='Treeview_9E2A35F782D84B2EB27BDEDA2B749D1A']/a/span")
		public static WebElement twoBythree;
		
		@FindBy(xpath=".//*[@id='Treeview_E78BC5481F1C4B9797D3186092711970']/a/span")
		public static WebElement sideBySide;
		
		@FindBy(xpath=".//*[@id='Treeview_5523849336FF4CC6A87F37FA65A1054F']/a/span")
		public static WebElement sideBySideCentered;
		
		@FindBy(xpath=".//*[@id='Treeview_7FD65035B5ED4DC7A403C1BA2F7C7C62']/a/span")
		public static WebElement threeColumns;
		
		@FindBy(xpath=".//*[@id='Treeview_BF6048C926B4449ABB4B2485873E1DB1']/a/span")
		public static WebElement stackedImageLeft;
		
		@FindBy(xpath=".//*[@id='Treeview_E88FE995026B4DA1A06C79FE1750705D']/a/span")
		public static WebElement threeColumnsLinksOverlaid;
		
		@FindBy(xpath=".//*[@id='Treeview_806AB778F7094A43B8100A902B48DACF']/a/span")
		public static WebElement sixItem3Column;
		
		@FindBy(xpath=".//*[@id='Treeview_30EF1CEB579545B7949D19B86A83C427']/a/span")
		public static WebElement sixItem6Column;
		
		@FindBy(xpath=".//*[@id='Treeview_6D73CA2D3DF44AF4835AC91E69881414']/a/span")
		public static WebElement sixItem6ColumnWithText;
			
		@FindBy(xpath=".//*[@id='Treeview_B91B9C7285D64E939453A05BC783B6B0']/a/span")
		public static WebElement sixItem2Column;
		
		@FindBy(xpath=".//*[@id='Treeview_E74B9B4165C744C497D7D43C20EABC0C']/a/span")
		public static WebElement fourItem4ColumnRectangle;
		
		@FindBy(xpath=".//*[@id='Treeview_F8E33D5E476942D6B00D41FAFD904230']/a/span")
		public static WebElement fourItemWithInset;
		
		@FindBy(xpath=".//*[@id='Treeview_DF577D10BCCF413DA5198AFFC6FD682F']/a/span")
		public static WebElement fourItem2Column;
		
		@FindBy(xpath=".//*[@id='Treeview_FCE13C484EA8458E9EFBE6FFAF2F4366']/a/span")
		public static WebElement fourItem4ColumnSquare;
		
		@FindBy(xpath=".//*[@id='Treeview_C6A2AA9CDE4A443E90907BDC5BC67B61']/a/span")
		public static WebElement ShowHideImageLeft;
		
		@FindBy(xpath=".//*[@id='OK']")
		public static WebElement selectComponent;
		
		@FindBy(xpath=".//*[@id='FooterRow']/div/input[1]")
		public static WebElement selectDataSource;
		
		@FindBy(xpath=".//*[@id='Treeview_196FF899BFB049FEA66836BBCA3F9BA8']/img")
		public static WebElement component_Rendering;
		
		@FindBy(xpath=".//*[@id='Treeview_B330E35FE4FD4F4E96C8EFA455B9FE5A']/img")
		public static WebElement oneItem_Components;
		
		@FindBy(xpath=".//*[@id='Treeview_1DE337AD42BF4385BD9AB70F70152D5B']/img")
		public static WebElement headerItem_Components;
		
		@FindBy(xpath=".//*[@id='Treeview_7B002BAAC76240FA8FA16F6D23D43549']/Img")
		public static WebElement showHideItem_Components;
		
		@FindBy(xpath=".//*[@id='Treeview_3EBAF0758E3F4BD688BCF16C016E1938']/img")
		public static WebElement timeLineBasicItem_Components;
		
		@FindBy(xpath=".//*[@id='Treeview_CB53C75294B8434898EE4668148A173B']/img")
		public static WebElement fiveItem_Components;	
		
		@FindBy(xpath=".//*[@id='Treeview_B4917760E49B45BEAC22A446F3E8F0D7']/img")		
		public static WebElement twoItem_Components;	
		
		@FindBy(xpath=".//*[@id='Treeview_9AD78CCA59944B52BB4AB1AFBBB38869']/img")		
		public static WebElement threeItem_Components;

		@FindBy(xpath=".//*[@id='Treeview_38A34692B52242329908C9DA638179E9']/img")		
		public static WebElement sixItem_Components;
		
		@FindBy(xpath=".//*[@id='Treeview_8E4C87A04A5D4F99A44364235A6D483E']/img")		
		public static WebElement fourItem_Components;
		
		@FindBy(xpath=".//*[@id='Treeview_752895D959D4406BA92B3F61EEF05E7D']/img")		
		public static WebElement heroItem_Components;
				
		@FindBy(xpath=".//*[@id='Treeview_32566F0E768645F1A12FD7260BD78BC3']/img")
		public static WebElement renderings_Control;
		
		@FindBy(xpath=".//*[@id='Treeview_34315BEEE3914E7FAF7D74DA735A5B66']/a/span")
		public static WebElement oneItemList;
		
		@FindBy(xpath=".//*[@id='Treeview_545F497E91BD4ED08C52F455363ABA62']/a/span")
		public static WebElement headerItemlist;
		
		@FindBy(xpath=".//*[@id='Treeview_0B5B495F495C4C87BA082A4BEDDF9754']/a/span")
		public static WebElement showhideItemlist;
		
		@FindBy(xpath=".//*[@id='Treeview_176321F6564D4E20A1E2317DEB576641']/a/span")
		public static WebElement timeLineBasicItemlist;
		
		@FindBy(xpath=".//*[@id='Treeview_9E2A35F782D84B2EB27BDEDA2B749D1A']/a/span")
		public static WebElement fiveItemlist;
		
		@FindBy(xpath=".//*[@id='Treeview_E78BC5481F1C4B9797D3186092711970']/a/span")
		public static WebElement twoItemlist;
		
		@FindBy(xpath=".//*[@id='Treeview_BF6048C926B4449ABB4B2485873E1DB1']/a/span")
		public static WebElement threeItemlist;	
		
		@FindBy(xpath=".//*[@id='Treeview_806AB778F7094A43B8100A902B48DACF']/a/span")
		public static WebElement sixItemlist;	
		
		@FindBy(xpath=".//*[@id='Treeview_E74B9B4165C744C497D7D43C20EABC0C']/a/span")
		public static WebElement fourItemlist;
		
		@FindBy(xpath="//td[text()='Delete']")
		public static WebElement deleteItem;
		
		@FindBy(xpath="//td[text()='Refresh']")
		public static WebElement refreshItem;
		
	// Navigation to Select Common Container for AutoAboutUs under FOTF.com on Sitecore
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image On Right']")
		public static WebElement imageOnRightContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image On Left']")
		public static WebElement imageOnLeftContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Button On Right']")
		public static WebElement buttonOnRightContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Button On Left']")
		public static WebElement buttonOnLeftContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Button On Bottom']")
		public static WebElement buttonOnBottomContainer;
		
		@FindBy(xpath=".//*[@id='Treeview_FA5BA14BF76F465A9B70716F396BF971']/a/span")
		public static WebElement articleComponentControl;		
		
		@FindBy(xpath=".//*[@id='Treeview_7C9C2609071841D4B278F7148BA9E7A0']/a/span")
		public static WebElement pageComponentControl;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='PageComponent']")
		public static WebElement pageComponentContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Article Component']")
		public static WebElement articleContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Basic']")
		public static WebElement timeLineBasicContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Five Column']")
		public static WebElement fiveColumnContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='2x3']")
		public static WebElement twoBythreeContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Side By Side']")
		public static WebElement sideBySideContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Side By Side Centered']")
		public static WebElement sideBySideCenteredContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Three Columns']")
		public static WebElement threeColumnsContainer;		
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Stacked Image Left']")
		public static WebElement stackedImageLeftContainer;	
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Three Column Links Overlaid']")
		public static WebElement threeColumnsLinksOverlaidContainer;	
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Three Columns']")
		public static WebElement sixItem3ColumnContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Six Columns']")
		public static WebElement sixItem6ColumnContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Six Columns with Text']")
		public static WebElement sixItem6ColumnWithTextContainer;		
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Two Columns']")		
		public static WebElement sixItem2ColumnContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Four Columns Rectangle']")
		public static WebElement fourItem4ColumnsRectangleContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='With Inset']")
		public static WebElement fourItemWithInsetContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Two Columns']")
		public static WebElement fourItem2ColumnsContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Four Columns Square']")
		public static WebElement fourItem4ColumnsSquareContainer;		
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Left-Aligned Image with List Items']")
		public static WebElement LeftImageWithListContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Right-Aligned Image with List Items']")
		public static WebElement RightImageWithListContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='IFrame On Right With List Items']")
		public static WebElement IFrameRightImageWithListContainer;		
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Left']")
		public static WebElement HeaderImageLeftContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Left']")
		public static WebElement HeroImageLeftContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Right']")
		public static WebElement HeroImageRightContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/div/b[text()='Video Left']")
		public static WebElement HeroVideoLeftContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/table/tbody/tr/td[2]/div/b[text()='Video Right']")
		public static WebElement HeroVideoRightContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Right']")
		public static WebElement HeaderImageRightContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Top']")
		public static WebElement HeaderImageTopContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Video Right with Link Items']")
		public static WebElement HeaderVideoRightContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Carousel']")
		public static WebElement HeaderImageCarouselContainer;		
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Image Left']")
		public static WebElement ShowHideImageLeftContainer;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]//b[text()='Basic']")
		public static WebElement ShowHideBasicContainer;		
		
		@FindBy(xpath=".//*[@id='btnEdit']")
		public static WebElement editContainer;
		
		@FindBy(xpath="html/body/form/div[3]/div[2]/div/div/div/div/div[1]/div/table[1]/tbody/tr/td/table[1]/tbody/tr/td[2]/div[2]/input")
		public static WebElement placeHolderText;
		
		@FindBy(xpath="html/body/form/div[3]/div[2]/div/div/div/div/div[1]/div/table[1]/tbody/tr/td/table[2]/tbody/tr/td[2]/div[3]/input")
		public static WebElement dataSource;

		@FindBy(xpath=".//*[@id='PlaceholderName']")
		public static WebElement placeHolderName;
		
		@FindBy(xpath=".//*[@id='Ribbon_Nav_PublishStrip']")
		public static WebElement publishItem;
		
		@FindBy(xpath="html/body/form/div[5]/div[1]/div[3]/div/div[2]/div[5]/div[3]/div[1]/div[2]/a[2]//span[text()='Preview']")
		public static WebElement previewMode;
		
		@FindBy(xpath="html/body/div[2]/div[1]/a")
		public static WebElement skipImage;
	
		// Common Object Items for Assert
		@FindBy(xpath="//div[@class='common--component_box']/h2")
		public static WebElement aboutusCommonComponent_H2;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div[2]/h2")
		public static WebElement aboutusCommonComponent_Div_Div2_H2;		
		
		@FindBy(xpath="html/body/div[3]/div/div/div/div/div/h1")
		public static WebElement aboutusTitle_ImageCarousel;		
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/h2")
		public static WebElement aboutusCommonComponent_2Divs_H2;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/h1")
		public static WebElement aboutusCommonComponent_2Divs_H1;
				
		@FindBy(xpath="//div[@class='common--component_box']/div/h2")
		public static WebElement aboutusHeaderItemTitleRightTop;
		
		/*@FindBy(xpath="//div[@class='common--component_box']/div/div[1]/div/p")
		public static WebElement aboutusCommonComponent_2Divs_P;*/
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/p")
		public static WebElement aboutusCommonComponent_2Divs_P;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div[2]/p")
		public static WebElement aboutusCommonComponent_Div_Div2_P;		
		
		@FindBy(css="span[class='state_indicator']")
		public static WebElement aboutusShowHideImageLeftPlus;		
		
		@FindBy(css="h3[class='showhide--expandable_header']")
		public static WebElement aboutusShowHideBasicPlus;
		
		@FindBy(xpath="//h3[@class='showhide--expandable_header'][1]")
		public static WebElement aboutusShowHideexpand ; 

		@FindBy(xpath="//div[@class='common--component_box']/div/h2")
		public static WebElement aboutusCommonComponent_Div_H2;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/p")
		public static WebElement aboutusCommonComponent_Div_P;
		
		@FindBy(xpath="html/body/div[7]/div/div/div/div/div/span[2]/p")
		public static WebElement aboutusPageEditorIFrameonRightDescription;
		
		@FindBy(css="span[class='aboutus_listitems--img']")
		public static WebElement aboutusListIcon;
	
		@FindBy(css="div[class='aboutus_listitems--content']")
		public static WebElement aboutusListText;
		
		// Navigation to LogOut on Sitecore
		@FindBy(xpath=".//*[@id='SystemMenu']")
		public static WebElement systemMenu;
		
		@FindBy(xpath="html/body/form/div[6]/table/tbody/tr[8]/td[2]")
		public static WebElement logOut;
		
	// Navigation to Component on Page Editor
		@FindBy(xpath=".//*[@id='C9B8B99F35AE84B29A320DFF191C4E3AB']/div[1]/div[2]/a[1]/span")
		public static WebElement pageEditorMode;
		
		@FindBy(xpath=".//*[@id='PresentationStrip_ribbon_tab']")
		public static WebElement pageEditorPresentation;
		
		@FindBy(xpath="html/body/div[1]/div/div[1]/nav[1]/a[4]/img")
		public static WebElement toggleRibbon;
		
		@FindBy(xpath="//span[text()='Details']")
		public static WebElement pageEditorDetails;	
		
		@FindBy(xpath="html/body/div[1]/div/div[1]/nav[2]/div[1]/div[1]/div//span[text()='Other']")
		public static WebElement pageEditorOtherMenu;
		
		@FindBy(xpath="//span[text()='Preview']")
		public static WebElement pageEditorPreviewMode;

		@FindBy(xpath="//img[@alt='Save changes.']")
		public static WebElement pageEditorSaveButton;
		
		@FindBy(xpath="html/body/div[5]/div[1]/a")
		public static WebElement pageEditorskipImage;

		@FindBy(xpath="//div[@class='common--component_box']/div/div/h3")
		public static WebElement aboutusCommonComponent_2DIVs_H3;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/div/div/h2")
		public static WebElement aboutusCommonComponent_4DIVs_H2;	
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/div/div/h3")
		public static WebElement aboutusCommonComponent_4DIVs_H3;
		
	/*//Side By Side	*/
		@FindBy(xpath="//div[@class='common--component_box']/div/div/h2")
		public static WebElement aboutusCommonComponent_Div_Div_H2;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/div/h3")
		public static WebElement aboutusCommonComponent_3DIVs_H3;
		
		@FindBy(xpath="//div[@class='common--component_box']/div/div/div/p")
		public static WebElement aboutusCommonComponent_3DIVs_P;
		
	//Three Items [Three Columns / Stacked Image Left]
		@FindBy(xpath="//div[@class='common--component_box']/div/h2")
		public static WebElement aboutusThreeItemContainerTitle;		
		
		@FindBy(css="div[class='container_more js--is_open']")
		public static WebElement aboutusThreeItemMoreContainer;
		
		@FindBy(css="a[class='components--more_button']")
		public static WebElement aboutusThreeItemMoreButton;
		
		@FindBy(css="a[class='components--more_button js--is_open']")
		public static WebElement aboutusThreeItemLessButton;
		
		@FindBy(xpath="//div[@class='scChromeToolbar undefined'][2]//a[@title='Edits the link destination and appearance']/img")
		public static WebElement insertLink;
		
		@FindBy(xpath=".//*[@id='External']/a/div")
		public static WebElement externalLink;
		
		@FindBy(xpath=".//*[@id='Text']")
		public static WebElement externalUrlText;
		
		@FindBy(xpath="html/body/form/div[2]/div[2]/div/table/tbody/tr/td[3]/div/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]/input")
		public static WebElement externalUrl;

	// Image Shape for Common Component
		@FindBy(xpath="//div[contains(@class,'common--component ')]")
		public static WebElement commonComponentImageShape;
		
	// Image Shape for Child Component Item		
		@FindBy(xpath="//div[contains(@class,'twoitems_sidebyside_item ')][1]")
		public static WebElement childComponentImageShape;
		
			
	}

