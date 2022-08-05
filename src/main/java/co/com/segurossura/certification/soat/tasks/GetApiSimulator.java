package co.com.segurossura.certification.soat.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetApiSimulator implements Task {

  private final String url;

  public GetApiSimulator(String url) {
    this.url = url;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Get.resource(url));
    SerenityRest.lastResponse().body().prettyPrint();
  }

  public static GetApiSimulator conLaData(String idBook) {

    return instrumented(GetApiSimulator.class, idBook);
  }
}
