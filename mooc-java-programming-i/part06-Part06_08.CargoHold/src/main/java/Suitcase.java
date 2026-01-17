import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private final int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if(!(this.totalWeight() + item.getWeight() > maxWeight)) {
            items.add(item);
        }
    }
    
    public int totalWeight() {
        if(items.isEmpty()) {
            return 0;
        }
        
        int totalWeight = 0;
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(Item item: items) {
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        return this.items.size() + " items " + "(" + this.totalWeight() + " kg)";
    }
}
