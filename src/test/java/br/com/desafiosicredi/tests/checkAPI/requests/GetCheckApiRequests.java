package br.com.desafiosicredi.tests.checkAPI.requests;

import br.com.desafiosicredi.base.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetCheckApiRequests extends BaseTest {


    public Response checkApi(){
       return (Response)  given()
                .when()
                .get("test");

    }


}
