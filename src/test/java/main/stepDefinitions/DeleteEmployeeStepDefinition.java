package main.stepDefinitions;

import core.endPoints.EndPoints;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class DeleteEmployeeStepDefinition {
    @Dado("^Que Administrador inicia el proceso de eliminacion$")
    public void Header() {
        given();
    }

    @Cuando("^Administrador realiza la solicitud de eliminacion con el numero (.*)$")
    public void sendRequestd(String id) {
        when()
                .delete(EndPoints.DELETEEMPLOYEEBYID.getUrl()+id);
    }

    @Entonces("^Administrador debe confirmar la eliminacion del empleado$")
    public void codeChecks() {
        then()
                .statusCode(200)
                .body("status",  equalTo("success"));
    }
}
