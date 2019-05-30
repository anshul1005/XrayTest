package com.serenity.resAssured;


/*import io.restassured.http.Method;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Methods;
import net.thucydides.core.annotations.Step;*/


//import io.restassured.response.Response;
import com.jayway.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(SerenityRunner.class)
public class TestRestAPI {

//    private String baseUri = "http://restapi.demoqa.com/utilities/weather/citydelhi";
    private String ISO_CODE_SEARCH = "http://restapi.demoqa.com/utilities/weather/city/delhi";



    @Step
    public void testApi(String api){
        System.out.println("Launching the country code api");
        Response response =  SerenityRest.when().get(api);
        System.out.println("res : "+ response.getBody().asString());
    }

}
