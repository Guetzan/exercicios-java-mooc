public class Exercise {
    private String name;
    private boolean isComplete;
    
    public Exercise(String name) {
        this.name = name;
        this.isComplete = false;
    }
    
    public void setAsComplete() {
        this.isComplete = true;
    }
    
    public boolean isComplete() {
        return this.isComplete;
    }
    
    public String getName() {
        return name;
    }
}
