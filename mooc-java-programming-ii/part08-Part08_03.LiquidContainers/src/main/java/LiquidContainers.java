
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int limit = 100;

        while(true) {
            System.out.println("First: " + first + "/" + limit);
            System.out.println("Second: " + second + "/" + limit);
            System.out.print("> ");

            String input = scan.nextLine();
            if(input.equals("quit")) {
                break;
            }

            if(input.isEmpty()) {
                continue;
            }

            String[] command = input.split(" ");
            String action = command[0];
            int amount = Integer.valueOf(command[1]);

            if(amount < 0) {
                continue;
            }

            if(action.equals("add")) {
                first += amount;

                if(first > limit) {
                    first = limit;
                }
            } 

            if(action.equals("move")) {
                if(amount > first) {
                    amount = first;
                }

                second += amount;
                first -= amount;

                if(second > limit) {
                    second = limit;
                }
            }

            if(action.equals("remove")) {
                second -= amount;

                if(second < 0) {
                    second = 0;
                }
            }
        }
    }
}
