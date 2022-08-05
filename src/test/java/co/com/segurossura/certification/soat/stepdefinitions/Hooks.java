package co.com.segurossura.certification.soat.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.Before;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;

public class Hooks {
  String urlBase;

  @Before(order = 0)
  public void configurarUrlBase() {
    final String RUTA_URL = "restapi.baseurl";
    EnvironmentVariables environmentVariables =
        Injectors.getInjector().getInstance(EnvironmentVariables.class);
    urlBase = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(RUTA_URL);
  }

  @Before(order = 1)
  public void configurarActor() {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("Dahia").whoCan(CallAnApi.at(urlBase));
  }
}
