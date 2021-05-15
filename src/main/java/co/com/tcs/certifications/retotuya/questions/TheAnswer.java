package co.com.tcs.certifications.retotuya.questions;

import co.com.tcs.certifications.retotuya.model.DataList;
import co.com.tcs.certifications.retotuya.model.DataListProduct;
import co.com.tcs.certifications.retotuya.model.DataRegisterList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tcs.certifications.retotuya.userinterface.AddRegisterUser.QUESTIONS_USER;


public class TheAnswer implements Question<Boolean> {
    private Boolean login;
    private Boolean createUser;
    private Boolean addpost;



    @Subject("validate the answer")
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        if (login) {
            String user = DataList.getResponseUser().toString().substring(10).replace("}", "");
            String wordLogin = Text.of(QUESTIONS_USER).viewedBy(actor).asString();
            result = user.equals(wordLogin);
        } else if (createUser) {
            String createUser = DataRegisterList.getRsCreateUser().toString().substring(10).replace("}","");
            String wordUser = Text.of(QUESTIONS_USER).viewedBy(actor).asString();
            result = createUser.equals(wordUser);
        }else if (addpost) {
            String productFrom = DataListProduct.getRsProductFrom().toString().substring(10).replace("}","");
            String addProduct = DataListProduct.getRsProduct().toString().substring(9).replace("}","");
            result = productFrom.equals(addProduct);
        }
        return result;
    }


    public TheAnswer login() {
        this.login = true;
        this.createUser = false;
        this.addpost = false;
        return this;
    }

    public TheAnswer createUser() {
        this.login = false;
        this.createUser = true;
        this.addpost = false;
        return this;
    }

    public TheAnswer addpost() {
        this.login = false;
        this.createUser = false;
        this.addpost = true;
        return this;
    }


    public static TheAnswer is() {
        return new TheAnswer();
    }
}
