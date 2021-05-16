package co.com.tcs.certifications.retotuya.questions;

import static co.com.tcs.certifications.retotuya.userinterface.EnterTheInformation.QUESTIONS_LOGIN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tcs.certifications.retotuya.userinterface.ContactForm.QUESTIONS;


public class TheAnswerOfTheInfo implements Question<Boolean> {
    private String word;
    private Boolean contactForm;
    private Boolean failedLog;

    public TheAnswerOfTheInfo(String word) {
        this.word = word;
    }


    @Subject("validate the answer")
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        if (contactForm) {
            String wordResult = Text.of(QUESTIONS).viewedBy(actor).asString();
            result = word.equals(wordResult);
        } else if (failedLog) {
            String wordRsLogin = Text.of(QUESTIONS_LOGIN).viewedBy(actor).asString();
            result = word.equals(wordRsLogin);
        }
        return result;
    }

    public TheAnswerOfTheInfo contactForm() {
        this.contactForm = true;
        this.failedLog = false;
        return this;
    }

    public TheAnswerOfTheInfo failedLog() {
        this.contactForm = false;
        this.failedLog = true;
        return this;
    }


    public static TheAnswerOfTheInfo is(String word) {
        return new TheAnswerOfTheInfo(word);
    }
}
