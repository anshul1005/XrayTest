package com.serenity.resAssured;



import com.google.gson.JsonObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;

@RunWith(SerenityRunner.class)
public class TestRestStepDef {

 /*   @Steps
    TestRestAPI tr;

    @Given("^Verifying County Code with (.*)$")
    public void getCountyCode(String api) throws Throwable{
        tr.testApi(api);
    }*/

   @Test
    public void testAPI23(){
        String baseUri = "http://localhost:8080/rest/auth/1/session";

      String par ="details={\"username\":\"test\",\"password\":\"test@123\"} ";


       Response response = SerenityRest.given().auth().preemptive().basic("test","test@123").when().post(baseUri);


//       Js = {"username": ""+username+"", "password": ""+password+""};

       System.out.println(response.getBody().asString());
   }
}
