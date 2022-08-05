package co.com.segurossura.certification.soat.questions;

import co.com.segurossura.certification.soat.models.builder.ResponseApiSimulator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarMsgRespuesta implements Question<String> {

  private final ResponseApiSimulator responseApiSimulator;

  public ValidarMsgRespuesta(ResponseApiSimulator responseApiSimulator) {

    this.responseApiSimulator = responseApiSimulator;
  }

  public static ValidarMsgRespuesta obtenido(ResponseApiSimulator responseGetPhoto) {
    return new ValidarMsgRespuesta(responseGetPhoto);
  }

  @Override
  public String answeredBy(Actor actor) {

    return responseApiSimulator.getMsg();
  }
}
