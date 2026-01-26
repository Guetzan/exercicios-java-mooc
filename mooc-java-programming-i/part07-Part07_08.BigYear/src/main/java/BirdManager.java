import java.util.ArrayList;

public class BirdManager {
    ArrayList<Bird> birds;

    public BirdManager() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String nameInLatin) {
        this.birds.add(new Bird(name, nameInLatin));
    }

    public String getBird(String name) {
        int index = 0;

        while(index < this.birds.size()) {
            Bird bird = this.birds.get(index);

            if(bird.getName().equals(name)) {
                return bird.toString();
            }

            index++;
        }

        return null;
    }

    public ArrayList<Bird> getAll() {
        return this.birds;
    }

    public boolean addObservation(String birdName) {
        int index = 0;

        while(index < this.birds.size()) {
            Bird bird = this.birds.get(index);

            if(bird.getName().equals(birdName)) {
                bird.increaseObservation();
                return true;
            }

            index++;
        }

        return false;
    }
}
