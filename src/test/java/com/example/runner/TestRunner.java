package com.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/example/features",
        glue = "com.example.stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}
)
public class TestRunner {
}
