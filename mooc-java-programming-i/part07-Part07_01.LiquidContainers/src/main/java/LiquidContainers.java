import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;       
        int container2 = 0;
        int limit = 100;

        while(true) {
            System.out.println("First: " + container1 + "/" + 100);           
            System.out.println("Second: " + container2 + "/" + 100);

            String input = scan.nextLine();

            if(input.isEmpty()) {
                break;
            }

            if(input.equals("quit")) {
                break;
            }

            String[] splittedCommand = input.split(" ");
            String instruction = splittedCommand[0];
            int amount = Integer.valueOf(splittedCommand[1]);
            
            if(amount < 0) {
                continue;
            }

            if(instruction.equals("add")) {
                container1 += amount;
                
                if(container1 > limit) {
                    container1 = limit;
                }
                continue;
            }

            if(instruction.equals("remove")) {
                container2 -= amount;
                
                if(container2 < 0) {
                    container2 = 0;
                }
                
                continue;
            }

            if(instruction.equals("move") && container1 > 0) {
                if(amount > container1) {
                    amount = container1;
                }

                container2 += amount;
                container1 -= amount;

                if(container2 > limit) {
                    container2 = limit;
                }
            }
        }
    }
}
