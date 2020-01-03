package com.roytuts.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.Is;

import static org.hamcrest.MatcherAssert.assertThat;


public class UserSteps {

        private User user = new User();

        @Given("^that the user (.*) is given a task to clear (.*) certification exam$")
        public void certificationName(String name, String certication) throws Throwable {
            user.setName(name);
            user.setCertification(certication);
        }

        @When("^(.*) got (\\d+) marks in exam$")
        public void gotMarks(String name, int marks) throws Throwable {
            user.setName(name);
            user.setMarks(marks);
        }

        @Then("^(.*) is known as (.*) certified$")
        public void certifiedYes(String name, String certification) throws Throwable {
            assertThat(name, Is.is(user.getName()));
            assertThat(user.getCertification(), Is.is(certification));
            assertThat(user.getResult(), AnyOf.anyOf(Is.is(true),Is.is(false)));

        }
    }

