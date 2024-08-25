package br.com.desafiosicredi.runners;



import br.com.desafiosicredi.tests.auth.tests.PostAuthTest;
import br.com.desafiosicredi.tests.products.tests.PostProductsAddTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.desafiosicredi.suites.ContratoTest.class)
@Suite.SuiteClasses({
        PostAuthTest.class,
        PostProductsAddTest.class
})
public class ContratoTests {
}
