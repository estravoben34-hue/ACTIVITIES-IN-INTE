/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.four.function_calculator;

/**
 *
 * @author benes
 */
import java.util.Scanner;

public class FourFunction_Calculator {
  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Enter first integer: ");
          int a = input.nextInt();
          
          System.out.print("Enter second integer: ");
          int b = input.nextInt();
          
          System.out.println();
          
          System.out.println("Results for a = " + a + ", b = " + b);
          System.out.println("-----------------------------");
          System.out.println("Addition:       " + a + " + " + b + " = " + (a + b));
          System.out.println("Subtraction:    " + a + " - " + b + " = " + (a - b));
          System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
          
          if (b != 0) {
              System.out.println("Division:       " + a + " / " + b + " = " + (a / b));
              System.out.println("Modulus:        " + a + " % " + b + " = " + (a % b));
          } else {
              System.out.println("Division:       undefined (cannot divide by zero)");
              System.out.println("Modulus:        undefined (cannot divide by zero)");
          }
      }
    }
}
