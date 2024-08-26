package br.com.desafiosicredi.tests;

import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.products.requests.GetProductsRequest;
import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class GetProductsTest extends BaseTest {

    GetProductsRequest getproductsrequest = new GetProductsRequest();

    @Test
    @Category({AllTests.class, SmokeTests.class})
    @Description("Valida busca de produto passando por parâmetro um id válido")
    public void validaGetProdutosIdExistente(){
        getproductsrequest.GetProdutoid(1)
                .then()
                .statusCode(200)
                .body("id",equalTo(1));
    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    @Description("Valida erro na busca de produto passando parametro id inválido")
    public void validaGetProdutosIdInexistente(){
        int id = 20000;
        getproductsrequest.GetProdutoid(id)
                .then()
                .statusCode(404)
                .body("message",equalTo("Product with id '"+id+"' not found"));
    }

    @Test
    @Category({AllTests.class, SmokeTests.class})
    @Description("Valida busca de todos os produtos com sucesso")
    public void validaGetProdutos(){
        getproductsrequest.GetProdutos()
                .then()
                .statusCode(200)
                .body("size()",greaterThan(0));
    }
}
