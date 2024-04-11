package com.loan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class StudentLoanTest extends BaseClass {

	@Test

	public void studentLoan() throws InterruptedException, AWTException {
		
		//launch the browser
		browserLaunch("https://www.eduf.in");
		//maximize the browser
		maximize();
		//implicit wait for all script
		time();
		
		
		LoginPage login=new LoginPage();
        
		//select language
		buttonClick(login.getLanguage());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//wait some time
		LoadingTime();
		
		//enter the phone number
        inputText(login.getPhoneNo(), "8438638597");
		LoadingTime();
		//click submit button
		buttonClick(login.getSubmit());
		
        //click OTP field box
		buttonClick(login.getOtpField());
		//Enter OTP number manually
		inputText(login.getOtpField(), "");
		
		//wait 30 seconds for enter OTP number
		Thread.sleep(30000);
		LoadingTime();

		//click verify OTP button
		buttonClick(login.getVerifyOTP());
		LoadingTime();

		pageLoadingTime();
		navigate("https://www.eduf.in/clear-lead-fibe");
		LoadingTime();
		navigate("https://www.eduf.in/loan2/17051/student");
		pageLoadingTime();
		
        
		//Student Details
		
		
		//Loan application Details

		
		
	}
}
