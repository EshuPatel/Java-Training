// Abstract Class - Product

package onlineShopping;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :12:00:03 PM
 * Project :CoreJava
*/

abstract class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract void showProductDetails();
}