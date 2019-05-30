package com.poc.serenity.Runner.steps;

import com.serenity.resAssured.TestRestAPI;
import cucumber.api.java.en.Given;
import com.poc.serenity.Runner.steps.serenity.AnalyticsSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by PD on 10/10/2016.
 */

public class AnayticsToolStepsDef {

   // @net.thucydides.core.annotations.Steps
    @Steps
    AnalyticsSteps analyticsSteps;
    @Steps
    TestRestAPI tr;

    @Given("^As a user, I launch URL (.*),(.*)$")
    public void launchURL(String userName, String pass) throws Throwable {
        analyticsSteps.launch_query(userName, pass);
    }

    @Given("^I launch URL with (.*)$")
    public void ilaunchURL(String url) throws Throwable {
        analyticsSteps.launch_url(url);
    }

    @When("^I enter word (.*)$")
    public void searchingword(String searchingWord)throws Throwable{
        analyticsSteps.searchingWord(searchingWord);
    }

    @Given("^Verifying County Code with (.*)$")
    public void getCountyCode(String api) throws Throwable{
        tr.testApi(api);
    }
}