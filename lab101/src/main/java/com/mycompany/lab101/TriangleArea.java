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
public class TriangleArea {
    double area,base,height;
    public void InputValue(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base value");
        base = sc.nextDouble();
                System.out.println("Enter height value");
                height= sc.nextDouble();

        
    }
    public void Trianglearea(){
        area= (0.5)*base*height;
        
    }
    public void display(){
        System.out.println("Area= " + area);
    }
}
