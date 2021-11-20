/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webaddressextractor;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author sebastianparaschivescu
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner url = new Scanner(System.in);
        // imput
        System.out.printf("Please input a web address: ");
        String address = url.nextLine();
       
        String[] parts = address.split(Pattern.quote("."));
        String sep = ":";

       // output
        System.out.printf("Address %3s %s\n", sep, address.toLowerCase());
        System.out.printf("Heading %3s %s\n", sep, parts[0].toLowerCase());
        System.out.printf("Company %3s %s\n", sep, parts[1].toLowerCase());
        System.out.printf("Extension %S %s\n", sep, parts[2].toLowerCase());
    }
    
}
