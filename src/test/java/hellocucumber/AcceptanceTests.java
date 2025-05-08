package hellocucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = { "summary", "html:target/cucumber/wikipedia.html"},
        monochrome=true,
        snippets = SnippetType.CAMELCASE,
        glue = {"stepdefs"})
// "dtu.library.acceptance_tests", "dtu.library.student_tests"})

public class AcceptanceTests {

}

