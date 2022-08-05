package co.com.segurossura.certification.soat.stepdefinitions;

import static co.com.segurossura.certification.soat.exceptions.CodigoRespuestaServicioError.CODIGO_RESPUESTA_SERVICIO;
import static co.com.segurossura.certification.soat.exceptions.MsgInvalido.MSG_INVALIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.segurossura.certification.soat.exceptions.CodigoRespuestaServicioError;
import co.com.segurossura.certification.soat.exceptions.MsgInvalido;
import co.com.segurossura.certification.soat.models.builder.ResponseApiSimulator;
import co.com.segurossura.certification.soat.questions.CodigoRespuestaServicio;
import co.com.segurossura.certification.soat.questions.ValidarMsgRespuesta;
import co.com.segurossura.certification.soat.tasks.GetApiSimulator;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import org.apache.http.HttpStatus;

public class SimularApiStepDefinition {

  @Dado("que el cliente quiera cotizar el valor de una propiedad que se acomode a su necesidad")
  public void queElClienteQuieraCotizarElValorDeUnaPropiedadQueSeAcomodeASuNecesidad() {
    System.out.println("Pasa");
  }

  @Cuando("cuando cotice por medio del API {string}")
  public void cuandoCoticePorMedioDelAPI(String url) {
    theActorInTheSpotlight().attemptsTo(GetApiSimulator.conLaData(url));
  }

  @Entonces("debería ver un mensaje con exito {string}")
  public void deberíaVerUnMensajeConExitoOK(String mensajeExito) {
    theActorInTheSpotlight()
        .should(
            seeThat(CodigoRespuestaServicio.obtenido(), equalTo(HttpStatus.SC_OK))
                .orComplainWith(CodigoRespuestaServicioError.class, CODIGO_RESPUESTA_SERVICIO));
    theActorInTheSpotlight()
        .should(
            seeThat(
                    ValidarMsgRespuesta.obtenido(
                        SerenityRest.lastResponse().as(ResponseApiSimulator.class)),
                    equalTo(mensajeExito))
                .orComplainWith(MsgInvalido.class, MSG_INVALIDO));
  }
}
