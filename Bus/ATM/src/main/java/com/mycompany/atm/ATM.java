/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm;

/**
 *
 * @author nafisa nur
 */
public class ATM {

    private double balance ;
    public void initial(double InitialBalance){
        this.balance = InitialBalance;   
    }

    public void deposit(double depositAmount){
        this.balance= balance + depositAmount;
        System.out.println("deposited: "+ depositAmount+" successfully");
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount<=balance){     
            this.balance= balance - withdrawAmount;
            System.out.println("Withdrawn: "+withdrawAmount+" successfully");
        }
        else{System.out.println("Insufficient Balance");
        }}
    public double getBalance(){
        return balance;
    }
}
