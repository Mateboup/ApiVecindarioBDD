package co.com.segurossura.certification.soat.tasks;

import static co.com.segurossura.certification.soat.userinterface.SimularFront.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class SimularCreditoFront implements Task {

  public static SimularCreditoFront conLosDatos() {
    return instrumented(SimularCreditoFront.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(BTN_SIMULA),
        Click.on(BTN_SIMULA),
        Enter.theValue("PRUEBA").into(LBL_NOMBRE),
        Enter.theValue("PRUEBA APELLIDO").into(LBL_APELLIDOS),
        Enter.theValue("1111111111").into(LBL_CELULAR),
        Enter.theValue("PRUEBA@TEST.COM").into(LBL_CORREO),
        Click.on(RBD_ACEPTO));

    actor.attemptsTo(Click.on(BTN_PROXIMO_PASO),
            Click.on(BTN_PROXIMO_PASO1));
  }
}
