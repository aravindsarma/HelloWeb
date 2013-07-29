/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app02a.httpsession;

/**
 *
 * @author Aravind Sarma Yeluripati
 */
public class ShoppingItem {
    private Product product;
    private int quantity;

    public ShoppingItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
