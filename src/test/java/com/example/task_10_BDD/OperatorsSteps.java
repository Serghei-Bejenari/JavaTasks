package com.example.task_10_BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;

import static org.junit.Assert.assertThat;

public class OperatorsSteps {
    private static double actualResult;

    @Given("User enters numbers")
    public void userEntersEntersNumbers() {
    }

    @When("performed {string} on the {double} and {double} number")
    public double operatorType(String operator, double firstNumber, double secondNumber) {
        switch (operator) {
            case ("+"):
                actualResult = firstNumber + secondNumber;
                break;
            case ("-"):
                actualResult = firstNumber - secondNumber;
                break;
            case ("*"):
                actualResult = firstNumber * secondNumber;
                break;
            case ("/"):
                actualResult = firstNumber / secondNumber;
                break;
        }
        return actualResult;

    }

    @Then("Verifies that result equals {double}")
    public void resultIs(double expectedResult) {
        assertThat("Incorrect Operator", actualResult, CoreMatchers.is(expectedResult));
    }
}