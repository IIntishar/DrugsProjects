package drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSideEffectsResultLocators {

	@FindBy(xpath="//h1[contains(text(), 'Advil Side Effects')]")
		public WebElement sideEffectsInfo;
}
