
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddsStats = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            }
            
            stats.addNumber(number);
            
            if(number % 2 == 0) {
                evenStats.addNumber(number);
                continue;
            }
            
            oddsStats.addNumber(number);
        }
        
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddsStats.sum());
    }
}
