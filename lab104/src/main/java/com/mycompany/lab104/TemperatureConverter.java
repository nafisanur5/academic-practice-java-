/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab104;

/**
 *
 * @author nafisa nur
 */
import java.util.Scanner;
public class TemperatureConverter {  
    double celsius,fahrenheit;

    public void InputValue(){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter temperature in celsius:");
    celsius= s.nextDouble();
}public void Calculation(){
    fahrenheit= (celsius*(9/5))+32;
}
public void Display(){
    System.out.println("temperature in fahrenheit:"+ fahrenheit);

}}
