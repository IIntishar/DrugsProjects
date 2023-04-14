package drugs.pageAction;

import org.testng.Assert;

import drugs.pageElements.DrugsSideEffectsResultLocators;

public class DrugsSideEffectsResultAction {

	DrugsSideEffectsResultLocators drugsSideEffectsResultLocatorsObj;
		
	public void advilSideEffect() {
		Assert.assertTrue(drugsSideEffectsResultLocatorsObj.sideEffectsInfo.isDisplayed());
	}

}