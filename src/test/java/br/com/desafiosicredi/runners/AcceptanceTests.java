package br.com.desafiosicredi.runners;

import br.com.desafiosicredi.tests.GetAuthTest;
import br.com.desafiosicredi.tests.PostAuthTest;
import br.com.desafiosicredi.tests.GetCheckAPITest;
import br.com.desafiosicredi.tests.GetProductsTest;
import br.com.desafiosicredi.tests.PostProductsAddTest;
import br.com.desafiosicredi.tests.GetUsersTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.desafiosicredi.suites.AcceptanceTests.class)
@Suite.SuiteClasses({
        GetCheckAPITest.class,
        GetUsersTest.class,
        PostAuthTest.class,
        GetAuthTest.class,
        PostProductsAddTest.class,
        GetProductsTest.class,
        GetProductsTest.class
})
public class AcceptanceTests {
}
