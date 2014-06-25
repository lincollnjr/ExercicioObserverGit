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
public class Thermometer extends Observable {
    
    private int currentTemperature;
    
    public Thermometer(){
        currentTemperature = 0; //medidores
    
    }
    
    public void setCurrentTemperature(int graus){
        
        currentTemperature = graus;
        
        setChanged();
        notifyObeservers();
    }
    
    public int getCurrentTemperature(){
        return this.currentTemperature;
    }
    
   
}
