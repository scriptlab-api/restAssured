package StepDefinition;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class HealthCheckSteps {

    Response response;

    @Given("the API endpoint is available")
    public void setBaseUri() {

        baseURI = "https://www.google.com";

    }

    @When("I send a GET request to {string}")
    public void sendGetRequest(String endpoint) {

        response = given()
                .when()
                .get(endpoint);

        System.out.println("Response Code: " + response.getStatusCode());

    }

    @Then("the response status should be {int}")
    public void validateStatus(int expectedStatus) {

        int actualStatus = response.getStatusCode();

        assertEquals(expectedStatus, actualStatus);

    }
}