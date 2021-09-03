import javax.swing.*;
import java.util.Scanner;

import java.text.DecimalFormat;
public class Sales {
    public static void main(String[] args) {

     double salePrice;
     int discount;
     double quantityBought;
     int salesTax;

        DecimalFormat roundTo2 = new DecimalFormat("0.00");

     salePrice = Double.parseDouble(JOptionPane.showInputDialog("Whats the sale price?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("Whats the discount?"));
        quantityBought = Double.parseDouble(JOptionPane.showInputDialog("Whats the quantity bought?"));
        salesTax = Integer.parseInt(JOptionPane.showInputDialog("Whats the sale tax?"));

        double TAX = salesTax/100.0;
        double unalteredPrice = salePrice * quantityBought;
        double discountedPrice = unalteredPrice * 0.1;
        double subTotal = salePrice * quantityBought - discountedPrice;
        double taxTotal = subTotal * TAX;
        double totalCost = subTotal + taxTotal;
       String NewSUB = roundTo2.format(subTotal);
        System.out.println("Subtotal: $"+ NewSUB);
        String NewTAX = roundTo2.format(taxTotal);
        System.out.println("Tax Total: $"+ NewTAX);
       String TotalCost2 = roundTo2.format(totalCost);
        System.out.println("Total Cost: $" + TotalCost2);

        JOptionPane.showMessageDialog(null,"Subtotal: $" + NewSUB +"\nTax Total: $" + NewTAX + "\nTotal Cost: $" + TotalCost2);
    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    }
}
