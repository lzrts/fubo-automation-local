package framework.fubo.pages.mlp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.fubo.pages.onboarding.OnboardingFirstStep;
import framework.pages.LitsPageFactory;
import framework.pages.Page;
import io.qameta.allure.Step;

public class SignUpPage extends Page {

	@FindBy(xpath="//*[@name='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signUpButton;
	
	@Step("Send email")
	public OnboardingFirstStep signUpStart() {
		
		emailField.sendKeys(emailGeneration());
		signUpButton.click();
		
		return LitsPageFactory.initElements(webDriver, OnboardingFirstStep.class);
	}
	
	
	public SignUpPage(WebDriver webDriver) {
		super(webDriver);

	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		
		return ExpectedConditions.visibilityOf(signUpButton);
	}

}
