package lesson5;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Suite.SuiteClasses({IntegrationTest.class, ModuleTest.class})
public class CategoryTest {


}
