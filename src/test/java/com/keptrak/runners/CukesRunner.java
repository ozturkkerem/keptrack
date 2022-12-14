package com.keptrak.runners;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\oztur\\OneDrive\\Desktop\\IdeaProjects\\keptrack\\src\\test\\resources\\features",
        glue = "com/keptrak/step_definitions",
        tags = "@wip"

)

public class CukesRunner {
}
