/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab105;

/**
 *
 * @author nafisa nur
 */
public class ShoppingBill {
    double shirt=1300,pant=1700,TotalPrice,vat,PriceWithVat;
    public void shoppingBill(){
        TotalPrice= 3*shirt+2*pant;
       vat=TotalPrice *.15;
       PriceWithVat= vat+TotalPrice;
    } 
    public void Display(){
        System.out.println("Price with vat:"+PriceWithVat);
    }
    
}
