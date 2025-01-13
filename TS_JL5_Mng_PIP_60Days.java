package com.infosys.icount.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.infosys.icount.pages.ILJL5_Mng_PIP_60Days;
import com.infosys.icount.pages.LoginPage;
import com.infosys.icount.pages.TestBase;

public class TS_JL5_Mng_PIP_60Days extends TestBase{
          
 LoginPage loginPage;
 
	
    ILJL5_Mng_PIP_60Days Mng_60days;
	
	@Test
	public void initializePageFactory() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		Mng_60days = PageFactory.initElements(driver, ILJL5_Mng_PIP_60Days.class);
		
	}
	
	@Test
	public void loginToICount() throws Exception {
		loginPage.loginICount();
	}
	
	@Test
	public void Myteam() throws Exception {
		Mng_60days.Myteam();
	}
	
	@Test
	public void pipTabNegative() throws Exception {
		Mng_60days.pipTabNegative();
	} 
	@Test
	public void PIPpositivetest() throws Exception {
		Mng_60days.PIPpositivetest();
	}
//	@Test
//	public void finalTest() throws Exception {
//		Mng_60days.finalTest();
//	}
	
}

	

