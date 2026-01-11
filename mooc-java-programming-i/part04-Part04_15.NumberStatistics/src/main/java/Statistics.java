
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }   
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if(this.count > 0) {
            return (double) this.sum / this.count;
        }
        
        return 0.0;
    }
}
