/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numbercomparator;

/**
 *
 * @author nafisa nur
 */
import java.util.Scanner;

public class LargestNumberFinder {

    public static void main(String[] args) {
        NumberComparator nc = new NumberComparator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        nc.InputValue(a, b, c);
        int largest = nc.findLargest();
        if (largest == 0) {
            System.out.println("There are few equal values");

        } else {
            System.out.println("Largest value is " + largest);
        }
    }

}
