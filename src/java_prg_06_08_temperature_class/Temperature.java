/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_08_temperature_class;

/**
 *
 * @author aeiou
 * @param dblFTemp Used to store Fahrenheit temperature in the Temperature object
 */
public class Temperature {
    private double dblFTemp;
    
    /**
     * Constructor that creates a new Fahrenheit object with the temperature
     * set to the value passed along when the Temperature object is instantiated
     * @param ftemp Double value that will be stored in the dblFTemp as the
     * Fahrenheit temperature to perform calculations with
     */
    public Temperature(double ftemp) {
        dblFTemp = ftemp;
    }
    
    /**
     * Used to set the Fahrenheit temperature (dblFTemp) to a new value;
     * @param ftemp New Fahrenheit value (dblFTemp)
     */
    public void setFahrenheit(double ftemp) {
        dblFTemp = ftemp;
    }
    
    /**
     * Returns the stored Fahrenheit value as a double
     * @return 
     */
    public double getFahrenheit() {
        return dblFTemp;
    }
    
    /**
     * Uses stored Fahrenheit value to perform a conversion to Celsius
     * @return 
     */
    public double getCelsius() {
        return (5/9) * (dblFTemp - 32);
    }
    
    /**
     * Uses stored Fahrenheit value to perform a conversion to Kelvin
     * @return 
     */
    public double getKelvin() {
        return (5/9) * (dblFTemp - 32) + 273.15;
    }
}
