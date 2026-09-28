/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesreport;

/**
 *
 * @author deepl
 */

//abstract class for Consoles
public abstract class Consoles implements IConsoles {
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    // my Constructor
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // my Getters 
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method to be implemented in subclass
    public abstract void printReport();
}

