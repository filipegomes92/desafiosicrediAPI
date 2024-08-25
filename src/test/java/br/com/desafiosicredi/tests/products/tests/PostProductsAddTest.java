package br.com.desafiosicredi.tests.products.tests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.ContratoTest;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.products.requests.PostProductsAddRequest;
import br.com.desafiosicredi.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;


public class PostProductsAddTest extends BaseTest {

    PostProductsAddRequest postproductsaddrequest = new PostProductsAddRequest();

    @Test
    @Category({AllTests.class, SmokeTests.class, AcceptanceTests.class})
    public void validaAdicionarProduto(){

              postproductsaddrequest.AdicionarProdutos()
                .then()
                .statusCode(201)
                .body("size()",greaterThan(0));

    }

    @Test
    @Category({AllTests.class, ContratoTest.class, AcceptanceTests.class})
    public void validaSchemaAddProduto(){

             postproductsaddrequest.AdicionarProdutos()
                .then()
                .statusCode(201)
                .body(matchesJsonSchema(new File(Utils.retornacaminhoschema("products","addproduct"))));

    }

}
