
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int totalWeight;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = totalWeight = 0;
    }
    
    
    
    public void addSuitcase(Suitcase suitcase) {
        totalWeight += suitcase.totalWeight();
        if (totalWeight <= maximumWeight) {
            this.suitcases.add(suitcase);
        } else {
            totalWeight -= suitcase.totalWeight();
        } 
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase s: suitcases) {
            s.printItems();
        }
    }
}
