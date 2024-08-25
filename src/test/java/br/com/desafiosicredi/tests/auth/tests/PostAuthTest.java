package br.com.desafiosicredi.tests.auth.tests;
import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.ContratoTest;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.auth.requests.PostAuthRequest;
import br.com.desafiosicredi.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.CoreMatchers.equalTo;


public class PostAuthTest extends BaseTest {

        PostAuthRequest postauthrequest = new PostAuthRequest();

        @Test
        @Category({AllTests.class, SmokeTests.class })
        public void validaSolicitaTokenComSucesso(){
                  postauthrequest.tokenReturn("emilys","emilyspass")
                    .then()
                    .statusCode(201)
                    .body("username",equalTo("emilys")).log();
        }

        @Test
        @Category({AllTests.class, AcceptanceTests.class})
        public void ValidaSolicitaTokeninválido(){

                  postauthrequest.tokenReturn("emilis","emilispas")
                    .then()
                    .statusCode(400)
                    .body("message",equalTo("Invalid credentials")).log();

        }

        @Test
        @Category({AllTests.class, ContratoTest.class, SmokeTests.class})
        public void ValidaSchemaToken(){
                postauthrequest.tokenReturn("emilys","emilyspass")
                        .then()
                        .statusCode(200)
                        .body(matchesJsonSchema(new File(Utils.retornacaminhoschema("auth","auth"))));

        }



}
