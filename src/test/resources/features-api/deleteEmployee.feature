# language: es

@Cucumber @Caso3
Característica: Proceso de eliminacion de empleado

  Esquema del escenario: Se realiza proceso de eliminacion
    Dado Que Administrador inicia el proceso de eliminacion
    Cuando Administrador realiza la solicitud de eliminacion con el numero <id>
    Entonces Administrador debe confirmar la eliminacion del empleado

    Ejemplos:
      | id         |
      | 1          |