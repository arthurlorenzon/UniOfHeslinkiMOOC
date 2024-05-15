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

public class Room {
    private ArrayList<Person> rooms;
    
    public Room() {
        this.rooms = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.rooms.add(person);
    }
    
    public boolean isEmpty() {
        return this.rooms.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.rooms;
    }
    
    public Person shortest() {
        if (this.rooms.isEmpty()) {
            return null;
        }
        
        Person returnObj = this.rooms.get(0);
        
        for (Person prs : this.rooms) {
            if (returnObj.getHeight() > prs.getHeight()) {
                returnObj = prs;
            }
        }
        return returnObj;
    }
    
    public Person take() {
        if (this.rooms.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = shortest();
        
        this.rooms.remove(shortestPerson);
        
        return shortestPerson;
    }
}




