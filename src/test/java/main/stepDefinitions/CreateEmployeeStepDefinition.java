package main.stepDefinitions;

import core.endPoints.EndPoints;
import core.utils.Utilities;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.restassured.http.ContentType;
import core.models.LoginObject;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateEmployeeStepDefinition {
    Actor actor;

    @Dado("^El Administrador llena los datos del empleado a crear$")
    public void Header() {
        Utilities utilities = new Utilities();
        LoginObject loginObject = new LoginObject(utilities.GenerateSurnameRandom()+" "+utilities.GenerateSurnameRandom(), utilities.GenerateNumRamdomSalary(),utilities.GenerateNumRamdomAge());
        given()
                .contentType(ContentType.JSON)
                .body(loginObject);
    }

    @Cuando("^Administrador realiza la solicitud de creacion$")
    public void sendRequest() {
        when()
                .post(EndPoints.CREATEEMPLOYEE.getUrl());
    }

    @Entonces("^Administrador debe poder ver resultado de la creacion$")
    public void codeChecks() {
        then()
                .statusCode(200)
                .body("status", equalTo("success"));
    }
}
