package entities;

import java.util.HashMap;

public class Product {

    private HashMap<String, Double> productList = new HashMap();

    ; 

    public Product() {
    }

    public HashMap getProductList() {
        return productList;
    }

    public void setProductList(HashMap productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Product{" + "productList=" + productList + '}';
    }

}
