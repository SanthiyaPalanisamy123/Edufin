package com.loan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardDetailsPage extends BaseClass{
	public DashboardDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class=' css-19bb58m']")
	private WebElement EducationalLoan;

	public WebElement getEducationalLoan() {
		return EducationalLoan;
	}
	
	
	
}
