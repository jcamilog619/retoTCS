package co.com.tcs.certifications.retotuya.model;

import java.util.HashMap;
import java.util.Map;

public class DataRegisterList {
    private static Map<String, Object> rsCreateUser = new HashMap<>();
    private String userName, email, pass, confirmPass, firName, lastName, phone, conutry, city, address, stage, postalCode;

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getConfirmPass() {
        return confirmPass;
    }

    public String getFirName() {
        return firName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getConutry() {
        return conutry;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getStage() {
        return stage;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public static Map<String, Object> getRsCreateUser() {
        return rsCreateUser;
    }

    public static void setRsCreateUser(Map<String, Object> rsCreateUser) {
        DataRegisterList.rsCreateUser = rsCreateUser;
    }
}
