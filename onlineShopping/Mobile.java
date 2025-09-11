package onlineShopping;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :12:03:24 PM
 * Project :CoreJava
*/

class Mobile extends Product {
    public Mobile(String productName, double price) {
        super(productName, price);
    }

    @Override
    public void showProductDetails() {
        System.out.println("Mobile: " + productName + " | Price: ₹" + price);
    }
}