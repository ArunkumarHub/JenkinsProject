package fotf_Datasource;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import fotf_Config.AboutusCommonClass;
import fotf_Config.Basedriver;
import fotf_Operations.Opr_ContentEditor_AboutUs;
import fotf_Operations.Opr_PageEditor_AboutUs;
import fotf_Operations.Opr_Sitecore_AboutUs;

public class Opr_Sitecore_CustomInitiativeDatasource extends Basedriver{
	public static String dataSourcePath="";
	static Hashtable hashTable = new Hashtable();
	private static void SetDefaultValueToHashTable(){
		hashTable.clear();		
		hashTable.put("TitleText", false);
		hashTable.put("ItemText", false);
	    hashTable.put("Image", false);
	   }    
    
	public static void CustomInitiativeComponentDatasource(String renderingDatasource) throws InterruptedException{	    
		SetDefaultValueToHashTable();
		switch(renderingDatasource)
		{			
			case "CustomInitiativeComponent":
				hashTable.replace("TitleText", true);
				hashTable.replace("ItemText", true);
				hashTable.replace("Image", true);
			break;
			//case "PageComponentHeader": break;			
			default:
				break;			
		}		
		Opr_AboutUsDataSource_DataProvider.CustomInitiativeComponentDataSource(renderingDatasource, hashTable);
	}
}
