package co.com.tcs.certifications.retotuya.model;

import java.util.HashMap;
import java.util.Map;

public class DataListProduct {
    private static Map<String, Object> rsProductFrom = new HashMap<>();
    private static Map<String, Object> rsProduct = new HashMap<>();
    private String product;

    public String getProduct() { return product; }

    public static Map<String, Object> getRsProductFrom() { return rsProductFrom; }

    public static void setRsProductFrom(Map<String, Object> rsProductFrom) { DataListProduct.rsProductFrom = rsProductFrom; }

    public static Map<String, Object> getRsProduct() { return rsProduct; }

    public static void setRsProduct(Map<String, Object> rsProduct) { DataListProduct.rsProduct = rsProduct; }
}

