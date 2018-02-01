package framework.fubo.pages.mlp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.Page;
import io.qameta.allure.Step;

public class ApplicationsPage extends Page {

	@FindBy(xpath = "//span[contains(text(),'Let’s Get Started')]")
	public WebElement startTrialFooterButtonAppsPage;

	@FindBy(xpath = "//div/a[@href='https://fubotv.zendesk.com/hc' and count(*)=2]")
	public WebElement visitHelpCenterButton;

	@FindBy(xpath = "//a[@id='app-store']")
	public WebElement appStoreButton;

	@FindBy(xpath = "//a[@id='google-play']")
	public WebElement googlePlayButton;

	@FindBy(xpath = "//a[@href='https://www.amazon.com/gp/product/B075XMZMWY/ref=as_li_tl?ie=UTF8&camp=1789&"
			+ "creative=9325&creativeASIN=B075XMZMWY&linkCode=as2&tag=fubotv-20&linkId=e6dbb69d788f88082ca13d4fb6981ed5']")
	public WebElement getRokuButton;

	@FindBy(xpath = "//a[@href='https://www.amazon.com/gp/product/"
			+ "B00ZV9RDKK/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&"
			+ "creativeASIN=B00ZV9RDKK&linkCode=as2&tag=fubotv-20&linkId=fb663c6a7c87257f31d4c05b37b8fa09']")
	public WebElement getFireTvButton;

	@FindBy(xpath = "//a[@href='https://www.amazon.com/gp/product/"
			+ "B075NCMLYL/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&"
			+ "creativeASIN=B075NCMLYL&linkCode=as2&tag=fubotv-20&linkId=8919c9d8cc6d46100a9cffcdda880fd2']")
	public WebElement getAppleTvButton;

	public ApplicationsPage(WebDriver webDriver) {
		super(webDriver);
	}

	@Step("Proceed to Apps page")
	public boolean checkElements() {
		isElementPresent(appStoreButton);
		isElementPresent(getAppleTvButton);
		isElementPresent(getFireTvButton);
		isElementPresent(getRokuButton);
		isElementPresent(googlePlayButton);
		isElementPresent(startTrialFooterButtonAppsPage);
		isElementPresent(visitHelpCenterButton);
		return true;
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.visibilityOf(startTrialFooterButtonAppsPage);
	}

}
