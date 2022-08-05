package co.com.segurossura.certification.soat.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/simular_api.feature",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    glue = {
      "co.com.segurossura.certification.soat.stepdefinitions",
    })
public class SimularApi {}
