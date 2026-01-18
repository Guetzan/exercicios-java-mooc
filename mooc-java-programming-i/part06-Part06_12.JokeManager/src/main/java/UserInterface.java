import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            this.drawCommands();
            String command = this.scanner.nextLine();

            if(command.equals("X")) {
                break;
            }       
            
            execCommand(Integer.valueOf(command));
        }
    }
    
    public void drawCommands() {
        System.out.println("Commands: ");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
    
    public void execCommand(int command) {
        if(command == 1) {
            this.add();
            return;
        }
        
        if(command == 2) {
            this.draw();
            return;
        }
        
        if(command == 3) {
            this.list();
            return;
        }
        
        System.out.println("Unknown command");
    }
    
    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = this.scanner.nextLine();
        
        this.manager.addJoke(joke);
    }
    
    public void draw() {
        System.out.println("Drawing a joke.");
        System.out.println(this.manager.drawJoke());
    }
    
    public void list() {
        System.out.println("Printing the jokes.");
        this.manager.printJokes();
    }
}
