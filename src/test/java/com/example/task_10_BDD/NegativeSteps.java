package com.example.task_10_BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class NegativeSteps {

    private static int result;
    private static boolean exceptionThrown;

    @Given("Calculator is running")
    public void calculatorIsRunning() {
    }

    @When("Trying divide {int} to {int}")
    public int divideByZero(int firstNumber, int secondNumber) throws ArithmeticException {
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            exceptionThrown = true;
        }
        return result;
    }

    @Then("Receive error message as result")
    public void receiveErrorMessageAsResult() {
        assertTrue(exceptionThrown);
    }

}