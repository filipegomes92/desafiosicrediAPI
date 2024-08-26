package br.com.desafiosicredi.tests;
import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.checkAPI.requests.GetCheckApiRequests;
import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.*;

public class GetCheckAPITest extends BaseTest {

    GetCheckApiRequests getCheckApiRequests = new GetCheckApiRequests();

    @Test
    @Category({AllTests.class, SmokeTests.class})
    @Description("Valida se Api está online")
    public void validaApiOnline(){
        getCheckApiRequests.checkApi()
               .then()
               .statusCode(200)
               .body("status",equalTo("ok"));
    }
}
