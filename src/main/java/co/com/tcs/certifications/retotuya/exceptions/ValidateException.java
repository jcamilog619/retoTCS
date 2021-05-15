package co.com.tcs.certifications.retotuya.exceptions;

public class ValidateException extends AssertionError {
    public static final String LOGIN_ERROR = "could not perform the authentication";
    public static final String CREATE_USER_ERROR = "could not create user";
    public static final String ADDPOST_ERROR = "could not add a post";


    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }
}
