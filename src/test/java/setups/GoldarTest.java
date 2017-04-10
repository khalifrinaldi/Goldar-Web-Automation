package setups;

import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:report/GoldarReport.html"})

public class GoldarTest {
    @AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Login Feature");
    }
}
