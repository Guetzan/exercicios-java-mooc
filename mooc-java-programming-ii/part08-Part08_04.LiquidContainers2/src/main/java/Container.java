public class Container {
    private int currentAmount;
    private int capacity;

    public Container() {
        this.currentAmount = 0;
        this.capacity = 100;
    }

    public int contains() {
        return this.currentAmount;
    }

    public void add(int amount) {
        if(amount < 0) {
            return;
        }

        this.currentAmount += amount;

        if(this.currentAmount > capacity) {
            this.currentAmount = capacity;
        }
    }

    public void remove(int amount) {
        if(amount < 0) {
            return;
        }

        this.currentAmount -= amount;

        if(this.currentAmount < 0) {
            this.currentAmount = 0;
        }
    }

    public String toString() {
        return this.currentAmount + "/" + this.capacity;
    }
}
