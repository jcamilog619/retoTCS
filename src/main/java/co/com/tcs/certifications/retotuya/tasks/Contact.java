package co.com.tcs.certifications.retotuya.tasks;

import co.com.tcs.certifications.retotuya.model.DataList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.tcs.certifications.retotuya.userinterface.ContactForm.*;
import static co.com.tcs.certifications.retotuya.util.Variable.CERO;

public class Contact implements Task {
    private List<DataList> dataLists;

    public Contact(List<DataList> dataLists) {
        this.dataLists = dataLists;
    }

    @Subject("contact form registration")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CONTACT_US, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Scroll.to(CATEGORY),
                SelectFromOptions.byVisibleText(dataLists.get(CERO).getCategory()).from(CATEGORY),
                SelectFromOptions.byVisibleText(dataLists.get(CERO).getProduct()).from(PRODUCT),
                Enter.theValue(dataLists.get(CERO).getEmail()).into(EMAIL),
                Enter.theValue(dataLists.get(CERO).getSubject()).into(TEXT_AREA),
                Click.on(BTN_SEND));
    }

    public static Contact us(List<DataList> dataLists) {
        return Tasks.instrumented(Contact.class, dataLists);
    }
}
