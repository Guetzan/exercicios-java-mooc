import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if(command.equals("stop")) {
                break;
            }

            if(command.isEmpty()) {
                continue;
            }

            if(command.equals("add")) {
                this.add();
            }

            if(command.equals("remove")) {
                this.remove();
            }

            if(command.equals("list")) {
                this.list();
            }
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = this.scanner.nextLine();

        this.list.add(task);
    }

    public void remove() {
        System.out.print("To remove: ");
        int task = Integer.valueOf(this.scanner.nextLine());

        this.list.remove(task);
    }

    public void list() {
        this.list.print();
    }
}
