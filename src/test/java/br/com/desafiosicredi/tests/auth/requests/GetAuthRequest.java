package br.com.desafiosicredi.tests.auth.requests;

import br.com.desafiosicredi.base.BaseTest;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class GetAuthRequest  extends BaseTest {

    PostAuthRequest postauthrequest = new PostAuthRequest();
    public Response GetProdutoscomToken (String token){
            return(Response)
                    given()
                    .header("Content-Type","application/json")
                    .header("Authorization",token)
                    .get("auth/products");
    }

}
