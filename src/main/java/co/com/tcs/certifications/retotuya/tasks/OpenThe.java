package co.com.tcs.certifications.retotuya.tasks;


import co.com.tcs.certifications.retotuya.userinterface.OpenThePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private OpenThePage openThePage;
    public static OpenThe page() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openThePage));
    }
}
