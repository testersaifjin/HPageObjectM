package com.PageObjectModel;

import Pages.WelcomePage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WelcomeStepDef extends DriverManager {

    WelcomePage wp = new WelcomePage();
    @Then("^User enter welcome screen$")
    public void user_enter_welcome_screen() {

//        Assert.assertTrue(wp.landedOnTheWelcomePage());

    }
}
