
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        for(int counter = 1; counter <= number; counter++) {
            factorial = factorial * counter;
        }

        System.out.println(factorial);
    }
}
