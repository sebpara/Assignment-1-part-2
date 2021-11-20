/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplestatisticcalculator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author sebastianparaschivescu
 */
public class SimpleStatisticCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner statistic = new Scanner(System.in);
        String sep = ":";
       // input
        System.out.printf("Please input 5 numbers separated by space: ");
        String numbers = statistic.nextLine();
       
        String[] parts = numbers.split(Pattern.quote(" "));
       // double numbers
        double nb1 = Double.parseDouble(parts[0]);
        double nb2 = Double.parseDouble(parts[1]);
        double nb3 = Double.parseDouble(parts[2]);
        double nb4 = Double.parseDouble(parts[3]);
        double nb5 = Double.parseDouble(parts[4]);
       
   
        double mean = (nb1 + nb2 + nb3 + nb4 + nb5) / 5;
        double min = nb1;
        double max = nb1;
        double sum = Math.pow(Math.abs(nb1 - mean), 2);
       
        for(int i=1; i<5; i++){
            if(Double.parseDouble(parts[i]) <  min ){
                min = Double.parseDouble(parts[i]);
            }
             if(Double.parseDouble(parts[i]) > max ){
                max = Double.parseDouble(parts[i]);
            }
            sum += Math.pow(Math.abs(Double.parseDouble(parts[i]) - mean), 2);
        }
       
       
       
        double SD = Math.sqrt(sum/5);
       
       // output
        System.out.printf("Numbers %12s %.2f, %.2f, %.2f, %.2f, %.2f\n", sep, nb1, nb2, nb3, nb4, nb5);
        System.out.printf("Mean %15s %.2f\n", sep, mean);
        System.out.printf("Minimum %12s %.2f\n", sep, min);
        System.out.printf("Maximum %12s %.2f\n", sep, max);
        System.out.printf("Standard Deviation %s %.2f\n", sep, SD);
    }
    
}
