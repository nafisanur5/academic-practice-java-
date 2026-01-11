/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab301;

/**
 *
 * @author nafisa nur
 */
public class Lab301 {

    public static void main(String[] args) {
public class BankAccountTransactions {

    public static void main(String[] args) {
        transactionDetails td= new transactionDetails();
        
        td.addtransaction(new Transaction("06/08/2025",5000,"Deposit"));
        td.addtransaction(new Transaction("06/08/2025",1000,"Withdraw"));
        td.addtransaction(new Transaction("06/08/2025",9000,"Withdraw"));
        
        System.out.println("All transaactions");
        td.display();
        System.out.println("All transaactions above 2000");
        td.displayCertainAmount();
        System.out.println("Total Balance");
        td.calculate();
        td.displaycalculation();
        
    }
}
    
