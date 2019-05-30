package com.poc.serenity.Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/", tags = {"@Test123"}, format = {"json:target/cucumber/report.json"})
public class Runner1 {

}
