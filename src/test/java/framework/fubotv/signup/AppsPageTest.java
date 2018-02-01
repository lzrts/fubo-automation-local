package framework.fubotv.signup;

import framework.fubo.pages.mlp.ApplicationsPage;
import framework.fubo.pages.mlp.MarketingLandingPage;
import framework.fubotv.testcase.TestBaseFubo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppsPageTest extends TestBaseFubo {

	@Test
	public void appsPageElements_C40() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		Assert.assertEquals(aplicationsPage.checkElements(), true);
	}

	@Test
	public void signInLinkTest_C51() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.startTrialFooterButtonAppsPage.click();
		Assert.assertEquals(webDriver.getCurrentUrl(), "https://qa.fubo.tv/signup");
	}

	@Test
	public void rokuDeviceLinkTest_C45() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.getRokuButton.click();
		aplicationsPage.switchToTab();
		Assert.assertEquals(webDriver.getTitle().contains("Roku"), true);
	}

	@Test
	public void appleTvDeviceLinkTest_C46() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.getAppleTvButton.click();
		aplicationsPage.switchToTab();
		Assert.assertEquals(webDriver.getTitle().contains("Apple"), true);
	}

	@Test
	public void fireTvDeviceLinkTest_C47() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.getFireTvButton.click();
		aplicationsPage.switchToTab();
		Assert.assertEquals(webDriver.getTitle().contains("Fire TV"), true);
	}

	@Test
	public void appStoreLinkTest_C48() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.appStoreButton.click();
		aplicationsPage.switchToTab();
		Assert.assertEquals(webDriver.getTitle().contains("fuboTV:"), true);
	}

	@Test
	public void googlePlayLinkTest_C49() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.googlePlayButton.click();
		aplicationsPage.switchToTab();
		Assert.assertEquals(webDriver.getTitle().contains("fuboTV"), true);
	}

	@Test
	public void helpButtonLinkTest_C50() {
		MarketingLandingPage marketingLandingPage = spoofingModal.setSpoofing("USA", "10044", "", "");
		ApplicationsPage aplicationsPage = marketingLandingPage.openAppsPage();
		aplicationsPage.visitHelpCenterButton.click();
		aplicationsPage.switchToTab();
		Assert.assertEquals(webDriver.getTitle().contains("Help Center"), true);
	}

}
