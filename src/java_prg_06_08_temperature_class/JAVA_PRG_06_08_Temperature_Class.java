/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_08_temperature_class;

import java.util.Scanner;
/**
 *
 * @author aeiou
 */
public class JAVA_PRG_06_08_Temperature_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strTemp;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.println("Please enter a temperature in degrees Fahrenheit: ");
        strTemp = scrKeyboard.nextLine();
        
        Temperature temperature = new Temperature(Double.parseDouble(strTemp));
        
        System.out.println("That temperature in degrees Celsius is: " +
                temperature.getCelsius());
        System.out.println("That temperature in degrees Kelvin is: " +
                temperature.getKelvin());
    }
    
}
