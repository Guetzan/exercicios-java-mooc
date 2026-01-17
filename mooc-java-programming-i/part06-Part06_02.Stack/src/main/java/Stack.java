import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public String take() {
        return this.list.remove(this.list.size() - 1);
    }
    
    public ArrayList<String> values() {
        return list;
    }
}
