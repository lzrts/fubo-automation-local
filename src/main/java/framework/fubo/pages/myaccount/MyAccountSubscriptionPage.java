package framework.fubo.pages.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.Page;

public class MyAccountSubscriptionPage extends Page{

	@FindBy(xpath="//span[contains(text(),'Manage Subscription')]")
	private WebElement manageSubscriptionButton;
	
	@FindBy(xpath="//span[contains(text(),'View Payment History')]")
	private WebElement viewPaymentHistoryButton;
	
	@FindBy(xpath="//span[contains(text(),'Edit Card')]")
	private WebElement editCardButton;
	
	public MyAccountSubscriptionPage(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.invisibilityOf(manageSubscriptionButton);
	}

}
