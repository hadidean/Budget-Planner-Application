/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author hadim
 */
public class Schedule {
    public static String[][] Schedule() {
        String[][] availability = {
                {"DAY/TIME","MORNING", "AFTERNOON", "EVENING"},
                {"MONDAY","NO", "NO","YES"},
                {"TUESDAY","YES", "NO","NO"},
                {"WEDNESDAY","YES", "YES","YES"},
                {"THURSDAY","YES", "NO","YES"},
                {"FRIDAY","NO", "YES","NO"},
                {"SATURDAY","YES", "NO","NO"},
                {"SUNDAY","NO", "NO","NO"},
        };
        return availability;
    }
}
    

