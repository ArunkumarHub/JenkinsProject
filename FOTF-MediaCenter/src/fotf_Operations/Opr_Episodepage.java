package fotf_Operations;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;

import fotf_Config.Basedriver;

public class Opr_Episodepage extends Basedriver{
	
	@BeforeMethod
	public static void baseUrl(){
		Driver.get(baseFotfUrl);
	}
	
	public static void longLoadSearchEpisode(){
		episodeObj.episodeSearchTextBox.sendKeys(expectedData.getProperty("episodeText"));
		Driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		long start = System.currentTimeMillis();
		
		String urlText=episodeObj.pastEpisodeTitle.getText();
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		long seconds=totalTime/1000;
		
		log.info("Total Time for searching the episode item - "+seconds+" Seconds for "+urlText);
		
		if(seconds<=10){
			log.info("The Searching for episodes has taken 10 seconds correctly");
		}
		else{
			log.error("The Searching for episodes has taken longer than 10 seconds");
		}
	}
}
