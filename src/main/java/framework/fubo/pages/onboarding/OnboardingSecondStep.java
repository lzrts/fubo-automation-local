package framework.fubo.pages.onboarding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.LitsPageFactory;
import framework.pages.Page;
import io.qameta.allure.Step;

public class OnboardingSecondStep extends Page {

	@FindBy(xpath = "//div/span[contains(text(),'Go to Next Step')]")
	public WebElement goToNextStepButton;

	@Step("Proceed to step #3")
	public OnboardingThirdStep onboardingStep3() {

		goToNextStepButton.click();

		return LitsPageFactory.initElements(webDriver, OnboardingThirdStep.class);

	}

	public OnboardingSecondStep(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.visibilityOf(goToNextStepButton);
	}

}
