public class Bird {
    private String name;
    private String nameInLatin;
    private int observation;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observation = 0;
    }

    public void increaseObservation() {
        this.observation++;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return name + " (" + this.nameInLatin + "): " + this.observation + " observations";
    }
}
