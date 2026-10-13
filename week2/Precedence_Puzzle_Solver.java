/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.precedence_puzzle_solver;

/**
 *
 * @author benes
 */

/**first puzzle*/
public class Precedence_Puzzle_Solver {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 6;
        
/**second puzzle*/
System.out.println("1) a + b * c > 10 && c - a == 2  ->  "
                + (a + b * c > 10 && c - a == 2));

int x = 5;
int r = x++ + ++x * 2;

System.out.println("2) x++ + ++x *2 -> r = " + r + ", x = " + x);
/**third puzzle*/
System.out.println("3) true || false && false -> " + (true || false && false));

    }
}
