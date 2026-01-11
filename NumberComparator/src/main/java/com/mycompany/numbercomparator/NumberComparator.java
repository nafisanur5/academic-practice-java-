/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbercomparator;

/**
 *
 * @author nafisa nur
 */
public class NumberComparator {


    private int a, b, c;

    public void InputValue(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public int findLargest() {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else {
            return 0;
        }
    }
}

    

