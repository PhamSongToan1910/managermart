/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managermart;

/**
 *
 * @author ACER
 */
public class product {
    private String productName;
    private String productId;
    private float cost;
    private int productPrice;
    private int amount;

    public product(String productName, String productId, float cost, int productPrice, int amount) {
        this.productName = productName;
        this.productId = productId;
        this.cost = cost;
        this.productPrice = productPrice;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
     public product() {
        
    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
     
    @Override
    public String toString() {
        return "product{" + "productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice + '}';
    }

    
    
    
}
