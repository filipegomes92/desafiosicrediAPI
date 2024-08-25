package br.com.desafiosicredi.tests.products.requests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.tests.products.requests.payloads.ProductsPayloads;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostProductsAddRequest extends BaseTest {

    ProductsPayloads productspayloads = new ProductsPayloads();
    public Response AdicionarProdutos(){
        return (Response)
                given()
                    .header("Content-Type","application/json")
                    .body(productspayloads)
                    .post("products/add");
    }
}
