
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
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person returnShortest = persons.get(0);
        
        for (Person p: persons) {
            if (p.getHeight() < returnShortest.getHeight()) {
                returnShortest = p;
            }
        }
        
        return returnShortest;
    }
    
    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person returnRemoved = this.shortest();
        persons.remove(this.shortest());
        
        return returnRemoved;
    }
}
