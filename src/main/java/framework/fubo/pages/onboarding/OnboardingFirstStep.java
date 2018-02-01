package framework.fubo.pages.onboarding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.LitsPageFactory;
import framework.pages.Page;
import io.qameta.allure.Step;

public class OnboardingFirstStep extends Page{

	@FindBy(xpath="//button[@type='submit']")
	public WebElement selectPackageButton;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement firstNameField;
	
	@Step("Proceed to step #2")
	public OnboardingSecondStep onboardingStep2(String password, String firstName, String lastName) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		passwordField.sendKeys(password);
		selectPackageButton.click();
		
		return LitsPageFactory.initElements(webDriver, OnboardingSecondStep.class);
		
	}
	
	@Step("Proceed to step #2")
	public OnboradingPreselectionPackagePage onboardingPreselection(String password, String firstName, String lastName) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		passwordField.sendKeys(password);
		selectPackageButton.click();
		
		return LitsPageFactory.initElements(webDriver, OnboradingPreselectionPackagePage.class);
		
	}
	
	public OnboardingFirstStep(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.visibilityOf(selectPackageButton);
	}

}
