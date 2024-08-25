package br.com.desafiosicredi.tests.users.tests;
import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.users.requests.GetUsersRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.*;

public class GetUsersTest extends BaseTest {

    GetUsersRequest getUsersRequest = new GetUsersRequest();

    @Test
    @Category({AllTests.class, SmokeTests.class, AcceptanceTests.class})
    public void listarUsuarios(){

        getUsersRequest.retornaUsersAutenticacao()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }

}
