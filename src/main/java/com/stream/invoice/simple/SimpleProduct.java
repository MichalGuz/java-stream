package com.stream.invoice.simple;

public final class SimpleProduct {
    private final String productName;
    private final double productPrice;

    public SimpleProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
