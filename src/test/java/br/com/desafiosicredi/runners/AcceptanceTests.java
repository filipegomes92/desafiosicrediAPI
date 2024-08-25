package br.com.desafiosicredi.runners;

import br.com.desafiosicredi.tests.auth.tests.GetAuthTest;
import br.com.desafiosicredi.tests.auth.tests.PostAuthTest;
import br.com.desafiosicredi.tests.checkAPI.tests.GetCheckAPItests;
import br.com.desafiosicredi.tests.products.tests.GetProductsIdTest;
import br.com.desafiosicredi.tests.products.tests.GetProductsTest;
import br.com.desafiosicredi.tests.products.tests.PostProductsAddTest;
import br.com.desafiosicredi.tests.users.tests.GetUsersTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.desafiosicredi.suites.AcceptanceTests.class)
@Suite.SuiteClasses({
        GetCheckAPItests.class,
        GetUsersTest.class,
        PostAuthTest.class,
        GetAuthTest.class,
        PostProductsAddTest.class,
        GetProductsIdTest.class,
        GetProductsTest.class
})
public class AcceptanceTests {
}
