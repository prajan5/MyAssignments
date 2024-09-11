package accountrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/accountfeature",
glue="steps",
publish=true,
monochrome=true)

public class AccountRunner extends AbstractTestNGCucumberTests {

}
