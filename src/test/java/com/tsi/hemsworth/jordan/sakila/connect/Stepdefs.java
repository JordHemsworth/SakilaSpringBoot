package com.tsi.hemsworth.jordan.sakila.connect;

import com.tsi.hemsworth.jordan.sakila.connect.category.Category;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class Stepdefs {

    private String actualAnswer;

    Category category = new Category();


    @Given("the category name is Action.")
    public void the_category_name_is_action() {
        category.setName("Action");

    }
    @When("I ask what the category name is.")
    public void i_ask_what_the_category_name_is() {
        actualAnswer = category.getName();

    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}