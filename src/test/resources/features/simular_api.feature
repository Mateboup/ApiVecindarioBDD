#language: es

Característica: Simular Api
  Yo como usuario
  Quiero probar el Api Vecindario
  Para visualizar un mensaje de exito.

  Antecedentes:
  Dado que el cliente quiera cotizar el valor de una propiedad que se acomode a su necesidad
  Cuando cuando cotice por medio del API "https://prod.api.simula.vecindario.com/"


  Escenario: Validar servicio de API SIMULADOR
    Entonces debería ver un mensaje con exito 'OK!'

  Escenario: Validar error en el mensaje esperado
    Entonces debería ver un mensaje con exito 'NO-OK!'

