package framework.fubo.pages.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.Page;

public class MyAccountProfilePage extends Page{

	@FindBy(xpath="//span[contains(text(),'Visit Help Center')]")
	private WebElement visitHelpCenterButton;
	
	@FindBy(xpath="//span[contains(text(),'edit')]")
	private WebElement editFirstLastNameButton;
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement editFirstNameFild;
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement editLastNameField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveChangesModalButton;
	
	@FindBy(xpath="//span[contains(text(),'change password')]")
	private WebElement changePasswordButton;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement currentPasswordField;
	
	@FindBy(xpath="//input[@name='newPassword']")
	private WebElement newPasswordField;
	
	@FindBy(xpath="//span[contains(text(),'Subscription')]")
	private WebElement subscriptionSectionButton;
	
	public MyAccountProfilePage(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.visibilityOf(editFirstLastNameButton);
	}

}
