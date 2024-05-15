/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arthur
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;

        for (Item i : items) {
            totalWeight += i.getWeight();
        }

        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnObj = this.items.get(0);
        
        for (Item i : this.items) {
            if (returnObj.getWeight() < i.getWeight()) {
                returnObj = i;
            }
        }
        return returnObj;
    }

    public String toString() {
        int totalWeight = 0;

        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        
        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() > 1) {
            return items.size() + " items " + "(" + totalWeight + " kg)";
        }
        return items.size() + " item " + "(" + totalWeight + " kg)";
    } 
}
