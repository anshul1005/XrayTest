package com.poc.serenity.Runner.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AnalyticsDashboardPage extends PageObject  {

	String searchEventCount,legacy_hr,legacy_login;
	int index = 13;
	static int i=0;
	
	@FindBy(how = How.ID, using = "emailId")
	public WebElementFacade txtUsername;


	public void login(String username, String password) {

	}

    public void searchingOnpage(String searchingWord) {
		typeInto($("//input[@name='q']"),searchingWord);
		System.out.println("searching successully with : " +searchingWord);
    }

	public void launchingurl(String url) {
		openAt(url);
		System.out.println("launched url successfully with : " +url);
	}
}

