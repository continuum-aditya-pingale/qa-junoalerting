import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions (monochrome = true, 
features = "src/test/resources/features",
glue = {"continuum.cucumber.stepDefinations"},
plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
        "timeline:target/timeline-reports/"},
tags={"@Functional","~@ignore"})
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}