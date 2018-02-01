package framework.fubo.pages.mlp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Function;

import framework.pages.Page;

public class ChannelsPage extends Page{

	@FindBy(xpath = "//a[@href='/welcome/channels' and @class='active link']")
	private WebElement headerChannelsButton;
	
	@FindBy(xpath = "//div[@class='start-free-trial-button']")
	private WebElement startTrialButtonChannelsPage;
	
	@FindBy(xpath = "//div[contains(@class,'help')]")
	private WebElement headerHelpButton;
	
	@FindBy(xpath = "//div[contains(@class,'header-wrap')]/div/*[2]/*[3]//a")
	private WebElement headerAppsButton;
	
	@FindBy(xpath = "//div[@class='login-button']//button")
	private WebElement signInButton;
	
	@FindBy(xpath = "//span[contains(text(),'Let’s Get Started')]")
	private WebElement startTrialFooterButtonChannelsPage;
	
	@FindBy(xpath = "//div/a[@href='https://fubotv.zendesk.com/hc' and count(*)=2]")
	private WebElement visitHelpCentrButton;
	
	
	
	public ChannelsPage(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return null;
	}

}
