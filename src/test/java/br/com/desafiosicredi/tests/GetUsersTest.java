package br.com.desafiosicredi.tests;
import br.com.desafiosicredi.base.BaseTest;
import br.com.desafiosicredi.suites.AcceptanceTests;
import br.com.desafiosicredi.suites.AllTests;
import br.com.desafiosicredi.suites.SmokeTests;
import br.com.desafiosicredi.tests.users.requests.GetUsersRequest;
import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.hamcrest.Matchers.*;

public class GetUsersTest extends BaseTest {
    GetUsersRequest getUsersRequest = new GetUsersRequest();

    @Test
    @Category({AllTests.class, SmokeTests.class, AcceptanceTests.class})
    @Description("Valida busca de usuários")
    public void getlistarUsuarios(){
        getUsersRequest.getRetornaUsersAutenticacao()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}
