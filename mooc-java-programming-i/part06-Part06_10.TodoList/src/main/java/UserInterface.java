
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            execCommand(command);
        }
    }
    
    public void execCommand(String command) {
        if(command.equals("add")) {
            add();
            return;
        }
        
        if(command.equals("remove")) {
            remove();
            return;
        }
        
        if(command.equals("list")) {
            list();
            return;
        }
        
        System.out.println("Command not found");
    }
    
    public void add() {
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        
        this.list.add(task);
    }
    
    public void remove() {
        System.out.println("To remove: ");
        int taskIndex = Integer.valueOf(this.scanner.nextLine());
        
        this.list.remove(taskIndex);
    }
    
    public void list() {
        this.list.print();
    }
}
