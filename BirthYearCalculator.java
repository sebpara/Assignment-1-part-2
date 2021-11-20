/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birthyearcalculator;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner date = new Scanner(System.in);
        String sep = ":";
       // input
        System.out.printf("Please input a birt year: ");
        String birthYear = date.next();
       
        String century = birthYear.substring(0, 2);
        String decade = birthYear.substring(2, 3);
       
        Integer intCentury = Integer.parseInt(century) + 1;
        Integer intDecade = Integer.parseInt(decade) * 10;
       // output
        System.out.printf("Birth Year%s %s\n", sep, birthYear);
        System.out.printf("Century %3s %s\n", sep, intCentury);
        System.out.printf("Decade %4s %s\n", sep, intDecade);
    }
    
}
