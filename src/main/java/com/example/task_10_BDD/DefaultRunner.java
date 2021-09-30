package com.example.task_10_BDD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Run",
        strict = true,
        stepNotifications = true,
        features = "src/test/resources/features"
)

public class DefaultRunner {
}