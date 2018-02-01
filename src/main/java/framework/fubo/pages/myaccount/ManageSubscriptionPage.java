package framework.fubo.pages.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Function;

import framework.pages.Page;

public class ManageSubscriptionPage extends Page{

	@FindBy(xpath="//a[@href='/account']")
	private WebElement backToMyAccButton;
	
	@FindBy(xpath="//span[@class='edit']")
	private WebElement editPostalCodeButton;
	
	
	
	public ManageSubscriptionPage(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return null;
	}

}
