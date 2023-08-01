package com.example.stepdefinitions;

import com.example.api.NextBirthdayApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class NextBirthdayStepDefinitions {
    private String dateOfBirth;
    private String unit;
    private String result;

    @Given("^the user's date of birth is \"([^\"]*)\"$")
    public void setUserDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @When("^I request the time left until the next birthday in \"([^\"]*)\"$")
    public void requestTimeLeft(String unit) {
        this.unit = unit;
        result = NextBirthdayApi.getTimeLeft(dateOfBirth, unit);
    }

    @Then("^the API should return \"([^\"]*)\"$")
    public void validateResponseMessage(String expectedMessage) {
        assertThat(result, equalTo(expectedMessage));
    }
}
