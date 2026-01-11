
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int originNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int targetNumber = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for(int counter = originNumber; counter <= targetNumber; counter++) {
            sum += counter;
        }

        System.out.println("The sum is " + sum);
    }
}
