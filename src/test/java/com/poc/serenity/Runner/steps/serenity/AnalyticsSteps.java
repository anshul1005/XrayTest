package com.poc.serenity.Runner.steps.serenity;

import com.poc.serenity.Runner.pages.AnalyticsDashboardPage;
import com.jayway.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * Created by asiqa on 10/11/2016.
 */
public class AnalyticsSteps extends ScenarioSteps {


    AnalyticsDashboardPage AnalyticsDashboardPage;

    private String ISO_CODE_SEARCH = "http://restapi.demoqa.com/utilities/weather/city/delhi";

    public void launch_query(String userName, String pass) {
        System.out.println("Launching Query !!");
        System.out.println("printing name :" + userName + ", pass : "+pass );
        Response response = SerenityRest.when().get(ISO_CODE_SEARCH);
        System.out.println(response.getBody().asString());
    }

    @Step
    public void launch_url(String url) {
        System.out.println("lauching URL here");
        AnalyticsDashboardPage.openAt(url);
        waitABit(1000);
    }

    @Step
    public void searchingWord(String searchingWord) {
        AnalyticsDashboardPage.searchingOnpage(searchingWord);
    }
}