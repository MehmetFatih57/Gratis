package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttiğimiz dosyada fail olan senaryolar tutulur.
        features = "@TestOutput/failed_scenario.txt",
        glue = {"stepDefinition"},
        dryRun = false,//-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = true//-->true kullanırsak konsoldaki çıktılar tek renk(siyah) olur

)
public class FailedRunner {
}
