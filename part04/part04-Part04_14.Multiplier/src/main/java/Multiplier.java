/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arthu
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int newNumber) {
        this.number = newNumber;
    }
    
    public int multiply(int number) {
        return this.number * number;
    }
}
