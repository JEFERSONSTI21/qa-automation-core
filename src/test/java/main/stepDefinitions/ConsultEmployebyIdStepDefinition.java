package main.stepDefinitions;

import core.endPoints.EndPoints;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.restassured.http.ContentType;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class ConsultEmployebyIdStepDefinition {
    @Dado("^Que Administrador desea listar datos del empleado$")
    public void Header() {

        given();
    }


    @Cuando("^Administrador realiza la solicitud del empleado (.*)$")
    public void sendRequest(String id) {
        when()
                .get(EndPoints.EMPLOYEEBYID.getUrl()+id);
    }

    @Entonces("^Administrador debe visualizar datos del empleado$")
    public void codeChecks() {
        then()
                .statusCode(200)
                .body("status", equalTo("success"));
    }


}
