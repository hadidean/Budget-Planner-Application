/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.Scanner;
/**
 *
 * @author hadim
 */
public class Price {
    
   public static String[] Option(){
        Scanner input = new Scanner(System.in);

        String type, category, duration;

        System.out.println("Our services are limited to the living area, bedroom, kitchen and bathroom.");
        System.out.println("Set service only covers two of the four locations.");
        System.out.println("Full service covers all of the four locations.");

        // Input for type
        do {
            System.out.print("\nEnter type of service('set' for set service, 'full' for full service ): ");
            type = input.next();
            if (type.equalsIgnoreCase("set") || type.equalsIgnoreCase("full"))
                continue;
            else
                System.out.print("Invalid input! Please try again.");
        } while(!(type.equalsIgnoreCase("set") || type.equalsIgnoreCase("full")));

        // Input for category
        do {
            System.out.print("\nEnter the category of service(individual, pair, group): ");
            category = input.next();
            if (category.equalsIgnoreCase("individual") || category.equalsIgnoreCase("pair") || category.equalsIgnoreCase("group"))
                continue;
            else
                System.out.print("Invalid input! Please try again.");
        } while(!(category.equalsIgnoreCase("individual") || category.equalsIgnoreCase("pair") || category.equalsIgnoreCase("group")));

        // Input for duration
        do {
            System.out.print("\nEnter the duration of services(daily, weekly, monthly): ");
            duration = input.next();
            if (duration.equalsIgnoreCase("daily") || duration.equalsIgnoreCase("weekly") || duration.equalsIgnoreCase("monthly"))
                continue;
            else
                System.out.print("Invalid input! Please try again.");
        } while(!(duration.equalsIgnoreCase("daily") || duration.equalsIgnoreCase("weekly") || duration.equalsIgnoreCase("monthly")));
        return new String[]{type,category,duration};
    }

    public static int calculatePrice(String type, String categories, String duration) {
        int price = 0;

        if (type.equalsIgnoreCase("set") || type.equalsIgnoreCase("full"))
        {
            if (type.equalsIgnoreCase("set"))
            {
                if (categories.equalsIgnoreCase("individual"))
                    price = 150;
                else if (categories.equalsIgnoreCase("pair"))
                    price = 250;
                else if (categories.equalsIgnoreCase("group"))
                    price = 375;
                else
                    System.err.println("Invalid");
            }
            else if (type.equalsIgnoreCase("full"))
            {
                if (categories.equalsIgnoreCase("individual"))
                    price = 200;
                else if (categories.equalsIgnoreCase("pair"))
                    price = 300;
                else if (categories.equalsIgnoreCase("group"))
                    price = 450;
                else
                    System.err.println("Invalid");
            }


            if (duration.equalsIgnoreCase("daily")) {
                price *= 20;
            } else if (duration.equalsIgnoreCase("weekly")) {
                price *= 4;
            } else if (duration.equalsIgnoreCase("monthly")) {
                price = price; // No change for monthly
            } else {
                System.out.println("Wrong input for duration!");
                return 0;
            }
        } else {
            System.out.println("Invalid input for type!");
            return 0;
        }

        return price;
    }
}
    

