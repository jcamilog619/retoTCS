package co.com.tcs.certifications.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddRegisterUser extends PageObject {

    public static  final Target BTN_USER = Target.the("Button User")
            .located(By.xpath("//a[@id='menuUserLink']"));

    public static  final Target LOGIN_MODAL = Target.the("Login Modal")
            .located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));

    public static  final Target CREATE_NEW_USER = Target.the("Create New User")
            .located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));

    public static  final Target USERNAME = Target.the("Enter UserName")
            .located(By.xpath("//input[@name='usernameRegisterPage']"));

    public static  final Target EMAIL = Target.the("Enter Email")
            .located(By.xpath("//input[@name='emailRegisterPage']"));

    public static  final Target PASS = Target.the("Enter Pass")
            .located(By.xpath("//input[@name='passwordRegisterPage']"));

    public static  final Target CONFIRM_PASS = Target.the("Enter Confirm Pass")
            .located(By.xpath("//input[@name='confirm_passwordRegisterPage']"));

    public static  final Target FIRST_NAME = Target.the("Enter First Name")
            .located(By.xpath("//input[@name='first_nameRegisterPage']"));

    public static  final Target LAST_NAME = Target.the("Enter Last Name")
            .located(By.xpath("//input[@name='last_nameRegisterPage']"));

    public static  final Target PHONE = Target.the("Enter Phone")
            .located(By.xpath("//input[@name='phone_numberRegisterPage']"));

    public static  final Target COUNTRY = Target.the("Enter Country")
            .located(By.xpath("//select[@name='countryListboxRegisterPage']"));

    public static  final Target CITY = Target.the("Enter City")
            .located(By.xpath("//input[@name='cityRegisterPage']"));

    public static  final Target ADDRESS = Target.the("Enter Address")
            .located(By.xpath("//input[@name='addressRegisterPage']"));

    public static  final Target STATE = Target.the("Enter Address")
            .located(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']"));

    public static  final Target POSTAL_CODE = Target.the("Code Postal")
            .located(By.xpath("//input[@name='postal_codeRegisterPage']"));

    public static  final Target CLICK_AGREE = Target.the("Click Agregate")
            .located(By.xpath("//input[@name='i_agree']"));

    public static  final Target CLICK_REGISTER = Target.the("Click Register")
            .located(By.xpath("//button[@id='register_btnundefined']"));

    public static  final Target QUESTIONS_USER = Target.the("Questions User")
            .located(By.xpath("//a[@id='menuUserLink']"));







}
