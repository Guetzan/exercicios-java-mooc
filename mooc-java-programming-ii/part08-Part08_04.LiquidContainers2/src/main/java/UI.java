import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UI(Scanner scanner) {
        this.container1 = new Container();
        this.container2 = new Container();
        this.scanner = scanner;
    }

    public void start() {
        commandReader();
    }

    public void commandReader() {
        while(true) {
            this.printContainers();
            System.out.print("> ");
            String command = this.scanner.nextLine();

            if(command.equals("quit")) {
                break;
            }

            if(command.isEmpty()) {
                continue;
            }

            String[] splittedCommand = command.split(" ");
            String action = splittedCommand[0];
            int param = Integer.valueOf(splittedCommand[1]);

            if(param < 0) {
                continue;
            }

            execCommand(action, param);
        }
    }

    public void printContainers() {
        System.out.println("First: " + this.container1);
        System.out.println("Second: " + this.container2);
    }

    public void execCommand(String action, int param) {
        if(action.equals("add")) {
            this.container1.add(param);
        }

        if(action.equals("move")) {
            this.move(param);
        }

        if(action.equals("remove")) {
            this.container2.remove(param);
        }
    } 

    public void move(int amount) {
        if(amount > this.container1.contains()) {
            amount = this.container1.contains();
        }

        this.container2.add(amount);
        this.container1.remove(amount);
    }
}
