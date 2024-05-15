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

public class Stack {
    private ArrayList<String> list = new ArrayList<>(); 
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        return null;
    }
}
