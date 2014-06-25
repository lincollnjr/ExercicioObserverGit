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
public class Observable {

    private Observer observer;
    private boolean changedObserver = false;
    
    public void addObserver(Observer observer){
        this.observer = observer;
    }
    
    public void deleteObserver(){
        this.observer = null;
        this.changedObserver = false;
    }
    
    public void setChanged(){
        this.changedObserver = true;
    }
    
    public void notifyObeservers(){
        observer.uptade(this);
    }
}
