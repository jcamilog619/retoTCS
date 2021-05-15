package co.com.tcs.certifications.retotuya.tasks;

import co.com.tcs.certifications.retotuya.model.DataListProduct;
import co.com.tcs.certifications.retotuya.util.Variable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.tcs.certifications.retotuya.userinterface.AddRegisterProduct.*;

public class AddProduct implements Task {
    private List<DataListProduct> dataListProducts;

    public AddProduct(List<DataListProduct> dataListProducts) {
        this.dataListProducts = dataListProducts;
    }

    @Subject("add Product")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> ProductFrom = new HashMap<>();
        Map<String, Object> Product = new HashMap<>();
        actor.attemptsTo(
                Click.on(BTN_SPEAKERS),
                Click.on(SELECT_PRODUCT),
                Click.on(BTN_ADD_CART),
                WaitUntil.the(BTN_SHOPPING_CART, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds());

        String nameProductF= Text.of(QUESTIONS_PRODUCT).viewedBy(actor).asString();
        String nameProduct= dataListProducts.get(Variable.CERO).getProduct();
        ProductFrom.put("PRO_FROM",nameProductF);
        Product.put("PRODUCT",nameProduct);
        DataListProduct.setRsProductFrom(ProductFrom);
        DataListProduct.setRsProduct(Product);

        actor.attemptsTo(Click.on(BTN_CLOSE));
    }

    public static AddProduct select(List<DataListProduct> dataListProducts){
        return Tasks.instrumented(AddProduct.class,dataListProducts);
    }
}
