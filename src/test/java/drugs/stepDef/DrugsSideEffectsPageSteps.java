package drugs.stepDef;

import cucumber.api.java.en.When;
import drugs.pageAction.DrugsSideEffectsActions;

public class DrugsSideEffectsPageSteps {
	
	DrugsSideEffectsActions drugsSideEffectsActionsObj = new DrugsSideEffectsActions();
	
	@When("^the user clicks on the search button$")
	public void the_user_clicks_on_the_search_button() throws Throwable {
		drugsSideEffectsActionsObj.searchAdvil();
	}

	@When("^Select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
		drugsSideEffectsActionsObj.searchAdvil();
	}
}
