package com.example.task_10_BDD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapsSteps {
    private int result;

    private int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    @Given("Multiply operation")
    public void multiplyOperation() {
    }

    @When("Multiply first number to second number")
    public void multiplySecondNumberFromFirst(DataTable dataTable) {

        Map<String, Integer> map = dataTable.asMap(String.class, Integer.class);
        result = multiply(map.get("firstNumber"), map.get("secondNumber"));
    }

    @Then("I obtain as result number {int}")
    public void actualResult(int actual) {
        assertEquals(actual, result);
    }
}