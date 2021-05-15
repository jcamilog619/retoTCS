package co.com.tcs.certifications.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddRegisterProduct extends PageObject {

    public static  final Target BTN_SPEAKERS = Target.the("Button Speakers")
            .located(By.xpath("//div[@id='speakersImg']"));

    public static  final Target SELECT_PRODUCT = Target.the("Select Product")
            .located(By.xpath("//a[contains(text(),'HP Roar Mini Wireless Speaker')]"));

    public static  final Target BTN_ADD_CART = Target.the("Button Add Cart")
            .located(By.xpath("//button[@name='save_to_cart']"));

    public static  final Target BTN_SHOPPING_CART = Target.the("Button Sphopping Cart")
            .located(By.xpath("//a[@id='shoppingCartLink']"));

    public static  final Target QUESTIONS_PRODUCT = Target.the("Questions Sphopping Cart")
            .located(By.xpath("//h3[contains(text(),'HP ROAR MINI WIRELESS SPEAKER')][1]"));

    public static  final Target BTN_CLOSE = Target.the("Button delete Product")
            .located(By.xpath("//div[@class='removeProduct iconCss iconX'][1]"));

}
