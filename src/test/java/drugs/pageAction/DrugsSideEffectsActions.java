package drugs.pageAction;

import drugs.pageElements.DrugsSideEffectsPageLocators;
import org.openqa.selenium.support.ui.Select;

public class DrugsSideEffectsActions {
   
    DrugsSideEffectsPageLocators drugsSideEffectsPageLocatorsObj;

    public void searchAdvil() throws Exception {
        drugsSideEffectsPageLocatorsObj.searchBox.sendKeys("Advil");
        Thread.sleep(2000);
        Select dropDownObj = new Select(drugsSideEffectsPageLocatorsObj.searchBox);
        dropDownObj.selectByVisibleText("Advil");
        Thread.sleep(2000);
        drugsSideEffectsPageLocatorsObj.searchBox.click();
    }

    }
    
    // Add more methods to interact with the other web elements in the page.
