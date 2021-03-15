
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int totalWeight;
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
        this.totalWeight = totalWeight = 0;
    }
    
    public void addItem(Item item) {
        totalWeight += item.getWeight();
        if (totalWeight <= maximumWeight) {
            this.items.add(item);
        } else {
            totalWeight -= item.getWeight();
        }
    }
    
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + this.totalWeight + " kg)";
        }
        return items.size() + " items (" + this.totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item returnItem = items.get(0);
        for (Item i: items) {
            if (i.getWeight() > returnItem.getWeight()) {
                returnItem = i;
            }
        }
        
        return returnItem;
        
        
    }
    
}
