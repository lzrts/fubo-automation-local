package framework.fubo.pages.onboarding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.Page;

public class SportsHomePage extends Page{

	@FindBy(xpath="//*[@id='root']")
	public WebElement page;
	
	@FindBy(xpath="//div[@class='wristbands-wrapper']")
	public WebElement wristBand;
	
	
	public SportsHomePage(WebDriver webDriver) {
		super(webDriver);
		
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		
		return ExpectedConditions.visibilityOf(wristBand);
	}

}
