package com.android.stark;

public class ProductData {
    private final String productName;
    private final String productDescription;
    private final String productPrice;
    private final int productImage;

    public ProductData(String productName, String productDescription, String productPrice, int productImage) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public int getProductImage() {
        return productImage;
    }
}
