package br.com.desafiosicredi.tests.auth.tests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.ContratoTest;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.auth.requests.GetAuthRequest;
import br.com.desafiosicredi.tests.auth.requests.PostAuthRequest;
import br.com.desafiosicredi.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class GetAuthTest extends BaseTest {
        GetAuthRequest getauthrequest = new GetAuthRequest();
        PostAuthRequest posauthrequest = new PostAuthRequest();
        @Test
        @Category({AllTests.class, SmokeTests.class})
        public void ValidaGetAuthprodutosOK(){

            getauthrequest.GetProdutoscomToken(posauthrequest.Token("emilys","emilyspass"))
                    .then()
                    .statusCode(200)
                    .body("size()", greaterThan(0));
        }

        @Test
        @Category({AllTests.class, AcceptanceTests.class})
        public void ValidaGetProdutosTokenInvalido(){
            getauthrequest.GetProdutoscomToken("Testinvalid")
                    .then()
                    .statusCode(401)
                    .body("message",equalTo("Invalid/Expired Token!"));
        }

        @Test
        @Category({AllTests.class, SmokeTests.class, AcceptanceTests.class})
        public  void ValidaGGetProdutosacessoTipoUser(){
             getauthrequest.GetProdutoscomToken(posauthrequest.Token("abigailr","abigailrpass"))
                     .then()
                     .statusCode(403)
                     .body("message", equalTo("Authentication Problem"));
        }



}
