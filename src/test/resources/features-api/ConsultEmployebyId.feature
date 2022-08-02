# language: es

@Cucumber @Caso2
Característica: Informe de empleado en especifico

  Esquema del escenario: Consulta empleado en especifico
    Dado Que Administrador desea listar datos del empleado
    Cuando Administrador realiza la solicitud del empleado <id>
    Entonces Administrador debe visualizar datos del empleado

    Ejemplos:
      | id         |
      | 1          |
