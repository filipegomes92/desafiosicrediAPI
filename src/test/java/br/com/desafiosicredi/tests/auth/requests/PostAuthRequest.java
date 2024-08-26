package br.com.desafiosicredi.tests.auth.requests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.tests.auth.payloads.AuthPayloads;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;


public class PostAuthRequest extends BaseTest {

       AuthPayloads authpayloads = new AuthPayloads();
       public Response tokenReturn(String nome, String senha){

        return (Response)
                given()
                    .header("Content-Type","application/json")
                    .when()
                    .body(authpayloads.bodyLoginok(nome,senha).toString())
                    .post("auth/login");
        }


        public String Token(String nome, String senha){
          return tokenReturn(nome,senha)
                .then()
                .statusCode(200)
                .extract()
                .path("token");

        }

}
