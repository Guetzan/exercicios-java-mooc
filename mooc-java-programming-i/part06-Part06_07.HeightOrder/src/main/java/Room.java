import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person take() {
        Person person = shortest();
        this.people.remove(person);
        
        return person;
    }
    
    public Person shortest() {
        if(this.people.isEmpty()) {
            return null;
        }
        
        Person shortest = this.people.get(0);
        
        for(Person person: people) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
}
