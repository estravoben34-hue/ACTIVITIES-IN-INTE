/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grade_threshold_checker;

/**
 *
 * @author benes
 */
public class Grade_Threshold_Checker {
     public static void main(String[] args) {

        double average = 80;
        int absences = 6;

        boolean pass = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);

        if (pass) {
            System.out.println("Result: PASS");
            System.out.println("Reason: You meet the grade and attendance requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Your grade is below 90 and you do not meet both regular requirements.");
        }
     }
}
