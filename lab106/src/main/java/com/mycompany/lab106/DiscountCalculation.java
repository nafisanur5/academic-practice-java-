/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab106;

/**
 *
 * @author nafisa nur
 */
public class DiscountCalculation {
    double shirt=1300,pant=1700,panjabi=2300,totalprice,vat,ShirtDiscount,PantDiscount,PanjabiTotalPrice,TotalwithVat,FinalPrice;
            public void DiscountCalculation(){
                ShirtDiscount= (2*shirt)*.30;
                PantDiscount = (2*pant)*.50;
                PanjabiTotalPrice= 2*panjabi;
                totalprice= -ShirtDiscount+(2*shirt)-PantDiscount+(2*pant)+PanjabiTotalPrice;
                TotalwithVat= totalprice*.15;
                FinalPrice= TotalwithVat+totalprice; 
            }
            public void Display(){
                System.out.println("FinalPrice="+FinalPrice);
            }
    
}
