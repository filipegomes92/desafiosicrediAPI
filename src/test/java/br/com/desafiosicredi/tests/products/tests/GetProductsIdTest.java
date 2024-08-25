package br.com.desafiosicredi.tests.products.tests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.products.requests.GetProductsIdrequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.equalTo;


public class GetProductsIdTest extends BaseTest {

    GetProductsIdrequest getproductsidrequest = new GetProductsIdrequest();

    @Test
    @Category({AllTests.class, SmokeTests.class})
    public void validaGetProdutosIdExistente(){
        getproductsidrequest.GetProdutoid(1)
                .then()
                .statusCode(200)
                .body("id",equalTo(1));

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaGetProdutosIdInexistente(){
        int id = 20000;
        getproductsidrequest.GetProdutoid(id)
                .then()
                .statusCode(404)
                .body("message",equalTo("Product with id '"+id+"' not found"));

    }






}
