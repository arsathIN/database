package org.TestRunner2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\DataBase\\databaseMap.feature", glue = "org.stepDefinition2", dryRun = false)
public class TestRunner2 {

}
