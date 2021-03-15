/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = value;
    }
    
    public void increase() {
        if (value < 5) {
            value++;
        }        
    }
    
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
