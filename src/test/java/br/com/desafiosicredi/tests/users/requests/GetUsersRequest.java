package br.com.desafiosicredi.tests.users.requests;

import br.com.desafiosicredi.base.BaseTest;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class GetUsersRequest extends BaseTest {

    public Response retornaUsersAutenticacao(){

        return    given()
                        .when()
                        .get("users");
    }


}
