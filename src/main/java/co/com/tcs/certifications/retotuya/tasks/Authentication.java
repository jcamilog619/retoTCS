package co.com.tcs.certifications.retotuya.tasks;

import co.com.tcs.certifications.retotuya.model.DataList;
import static co.com.tcs.certifications.retotuya.util.Variable.*;

import static co.com.tcs.certifications.retotuya.userinterface.EnterTheInformation.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.tcs.certifications.retotuya.userinterface.AddRegisterUser.BTN_USER;
import static co.com.tcs.certifications.retotuya.userinterface.AddRegisterUser.LOGIN_MODAL;

public class Authentication implements Task {
    private List<DataList> dataLists;
    public Authentication(List<DataList> dataLists) {
        this.dataLists = dataLists;
    }


    @Subject("Authentication with user")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> user = new HashMap<>();
        actor.attemptsTo(
                Click.on(BTN_USER),
                WaitUntil.the(LOGIN_MODAL, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(dataLists.get(CERO).getUserName()).into(USERNAME),
                Enter.theValue(dataLists.get(CERO).getPass()).into(PASS),
                Click.on(BTN_LOGIN));

        user.put("USERNAME",dataLists.get(CERO).getUserName());
        DataList.setResponseUser(user);
    }

    public static Authentication user(List<DataList> dataLists){
        return Tasks.instrumented(Authentication.class,dataLists);
    }
}
