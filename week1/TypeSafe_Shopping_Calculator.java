/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.type.safe_shopping_calculator;

/**
 *
 * @author benes
 */
public class TypeSafe_Shopping_Calculator {
public static void main(String[] args) {
        String storeName = "SM Store";
        int quantity = 3;
        double unitPrice = 49.50;

        double totalCost = quantity * unitPrice;

        System.out.println("Shopping Summary");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: Pesos" + unitPrice);
        System.out.println("Total Cost: Pesos" + totalCost);
    }
}
