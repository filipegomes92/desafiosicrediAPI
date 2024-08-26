package br.com.desafiosicredi.tests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.ContractTest;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.auth.requests.PostAuthRequest;
import br.com.desafiosicredi.utils.Utils;
import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.CoreMatchers.equalTo;


public class PostAuthTest extends BaseTest {

    PostAuthRequest postauthrequest = new PostAuthRequest();

    @Test
    @Category({AllTests.class, SmokeTests.class})
    @Description("Valida retorno do token com sucesso passando usuario e senha validos")
    public void validaSolicitaTokenComSucesso() {
        postauthrequest.tokenReturn("emilys", "emilyspass")
                .then()
                .statusCode(201)
                .body("username", equalTo("emilys")).log();
    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    @Description("Valida erro ao solicitar token passando usuário ou senha inválidos")
    public void validaSolicitaTokeninvalido() {
        postauthrequest.tokenReturn("emilis", "emilispas")
                .then()
                .statusCode(400)
                .body("message", equalTo("Invalid credentials")).log();
    }

    @Test
    @Category({AllTests.class, ContractTest.class, SmokeTests.class})
    @Description("Valida Schema do response da solicitação de token")
    public void validaSchemaToken() {
        postauthrequest.tokenReturn("emilys", "emilyspass")
                .then()
                .statusCode(201)
                .body(matchesJsonSchema(new File(Utils.retornacaminhoschema("auth", "auth"))));
    }
}
