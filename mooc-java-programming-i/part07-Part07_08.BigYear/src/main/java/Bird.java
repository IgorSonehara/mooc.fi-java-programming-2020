/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationsCount;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationsCount = 0;
    }
    
    public void addObservation() {
        this.observationsCount++;
    }
    
    public int getObservations() {
        return this.observationsCount;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationsCount + " observations";
    }
    
 
}