package co.com.tcs.certifications.retotuya.questions;

import co.com.tcs.certifications.retotuya.model.DataListProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tcs.certifications.retotuya.userinterface.ContactForm.QUESTIONS;


public class TheAnswerOfTheForm implements Question<Boolean> {
    private String word;

    public TheAnswerOfTheForm(String word) {
        this.word = word;
    }


    @Subject("validate the answer")
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
            String wordResult = Text.of(QUESTIONS).viewedBy(actor).asString();
            result = word.equals(wordResult);
        return result;
    }


    public static TheAnswerOfTheForm is(String word) {
        return new TheAnswerOfTheForm(word);
    }
}
