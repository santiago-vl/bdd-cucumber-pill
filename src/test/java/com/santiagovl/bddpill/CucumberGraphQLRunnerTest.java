package com.santiagovl.bddpill;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber_report_graphql.html"},
    features = "src/test/resources/features",
    tags=" @graphql and @important and not @wip and not @skip",
    glue={"com.santiagovl.bddpill.steps.commons", "com.santiagovl.bddpill.steps.graphql"}
)
public class CucumberGraphQLRunnerTest {

}
