
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbersCount = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0) {
                break;
            }
            
            numbersCount = numbersCount + 1;
            sum = sum + number;
        }
        
        System.out.println("Number of numbers: " + numbersCount);
        System.out.println("Sum of the numbers: " + sum);
    }
}
