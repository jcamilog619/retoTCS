package co.com.tcs.certifications.retotuya.exceptions;

public class ValidateException extends AssertionError {
    public static final String LOGIN_ERROR = "could not perform the authentication";
    public static final String CREATE_USER_ERROR = "could not create user";
    public static final String CONTACT_US_ERROR = "could not contact us";
    public static final String ADD_PRODUCT_ERROR = "could not add a product";


    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }
}
