package co.com.tcs.certifications.retotuya.stepdefinitions;

import co.com.tcs.certifications.retotuya.exceptions.ValidateException;
import co.com.tcs.certifications.retotuya.model.DataList;
import co.com.tcs.certifications.retotuya.model.DataListProduct;
import co.com.tcs.certifications.retotuya.model.DataRegisterList;
import co.com.tcs.certifications.retotuya.questions.TheAnswer;
import co.com.tcs.certifications.retotuya.questions.TheAnswerOfTheInfo;
import co.com.tcs.certifications.retotuya.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AdvantageStepDefinitions {

    @Before
    public void Configuration() {
        setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to enter the page$")
    public void thatCamiloWantsToEnterThePage(String camilo) {
        theActorCalled(camilo).wasAbleTo(OpenThe.page());
    }

    @When("^he user enter the datas$")
    public void heUserEnterTheDatas(List<DataList> dataLists) {
        theActorInTheSpotlight().attemptsTo(Authentication.user(dataLists));
    }

    @When("^he user register the form$")
    public void heUserRegisterTheForm(List<DataRegisterList> dataRegisterLists) {
        theActorInTheSpotlight().attemptsTo(Register.user(dataRegisterLists));
    }


    @When("^he user registers the contact form$")
    public void heUserRegistersTheContactForm(List<DataList> dataLists) {
        theActorInTheSpotlight().attemptsTo(Contact.us(dataLists));
    }

    @When("^he user add product$")
    public void heUserAddProduct(List<DataListProduct> dataListProducts) {
        theActorInTheSpotlight().attemptsTo(AddProduct.select(dataListProducts));
    }


    @Then("^he should see the user authentication$")
    public void heShouldSeeTheUserAuthentication() {
        theActorInTheSpotlight().should(seeThat(TheAnswer.is().login()).orComplainWith(ValidateException.class, ValidateException.LOGIN_ERROR));
    }

    @Then("^he should see the failed message (.*)$")
    public void heShouldSeeTheFailedMessage(String word) {
        theActorInTheSpotlight().should(seeThat(TheAnswerOfTheInfo.is(word).failedLog()).orComplainWith(ValidateException.class, ValidateException.LOGIN_ERROR));
    }

    @Then("^should see the result of the created user$")
    public void shouldSeeTheResultOfTheCreatedUser() {
        theActorInTheSpotlight().should(seeThat(TheAnswer.is().createUser()).orComplainWith(ValidateException.class, ValidateException.CREATE_USER_ERROR));
    }


    @Then("^should see the result of contact us (.*)$")
    public void shouldSeeTheResultOfContactUs(String word) {
        theActorInTheSpotlight().should(seeThat(TheAnswerOfTheInfo.is(word).contactForm()).orComplainWith(ValidateException.class, ValidateException.CONTACT_US_ERROR));
    }


    @Then("^should see the result of adding the product$")
    public void shouldSeeTheResultOfAddingTheProduct() {
        theActorInTheSpotlight().should(seeThat(TheAnswer.is().addpost()).orComplainWith(ValidateException.class, ValidateException.ADD_PRODUCT_ERROR));
    }


}
