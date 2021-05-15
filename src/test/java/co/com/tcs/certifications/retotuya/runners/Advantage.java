package co.com.tcs.certifications.retotuya.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/advantage.feature",
        glue = "co.com.tcs.certifications.retotuya.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Advantage {
    private Advantage(){
    }
}
