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

public class Package {
    private ArrayList<Gift> giftsList;

    public Package() {
        this.giftsList = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        giftsList.add(gift);
    }
    
    public int totalWeight() {
        int sumOfWeights = 0;
        
        for (Gift gift : giftsList) {
            sumOfWeights += gift.getWeight();
        }
        
        return sumOfWeights;
    }
    
    
}
