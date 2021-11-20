/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingpricecalculator;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner parking = new Scanner(System.in);
        String sep = ":";
        // input
        System.out.printf("Please input the number of minutes your car has parked: ");
        int minutes = parking.nextInt();
        int hour = minutes/60 + 1;
       
        double price = hour * 2;
        // output
        System.out.printf("Parking time (minutes) %s %s\n", sep, minutes);        
        System.out.printf("Parking time (hour) %4s %s\n", sep, hour);
        System.out.printf("Price %18s %.2f\n", sep, price);
    }
    
}
