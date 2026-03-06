
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }

        if(object.getClass() != this.getClass()) {
            return false;
        }

        if(object == this) {
            return true;
        }

        Item castedItem = (Item) object;

        if(castedItem.name.equals(this.name)) {
            return true;
        }

        return false;
    }

    @Override 
    public int hashCode() {
        int prime = 11;
        return 71 * prime + this.name.hashCode();
    }
}
