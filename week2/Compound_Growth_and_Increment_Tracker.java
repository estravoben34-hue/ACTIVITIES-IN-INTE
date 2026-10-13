/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compound_growth_and_increment_tracker;

/**
 *
 * @author benes
 */
public class Compound_Growth_and_Increment_Tracker {
public static void main(String[] args) {

        double balance = 2000.00;  
        System.out.println("Starting balance: " + balance);

        balance += 200.00;
        System.out.println("After deposit (+= 200):      " + balance);

        balance *= 1.05;
        System.out.println("After 5% interest (*= 1.05): " + balance);

        balance += 150.00;
        System.out.println("After deposit (+= 150):      " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth (*= 1.10):  " + balance);

        System.out.println();

        int count = 5;
        System.out.println("Postfix  count++ prints: " + count++);
        System.out.println("count immediately after: " + count);

        System.out.println();

        count = 5;
        System.out.println("Prefix   ++count prints: " + ++count);
        System.out.println("count immediately after: " + count); 
    }
}
