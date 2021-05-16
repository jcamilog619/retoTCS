package co.com.tcs.certifications.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterTheInformation extends PageObject {


    public static  final Target USERNAME = Target.the("Enter User Name")
            .located(By.xpath("//input[@name='username']"));

    public static  final Target PASS = Target.the("Enter Password")
            .located(By.xpath("//input[@name='password']"));

    public static final Target BTN_LOGIN= Target.the("Btn login")
            .located(By.xpath("//button[@id='sign_in_btnundefined']"));

    public static final Target QUESTIONS_LOGIN= Target.the("Btn login")
            .located(By.xpath("//label[contains(text(),'Incorrect user name or password.')]"));

}
