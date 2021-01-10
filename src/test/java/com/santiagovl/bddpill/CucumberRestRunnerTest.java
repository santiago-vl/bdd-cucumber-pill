package com.santiagovl.bddpill;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber_report_rest.html"},
    features = "src/test/resources/features",
    tags="@rest and @important and not @wip and not @skip",
    glue={"com.santiagovl.bddpill.steps.commons", "com.santiagovl.bddpill.steps.rest"}
)
public class CucumberRestRunnerTest {

}
