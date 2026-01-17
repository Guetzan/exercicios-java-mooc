import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(!(this.totalWeight() + suitcase.totalWeight() > maxWeight)) {
            this.suitcases.add(suitcase);
        } 
    }
    
    public int totalWeight() {
        if(this.suitcases.isEmpty()) {
            return 0;
        }
        
        int totalWeight = 0;
        for(Suitcase suitcase: suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        if(this.suitcases.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(this.suitcases.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases " + "(" + this.totalWeight() + " kg)";
    }
}
