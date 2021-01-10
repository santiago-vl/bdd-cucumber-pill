package com.santiagovl.bddpill;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber_report.html"},
    features = "src/test/resources",
    tags=" @important and not @wip and not @skip"
)
public class CucumberRunnerTest {

}
