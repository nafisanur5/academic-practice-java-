/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab103;

/**
 *
 * @author nafisa nur
 */
import java.util.Scanner;
public class Student {
    double TotalMark=500,s1,s2,s3,s4,s5,TotalMarkObtained,percentage;
    public void InputValue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark for s1:");
        s1=sc.nextDouble();
        System.out.println("Enter mark for s2:");
        s2=sc.nextDouble();
        System.out.println("Enter mark for s3:");
                s3=sc.nextDouble();
        System.out.println("Enter mark for s4:");
                s4=sc.nextDouble();
        System.out.println("Enter mark for s5:");
                s5=sc.nextDouble();

    }
    public void TotalMark(){
        TotalMarkObtained= s1+s2+s3+s4+s5;
        percentage =(TotalMarkObtained/ TotalMark)*100;
        
    
}
    public void Display(){
        System.out.println("Obtained Percentage: "+percentage);
    }
}
