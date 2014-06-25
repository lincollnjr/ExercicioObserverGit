/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import Observer.TemperatureMonitor;
import Observer.Thermometer;

/**
 *
 * @author Lincoln
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TemperatureMonitor monitor = new TemperatureMonitor();
        
        Thermometer thermometer = new Thermometer();
        thermometer.addObserver(monitor);
        
        thermometer.setCurrentTemperature(30);
        thermometer.setCurrentTemperature(18);
        thermometer.setCurrentTemperature(25);
    }
    
}
