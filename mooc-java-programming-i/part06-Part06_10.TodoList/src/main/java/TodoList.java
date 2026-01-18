import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList;
     
    public TodoList() {
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.taskList.add(task);
    }
    
    public void remove(int index) {
        this.taskList.remove(index - 1);
    }
    
    public void print() {
        for(String task: this.taskList) {
            System.out.println((taskList.indexOf(task) + 1) + ": " + task);
        }
        
        System.out.println("");
    }
}
