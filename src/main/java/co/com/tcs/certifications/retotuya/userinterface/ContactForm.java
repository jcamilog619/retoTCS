package co.com.tcs.certifications.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactForm extends PageObject {

    public static  final Target BTN_CONTACT_US = Target.the("Button Contact us")
            .located(By.xpath("//a[contains(text(),'CONTACT US')]"));

    public static  final Target CATEGORY= Target.the("Select Category")
            .located(By.xpath("//select[@name='categoryListboxContactUs']"));

    public static  final Target PRODUCT= Target.the("Select Product")
            .located(By.xpath("//select[@name='productListboxContactUs']"));

    public static  final Target EMAIL= Target.the("Enter Email")
            .located(By.xpath("//input[@name='emailContactUs']"));

    public static  final Target TEXT_AREA= Target.the("Enter text")
            .located(By.xpath("//textarea[@name='subjectTextareaContactUs']"));

    public static  final Target BTN_SEND= Target.the("Button Send")
            .located(By.xpath("//button[@id='send_btnundefined']"));

    public static  final Target QUESTIONS= Target.the("Txt of Questions")
            .located(By.xpath("//p[contains(text(),'Thank you for contacting Advantage support.')]"));

}