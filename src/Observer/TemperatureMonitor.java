/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author Lincoln
 */
public class TemperatureMonitor implements Observer {

    public static final int DESIRED_TEMPARATURE = 25;
    
    
    
    @Override
    public void uptade(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;
        System.out.println(thermometer.getCurrentTemperature());
        
        if(thermometer.getCurrentTemperature() == DESIRED_TEMPARATURE){
            System.out.println("Temperature is fine");
        }
        if(thermometer.getCurrentTemperature() != DESIRED_TEMPARATURE){
            thermometer.setCurrentTemperature(DESIRED_TEMPARATURE);
            System.out.println("Adjusting the temperature");
        }
        
    }
    
    
    
    
}
