package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page.TestPage2;
import utill.BrowserFactory2;

public class LoginTest2 {
WebDriver driver;
TestPage2 testpage;
@Test
public void validPage() {
driver = BrowserFactory2.init();
testpage = PageFactory.initElements(driver, TestPage2.class);	

//1. Test// Validate a user is able to add a category and once the category is added it should display.
testpage.addCategory("Manual");
testpage.clickAddCategory();
testpage.addCategory("Automation");
testpage.clickAddCategory();

//2. Test// duplicated category name
//testpage.addCategory("Manual");
//testpage.clickAddCategory();

//3. Test//Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.

//testpage.monthDropDown();	


}
}