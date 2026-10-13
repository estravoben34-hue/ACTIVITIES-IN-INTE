/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overflow_and_reference_investigator;

/**
 *
 * @author benes
 */
public class Overflow_and_Reference_Investigator {
  public static void main(String[] args) {
        byte number = 127;
        number++;
        System.out.println("Byte after overflow: " + number);

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("\nString Comparisons:");

        System.out.println("str1 == str2: " + (str1 == str2));

        System.out.println("str1.equals(str2): " + str1.equals(str2));

        System.out.println("str1 == str3: " + (str1 == str3));

        System.out.println("str1.equals(str3): " + str1.equals(str3));

        System.out.println("str2 == str3: " + (str2 == str3));

        System.out.println("str2.equals(str3): " + str2.equals(str3));

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        array2[0] = 99;

        System.out.println("\nArray Reference Sharing:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
    }
}
