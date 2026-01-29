import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(new Task(task));
    }

    public void remove(int index) {
        this.tasks.remove(index - 1);
    }

    public void print() {
        for(Task task: this.tasks) {
            System.out.println((this.tasks.indexOf(task) + 1) + ": " + task.getName());
        }
    }
}
