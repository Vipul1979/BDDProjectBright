package BDDProjectBright;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

//@CucumberOptions(features = "src/test/Resource/Filterpage.feature")
//@CucumberOptions(features = "src/test/Resource/Homepage.feature",tags = {"@sanity"})

//@CucumberOptions(features = "src/test/Resource/",tags = {"@sanity","@regression"},
//@CucumberOptions(features = "src/test/Resource/Homepage.feature",tags = {"@sanity"},
@CucumberOptions(features = "src/test/Resource/Homepage.feature",tags = {"@smoke"},
            plugin = {"html:target/cucumber-html-report", //here do not forget , in between two report
                    "json:target/cucumber-json-report.json",
                    "junit:target/cucumber-xml-report.xml",
                    "pretty:target/cucumber-pretty-report.txt"
            }//plugin curly bracket end

// you can write vipul-html-report, html which format,
// target where you want to create report

    )//feature bracket end Here everything in side cucumeber option feature paranthisis (feature,tags, plugin)
    public class RunCukesTest {

    }



