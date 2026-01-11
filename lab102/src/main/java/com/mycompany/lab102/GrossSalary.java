/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab102;

/**
 *
 * @author nafisa nur
 */
import java.util.Scanner;
        
    public class GrossSalary {
     double basic_salary,HRA,DA,grosssalary;
    public void InputVlaue(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Basic salary: ");
       basic_salary= sc.nextDouble();

       System.out.println("Enter HRA: ");
       HRA= sc.nextDouble();

       System.out.println("Enter DA: ");
       DA= sc.nextDouble();
    }
    public void GrossSalary(){
        grosssalary= basic_salary +HRA+DA;
         }
    public void display(){
        System.out.println("grosssalary: "+ grosssalary);
    }
}


