package framework.fubo.pages.onboarding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.LitsPageFactory;
import framework.pages.Page;
import io.qameta.allure.Step;

public class OnboradingPreselectionPackagePage extends Page {

	@FindBy(xpath = "//div/span[contains(text(),'Continue to Last Step')]")
	private WebElement continueToLastStepButton;

	@Step("Proceed to step #4")
	public OnboardingLastStep onboardingStep4() {

		continueToLastStepButton.click();

		return LitsPageFactory.initElements(webDriver, OnboardingLastStep.class);

	}

	public OnboradingPreselectionPackagePage(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.visibilityOf(continueToLastStepButton);
	}

}
