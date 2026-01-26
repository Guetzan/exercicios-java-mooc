import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdManager manager;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.manager = new BirdManager();
    }

    public void start() {
        askForCommands();
    }

    public void askForCommands() {
        while(true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();

            if(command.isEmpty()) {
                continue;
            }

            if(command.equals("Quit")) {
                break;
            }

            this.execCommand(command);
        }
    }

    public void execCommand(String command) {
        if(command.equals("Add")) {
            this.add();
        }

        if(command.equals("Observation")) {
            this.observation();
        }

        if(command.equals("All")) {
            this.printBirds();
        }

        if(command.equals("One")) {
            this.one();
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();

        System.out.print("Name in latin: ");
        String nameInLatin = this.scanner.nextLine();

        this.manager.add(name, nameInLatin);
    }

    public void observation() {
        System.out.print("Bird? ");
        String bird = this.scanner.nextLine();

        boolean result = this.manager.addObservation(bird);

        if(!result) {
            System.out.println(bird + " is not a bird!");
        }
    }

    public void one() {
        System.out.print("Bird? ");
        String name = this.scanner.nextLine();
        
        String bird = this.manager.getBird(name);

        if(bird == null) {
            System.out.println(name + " is not a bird!");
            return;
        }

        System.out.println(bird);
    }

    public void printBirds() {
        ArrayList<Bird> birds = this.manager.getAll();

        int index = 0;
        while(index < birds.size()) {
            System.out.println(birds.get(index));
            index++;
        }
    }
}
