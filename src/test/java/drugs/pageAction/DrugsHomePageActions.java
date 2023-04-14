package drugs.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import drugs.pageElements.DrugsHomePageLocators;
import drugs.utilities.SetupDrivers;

public class DrugsHomePageActions {
   
    DrugsHomePageLocators drugsHomePageLocatorsObj;
    
    public DrugsHomePageActions(){
    	drugsHomePageLocatorsObj = new DrugsHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, drugsHomePageLocatorsObj);
    }
   
//    public void mouseHoverSideEffect() throws Exception {
//        Actions actions = new Actions(SetupDrivers.driver);
//    	actions.moveToElement(drugsHomePageLocatorsObj.sideEffectsImage);
//    	actions.perform();
//    	Thread.sleep(2000);
//    }
    	
    

    
    public void clickSideEffectsImage() throws Exception {
//        if (drugsHomePageLocatorsObj.sideEffectsImage.isEnabled()) {
//            drugsHomePageLocatorsObj.sideEffectsImage.click();
//            Thread.sleep(5000);
//        } else {
//            throw new Exception("Side effects image is not enabled");
//        }
    	
    	drugsHomePageLocatorsObj.sideEffectsImage.click();

    }

    


    
    
    // I Can add more methods to interact with other webelement
}
