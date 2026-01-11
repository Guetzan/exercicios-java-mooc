
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int totalNumbers = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            }

            sum += number;
            totalNumbers++;
            
            if(number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.print("Sum: " + sum);        
        System.out.print("\nNumbers: " + totalNumbers);
        System.out.print("\nAverage: " + ((double)sum / totalNumbers));
        System.out.print("\nEven: " + evenNumbers);
        System.out.print("\nOdd: " + oddNumbers);
    }
}
