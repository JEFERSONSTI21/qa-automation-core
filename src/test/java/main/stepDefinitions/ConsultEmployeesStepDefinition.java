package main.stepDefinitions;

import core.endPoints.EndPoints;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.restassured.http.ContentType;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class ConsultEmployeesStepDefinition {
    @Dado("^Que Administrador desea listar los empleados$")
    public void Header() {
        given();
    }


    @Cuando("^Administrador realiza la solicitud$")
    public void sendRequest() {
        when()
                .get(EndPoints.EMPLOYEE.getUrl());
    }

    @Entonces("^Administrador debe visualizar la lista de empleados$")
    public void codeChecks() {
        then()
                .statusCode(200)
                .body("status", equalTo("success"));
    }


}
