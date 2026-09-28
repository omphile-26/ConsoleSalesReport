/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.consolesalesreport;
import java.util.Scanner;
/**
 *
 * @author deepl
 */
    /**
     * @param args the command line arguments
     */
///the main class that runs the application
///accepts user input
///
         public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                //user choose one of the options 
                System.out.println("Select the console type");
                System.out.println("1) PS5");
                System.out.println("2) XBOX");
                System.out.println("3) SWITCH");
                
                //reads user input option
                //the input is an integer
                int choice = input.nextInt();
                input.nextLine(); // consume newline

                 // Determine console type based on user choice
                String consoleType = "";
                switch (choice) {
                    case 1: consoleType = "PS5"; break;
                    case 2: consoleType = "XBOX"; break;
                    case 3: consoleType = "SWITCH"; break;
                    default: consoleType = "UNKNOWN"; break;
                }
                    //the user enters the name of the store
                    System.out.print("Enter the store: ");
                    String storeName = input.nextLine();

                    //the output of total sales with console type and store name
                    System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
                    int totalSales = input.nextInt();

                    // Instantiate ConsoleSales
                    ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

                    // Print report
                    salesReport.printReport();
                }
}


    
