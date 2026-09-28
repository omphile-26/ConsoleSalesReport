/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.consolesalesreport;

/**
 *
 * @author deepl
 */

// IConsole.java
// This interface defines the contract for console sales reporting.
// Any class that implements IConsole must provide methods to return
// the console type and the total sales.
public interface IConsoles {
    
   
    String getConsoleType();
    String getStore();
    int getTotalSales();
    
}
