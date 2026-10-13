/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unit_casting_converter;

/**
 *
 * @author benes
 */
public class Unit_Casting_Converter {
  public static void main(String[] args) {
        double centimeters = 275.5;

        int meters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        int number = 25;
        double widenedNumber = number;

        System.out.println("Implicit Widening: " + widenedNumber);

        double decimalNumber = 12.75;
        int narrowedNumber = (int) decimalNumber;

        System.out.println("Explicit Narrowing: " + narrowedNumber);
    }
}
