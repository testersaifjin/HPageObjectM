package com.PageObjectModel;

import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDef extends DriverManager {

    LoginPage lp = new LoginPage();

    @Given("^User is in Home Page$")
    public void user_is_in_Home_Page() {
//        lp.navigateToNopcommerpage();
    }

    @When("^User select the Login link$")
    public void user_select_the_Login_link() {

//        lp.homePageLink();
    }

    @When("^User enter email and password$")
    public void user_enter_email_and_password() {

//        lp.loginAttempt();

    }

    @When("^User click Login button$")
    public void user_click_Login_button() {

//        lp.clickOnLoginButton();
    }


}
