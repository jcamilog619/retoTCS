package co.com.tcs.certifications.retotuya.tasks;

import co.com.tcs.certifications.retotuya.model.DataList;
import co.com.tcs.certifications.retotuya.model.DataRegisterList;
import static co.com.tcs.certifications.retotuya.userinterface.AddRegisterUser.*;

import static co.com.tcs.certifications.retotuya.util.Variable.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Register implements Task {
    private List<DataRegisterList> dataRegisterList;

    public Register(List<DataRegisterList> dataRegisterList) {
        this.dataRegisterList = dataRegisterList;
    }


    @Subject("register user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Random rnd = new Random();
        int name = (int)(Math.random()*100);
        String userName = dataRegisterList.get(CERO).getUserName()+ String.valueOf(name);
        Map<String, Object> userCreate = new HashMap<>();
        actor.attemptsTo(
                WaitUntil.the(BTN_USER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_USER),
                WaitUntil.the(LOGIN_MODAL, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CREATE_NEW_USER),
                Click.on(USERNAME),
                Enter.theValue(userName).into(USERNAME),
                Enter.theValue(dataRegisterList.get(CERO).getEmail()).into(EMAIL),
                Enter.theValue(dataRegisterList.get(CERO).getPass()).into(PASS),
                Enter.theValue(dataRegisterList.get(CERO).getConfirmPass()).into(CONFIRM_PASS),
                Enter.theValue(dataRegisterList.get(CERO).getFirName()).into(FIRST_NAME),
                Enter.theValue(dataRegisterList.get(CERO).getLastName()).into(LAST_NAME),
                Enter.theValue(dataRegisterList.get(CERO).getPhone()).into(PHONE),
                SelectFromOptions.byVisibleText(dataRegisterList.get(CERO).getConutry()).from(COUNTRY),
                Enter.theValue(dataRegisterList.get(CERO).getStage()).into(CITY),
                Enter.theValue(dataRegisterList.get(CERO).getStage()).into(ADDRESS),
                Enter.theValue(dataRegisterList.get(CERO).getStage()).into(STATE),
                Enter.theValue(dataRegisterList.get(CERO).getPostalCode()).into(POSTAL_CODE),
                Click.on(CLICK_AGREE),
                Click.on(CLICK_REGISTER),
                WaitUntil.the(QUESTIONS_USER, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());

        userCreate.put("USERNAME",userName);
        DataRegisterList.setRsCreateUser(userCreate);
    }

    public static Register user(List<DataRegisterList> dataRegisterList) {
        return Tasks.instrumented(Register.class, dataRegisterList);
    }
}