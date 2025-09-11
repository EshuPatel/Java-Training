package onlineShopping;

/**
 * Author : Eshu.Patel
 * Date : Sep 6, 2025
 * Time :12:04:16 PM
 * Project :CoreJava
*/

//Interface for Online Payment
interface OnlinePayment {
 void payOnline(double amount);
}

//Interface for Discount
interface Discount {
 double applyDiscount(double amount);
}
