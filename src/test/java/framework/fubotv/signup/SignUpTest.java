package framework.fubotv.signup;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.fubo.pages.mlp.MarketingLandingPage;
import framework.fubo.pages.mlp.SignUpPage;
import framework.fubo.pages.onboarding.OnboardingFirstStep;
import framework.fubo.pages.onboarding.OnboardingLastStep;
import framework.fubo.pages.onboarding.OnboradingPreselectionPackagePage;
import framework.fubo.pages.onboarding.SportsHomePage;
import framework.fubotv.testcase.TestBaseFubo;

public class SignUpTest extends TestBaseFubo{
	
	@Test
	public void SignUpTest() throws InterruptedException {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		SignUpPage signUpPage = marketingLandingPage.openSignUpPage();
		OnboardingFirstStep onboardingFirstStep = signUpPage.signUpStart();
		//OnboardingSecondStep onboardingSecondStep = onboardingFirstStep.onboardingStep2("test1234", "Auto", "Test");
		OnboradingPreselectionPackagePage onboradingPreselectionPackagePage = 
				onboardingFirstStep.onboardingPreselection("test1234", "Auto", "Test");
		OnboardingLastStep onboardingLastStep = onboradingPreselectionPackagePage.onboardingStep4();
		SportsHomePage homeSportPage = onboardingLastStep.finishOfTheRegistration("Auto", "Test", "4111111111111111",
				"123", "02", "2020", "12345");
		//webDriver.wait(4);
		
		Assert.assertEquals(homeSportPage.getPageUrl(), "https://qa.fubo.tv/");
	}

}
