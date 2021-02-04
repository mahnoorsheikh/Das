package StepsDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\Features"},
        glue = {"StepsDefinations"},
        monochrome = true,
        tags = {"@Dastagnegative"})
//       " " +
//               "@LoginInTag, " +
//               "@Das, " +
////               "@D_ContactUs, " +
//        ""})
public class TestRunner {
	
}
