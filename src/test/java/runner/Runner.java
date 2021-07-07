package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/features",
        glue={"stepDefinitions"},
        plugin  ={
                "pretty",
                   "html:target/cucumber-default-report.html",
                "json: target/cucumber-json/report.json",
           }
        )
public class Runner extends AbstractTestNGCucumberTests {
    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
}
}
