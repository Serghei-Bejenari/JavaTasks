package com.example.task_10_BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ListOfSteps {

    private static List<Integer> finalList;

    @Given("Entered three numbers")
    public void listItems(List<Integer> list) {
        assertEquals(list, asList(2, 5, 7));
        finalList = list;
    }

    @When("Calculator give sum of given numbers")
    public int result() {
        return finalList.get(0) + finalList.get(1) + finalList.get(2);
    }

    @Then("Verifies that actualResult equals {int}")
    public void resultIs(double expectedResult) {
        assertThat("Incorrect Operator", 14.0, CoreMatchers.is(expectedResult));
    }
}