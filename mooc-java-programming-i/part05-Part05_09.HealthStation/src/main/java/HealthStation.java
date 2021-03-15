 
public class HealthStation {
    private int weighings = 0;
 
 
    public int weigh(Person person) {
        weighings++;
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }
    
    public int weighings() {
        return weighings;
    }
 
}
