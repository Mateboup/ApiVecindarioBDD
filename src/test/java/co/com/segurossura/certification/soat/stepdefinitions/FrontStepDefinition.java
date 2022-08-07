package co.com.segurossura.certification.soat.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.segurossura.certification.soat.tasks.SimularCreditoFront;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

public class FrontStepDefinition {

  @Dado("que el cliente ingrese a simular la compra de su inmueble")
  public void queElClienteIngreseASimularLaCompraDeSuInmueble() {
    theActorInTheSpotlight().attemptsTo(SimularCreditoFront.conLosDatos());
  }

  @Cuando("cuando llene la información necesario par la simulación")
  public void cuandoLleneLaInformaciónNecesarioParLaSimulación() {}
}
