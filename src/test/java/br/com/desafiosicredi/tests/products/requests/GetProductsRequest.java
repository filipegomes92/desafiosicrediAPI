package br.com.desafiosicredi.tests.products.requests;

import br.com.desafiosicredi.base.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetProductsRequest extends BaseTest {


    public Response GetProdutos(){
        return (Response)
                given()
                        .when()
                        .get("products");

    }
}
