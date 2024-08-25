package br.com.desafiosicredi.tests.checkAPI.tests;
import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.checkAPI.requests.GetCheckApiRequests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

public class GetCheckAPItests extends BaseTest {

    GetCheckApiRequests getCheckApiRequests = new GetCheckApiRequests();

    @Test
    @Category({AllTests.class, SmokeTests.class})
    public void validaApiOnline(){
        getCheckApiRequests.checkApi()
               .then()
               .statusCode(200)
               .body("status",equalTo("ok"));

    }



}
