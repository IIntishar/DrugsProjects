package drugs.stepDef;

import cucumber.api.java.en.Then;
import drugs.pageAction.DrugsSideEffectsResultAction;

public class DrugsSideEffectsResultPageSteps {
	DrugsSideEffectsResultAction drugsSideEffectsResultActionsObj = new DrugsSideEffectsResultAction();

	@Then("^the user should see information about drug side effects on Advil only$")
	public void the_user_should_see_information_about_drug_side_effects_on_Advil_only() throws Throwable {
		drugsSideEffectsResultActionsObj.advilSideEffect();
	}}