package Test.Mobile.drive.acceptancetets;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/",
        stepNotifications = true
        plugin = "pretty"
        glue="com.example")
public class CucumberTestSuite {}
