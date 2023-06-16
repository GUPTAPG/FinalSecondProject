package page;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;



public class TestPage2 {
WebDriver driver;
public TestPage2 (WebDriver driver) {
	this.driver= driver;
}

@FindBy(how = How.CSS,using ="input[name='categorydata']")WebElement ADD_CATEGORY_ELEMENT;
@FindBy(how = How.CSS,using ="input[value ='Add category']")WebElement CLICK_ADD_CATEGORY_ELEMENT;

@FindBy(how = How.CSS,using ="select[ name='due_month']")WebElement MONTH_DROPDOWN_ELEMENT;


public void addCategory(String category) {
	ADD_CATEGORY_ELEMENT.sendKeys(category);
}
public void clickAddCategory() {
	CLICK_ADD_CATEGORY_ELEMENT.click();
}
public void monthDropDown() {
Select sel = new Select(MONTH_DROPDOWN_ELEMENT);
//sel.selectByVisibleText("Mar");
List<WebElement> options = sel.getOptions();
for(int i=0; i< options.size(); i++) {
	MONTH_DROPDOWN_ELEMENT.click();
	WebElement element = options.get(i);

String innerhtml =	element.getAttribute("innerHTML");
System.out.println("values from the dropdown= "+innerhtml);
}



}
}