package drugs.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import drugs.pageAction.DrugsHomePageActions;

public class DrugsHomePageSteps {

	DrugsHomePageActions DrugsHomePageActionsObj = new DrugsHomePageActions();
	

@Given("^the user is on the drugs\\.com website$")
public void the_user_is_on_the_drugs_com_website() throws Throwable {
	
}
//@When("^the user mouse hovers on \"([^\"]*)\" in the main menu$")
//public void the_user_mouse_hovers_on_in_the_main_menu(String arg1) throws Throwable {
//	DrugsHomePageActionsObj.mouseHoverSideEffect();
//}

@When("^the user click on \"([^\"]*)\" in the main menu$")
public void the_user_click_on_in_the_main_menu(String arg1) throws Throwable {
	DrugsHomePageActionsObj.clickSideEffectsImage();
}


}