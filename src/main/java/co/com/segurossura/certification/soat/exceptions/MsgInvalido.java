package co.com.segurossura.certification.soat.exceptions;

public class MsgInvalido extends AssertionError {

  public static final String MSG_INVALIDO = "El Mensaje esperado no es igual al obtenido";

  public MsgInvalido(String mensaje) {
    super(mensaje);
  }
}
