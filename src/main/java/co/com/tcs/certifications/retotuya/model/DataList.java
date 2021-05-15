package co.com.tcs.certifications.retotuya.model;

import java.util.HashMap;
import java.util.Map;

public class DataList {
    private static Map<String, Object> responseUser = new HashMap<>();
    private static Map<String, Object> responseResult = new HashMap<>();
    private String userName,pass,category,product,email,subject,result;

    public String getUserName() {
        return userName;
    }

    public String getPass() { return pass; }

    public String getCategory() { return category; }

    public String getProduct() { return product; }

    public String getEmail() { return email; }

    public String getSubject() { return subject; }

    public String getResult() { return result; }

    public static Map<String, Object> getResponseUser() { return responseUser; }

    public static void setResponseUser(Map<String, Object> responseUser) {
        DataList.responseUser = responseUser;
    }

    public static Map<String, Object> getResponseResult() { return responseResult; }

    public static void setResponseResult(Map<String, Object> responseResult) { DataList.responseResult = responseResult; }
}
