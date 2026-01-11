/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab101;

/**
 *
 * @author nafisa nur
 */
import java.util.Scanner;
public class CircleArea {
    double area,r,pi=3.1416;
    public void InputValue(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius value");
                        r = sc.nextDouble();
                        


    }
    public void Area(){
    area=pi*r*r;
    
}
    public void display(){
        System.out.println("Area= "+ area);
    }
    
}
