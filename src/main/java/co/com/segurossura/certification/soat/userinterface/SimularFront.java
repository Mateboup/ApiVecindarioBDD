package co.com.segurossura.certification.soat.userinterface;

import static org.openqa.selenium.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public final class SimularFront {

  public static final Target BTN_SIMULA =
      Target.the("Botón Simula")
          .located(xpath("//*[@id=\"accordion__panel-panel-body73925748\"]/div/div/div[2]/input"));

  public static final Target LBL_NOMBRE =
      Target.the("Nombre")
          .located(
              xpath(
                  "//*[@id=\"simulatorByVecindario\"]/main/div[1]/div[1]/div[2]/div/form/div[1]/label[1]/div/div/input"));

  public static final Target LBL_APELLIDOS =
      Target.the("APELLIDOS")
          .located(
              xpath(
                  "//*[@id=\"simulatorByVecindario\"]/main/div[1]/div[1]/div[2]/div/form/div[1]/label[2]/div/div/input"));

  public static final Target LBL_CELULAR =
      Target.the("CELULAR").located(xpath("//*[@id=\"mobile\"]"));
  public static final Target LBL_CORREO =
      Target.the("CORREO")
          .located(
              xpath(
                  "//*[@id=\"simulatorByVecindario\"]/main/div[1]/div[1]/div[2]/div/form/div[1]/label[4]/div/div/input"));

  public static final Target RBD_ACEPTO =
      Target.the("TERMINOS Y CONDICIONES")
          .located(
              xpath(
                  "//*[@id=\"simulatorByVecindario\"]/main/div[1]/div[1]/div[2]/div/form/div[1]/div[3]/label/div[1]/div/input"));

  public static final Target BTN_PROXIMO_PASO =
      Target.the("PROXIMO PASO").located(xpath("//*[@id=\"download-simulation\"]/span"));
  public static final Target BTN_PROXIMO_PASO1 =
      Target.the("PROXIMO PASO")
          .located(xpath("//*[@id=\"simulatorByVecindario\"]/main/div[1]/div[2]/button[1]"));

  private SimularFront() {}
}
