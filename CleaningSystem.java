/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author hadim
 */
public class CleaningSystem {

    public static void main(String[]args) throws IOException {
        String[] cleaner = Availability();
        String day = cleaner[0];
        String time = cleaner[1];

        String[] option = Price.Option();
        String type = option[0];
        String category = option[1];
        String duration = option[2];

        int price = Price.calculatePrice(type, category, duration);

        String[] detail = Detail();
        String name = detail[0];
        String phone = detail[1];
        String address = detail[2];

        Receipt(name,phone,address,day,time,type,category,duration,price);
    }

    public static String[] Availability() {
        Scanner input = new Scanner(System.in);

        // Import data from other class
        String[][] cleaner = Schedule.Schedule();

        // declare variables
        int day, time;
        String result;

        // Display the cleaner schedule
        System.out.println("╔------------------------------------╗");
        System.out.println("| WELCOME TO DOHN CLEANING SERVIECES |");
        System.out.println("╚------------------------------------╝");
        
        System.out.println("\nThis Program handles services for house cleaning");
        System.out.println("\n\n\t\tDOHN Cleaning Service System");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < cleaner.length; i++) {
            for (int j = 0; j < cleaner[i].length; j++) {
                System.out.print(cleaner[i][j]+"      \t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");

        do {
            // Input for day
            System.out.println("\n1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday\n");
            do {
                System.out.print("Please enter the day(1-7): ");
                day = input.nextInt();
                if (day < 1 || day > 7)
                    System.out.print("Invalid input! ");
            } while (day < 1 || day > 7); // Repeat until input(day) is valid

            // Input for time
            System.out.println("\n1. Morning\n2. Afternoon\n3. Evening");
            do {
                System.out.print("Please enter the time(1-3): ");
                time = input.nextInt();
                if (time < 1 || time > 3)
                    System.out.print("Invalid input! ");
            } while (time < 1 || time > 3); // Repeat until input(time) is valid

            // Check the cleaner availability
            result = cleaner[day][time];
            switch (result) {
                case "YES":
                    System.out.println("\nGood, cleaner is available on that time.\n"); break;
                case "NO":
                    System.out.println("\nI'm sorry, cleaner is not available on that time.\nPlease try again.\n"); break;
                case "HOLIDAY":
                    System.out.println("\nI'm sorry, We are close on that day.\nPlease try again.\n"); break;
                default:
                    System.out.println("\nThere is an error, we will update later. Sorry.\nPlease try again.\n");
            }
        } while (!result.equalsIgnoreCase("YES")); // Repeat until cleaner is available

        String hari = cleaner[day][0];
        String masa = cleaner[0][time];
        return new String[]{hari,masa};
    }

    public static String[] Detail() {
        Scanner input = new Scanner(System.in);

        String name, phone, address;

        System.out.print("\nPlease provide your name: ");
        name = input.next();
        System.out.print("Please provide your phone number: ");
        phone = input.next();
        System.out.print("Please provide your address: ");
        address = input.next();

        return new String[]{name,phone,address};
    }

    public static void Receipt(String name, String phone, String address,
                           String day, String time, String type,
                               String category, String duration, int price) throws IOException {
        // Define the file name
        String fileName = "Receipt.txt";

        // Open a FileWriter in append mode
        try (FileWriter fileWriter = new FileWriter("receipt.text", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            // Write receipt information to the file
            printWriter.println("\n\n\n\t\t\t\t\t\t\t\t Cleaning Service System");
            printWriter.println("\n \t\t\t\t\t\t\t\t---------- Receipt ----------");
            printWriter.println("\t\t\t\t\t\t\t\tCustomer Name      : " + name);
            printWriter.println("\t\t\t\t\t\t\t\tPhone Number       : " + phone);
            printWriter.println("\t\t\t\t\t\t\t\tAddress            : " + address);
            printWriter.println("\t\t\t\t\t\t\t\tDay and Time       : " + day + ", " + time);
            printWriter.println("\t\t\t\t\t\t\t\tService Type       : " + type);
            printWriter.println("\t\t\t\t\t\t\t\tService Category   : " + category);
            printWriter.println("\t\t\t\t\t\t\t\tService Duration   : " + duration);
            printWriter.println("\t\t\t\t\t\t\t\tTotal Price        : RMY" + price);
            printWriter.println("\t\t\t\t\t\t\t\t---------------------------------");
            printWriter.println("\t\t\t\t\t\t\t\t\t Thank you!");

            System.out.println("\t\t\t\t\t\t\t\t╔----------------------╗");
            System.out.println("\t\t\t\t\t\t\t\t| Saved as receipt.txt |");
            System.out.println("\t\t\t\t\t\t\t\t╚----------------------╝");

            System.out.println("\t\t\t\t\t\t\t\tReceipt printed in " + "receipt.text");
            
            
            System.out.println("\t\t\t\t\t\t\tTHANK YOU FOR CHOOSING DOHN CLEANING SERVICES :)");
            
            
        }
    }
}
