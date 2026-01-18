import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dict = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                break;
            }
            
            execCommand(command);
        }
        
        System.out.println("Bye bye!");
    }
    
    public void execCommand(String command) {
        if(command.equals("add")) {
            add();
            return;
        }
        
        if(command.equals("search")) {
            search();
            return;
        }
        
        System.out.println("Unknown command");
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.println("Translation: ");
        String translation = scanner.nextLine();

        dict.add(word, translation);       
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        if(dict.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }
        
        System.out.println(dict.translate(word));
    }
}
