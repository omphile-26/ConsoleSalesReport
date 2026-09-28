/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesreport;

/**
 *
 * @author deepl
 */
public class ConsoleSales extends Consoles {
    // my Constructor as parameters
    //it accepts the cosole type, storeName and totalSales
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Implement abstract method
    @Override
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + consoleType);
        System.out.println("STORE: " + storeName);
        System.out.println("TOTAL SALES: " + totalSales);
    }
    
    //error occurred when there was no throw new
    @Override
    public String getStore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
