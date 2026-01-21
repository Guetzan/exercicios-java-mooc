public class Container {
    private int currentAmount;
    private int limit;
    
    public Container() {
        this.currentAmount = 0;
        this.limit = 100;
    }
    
    public int contains() {
        return this.currentAmount;
    }
    
    public void add(int amount) {
        this.currentAmount += Math.abs(amount);
        
        if(this.currentAmount > this.limit) {
            this.currentAmount = this.limit;
        }
    }
    
    public void remove(int amount) {
        this.currentAmount -= amount;
        
        if(this.currentAmount < 0) {
            this.currentAmount = 0;
        }
    }
    
    public String toString() {
        return this.currentAmount + "/" + this.limit;
    }
} 
