package br.com.desafiosicredi.runners;



import br.com.desafiosicredi.suites.ContractTest;
import br.com.desafiosicredi.tests.PostAuthTest;
import br.com.desafiosicredi.tests.PostProductsAddTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(ContractTest.class)
@Suite.SuiteClasses({
        PostAuthTest.class,
        PostProductsAddTest.class
})
public class ContractTests {
}
