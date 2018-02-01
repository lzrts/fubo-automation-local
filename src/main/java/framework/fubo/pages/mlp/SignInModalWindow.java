package framework.fubo.pages.mlp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.base.Function;

import framework.pages.Page;

public class SignInModalWindow extends Page{

	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailSignInField;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordSignInField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signInWithEmailButton;
	
	@FindBy(xpath="//div[@class='signup']/p/a[@href='/signup']")
	private WebElement signUpButton;
	
	@FindBy(xpath="//div[@class='forget-pass']")
	private WebElement forgotPassButton;
	
	
	public SignInModalWindow(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public Function<WebDriver, ?> isPageLoaded() {
		return ExpectedConditions.visibilityOf(signInWithEmailButton);
	}

}
