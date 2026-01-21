import java.util.Scanner;

public class UI {
    private Scanner scan;
    private Container container1;    
    private Container container2;

    
    public UI(Scanner scan, Container container1, Container container2) {
        this.scan = scan;
        this.container1 = container1;        
        this.container2 = container2;
    }
    
    public void start() {
         while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
             
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            
            if (input.isEmpty()) {
                break;
            }
            
            commandExec(input);
        }       
    }
    
    public void commandExec(String input) {
        String[] splitedCommand = input.split(" "); 
        String command = splitedCommand[0];
        int amount = Integer.valueOf(splitedCommand[1]);
        
        
        if(command.equals("add")) {
            add(amount);
        }

        if(command.equals("remove")) {
            remove(amount);
        }

        if(command.equals("move")) {
            move(amount);
        }
    }
    
    public void add(int amount) {
        this.container1.add(amount);
    }
    
    public void remove(int amount) {
        this.container2.remove(amount);
    }
    
    public void move(int amount) {
        if(amount > this.container1.contains()) {
            amount = this.container1.contains();
        }
        
        this.container2.add(amount);
        this.container1.remove(amount);
    }
}
        