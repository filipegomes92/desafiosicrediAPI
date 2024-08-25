package br.com.desafiosicredi.tests.products.tests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.products.requests.GetProductsRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class GetProductsTest extends BaseTest {

    GetProductsRequest getproductsrequest = new GetProductsRequest();

    @Test
    @Category({AllTests.class, SmokeTests.class})
    public void validaGetProdutos(){
        getproductsrequest.GetProdutos()
                .then()
                .statusCode(200)
                .body("size()",greaterThan(0));

    }
}
