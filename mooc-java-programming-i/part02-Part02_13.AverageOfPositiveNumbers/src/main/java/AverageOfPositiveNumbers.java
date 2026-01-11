
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            
            if(number > 0) {
                numbersCount = numbersCount + 1;
                sum = sum + number;
            }            
        }
        
        if(numbersCount > 0) {
            System.out.println("Average of the numbers: " + ((double)sum / numbersCount));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
