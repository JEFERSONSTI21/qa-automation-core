# language: es

@Cucumber @Caso1
Característica: Proceso creacion empleado

  Escenario: scenario: Se realiza la creacion de un empleado

    Dado El Administrador llena los datos del empleado a crear
    Cuando Administrador realiza la solicitud de creacion
    Entonces Administrador debe poder ver resultado de la creacion


