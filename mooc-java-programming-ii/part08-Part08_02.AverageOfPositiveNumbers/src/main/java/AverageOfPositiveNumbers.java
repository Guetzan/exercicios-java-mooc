
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0) {
                break;
            }

            if(num > 0) {
                sum += num;
                counter++;
            }
        }

        if(counter == 0) {
            System.out.println("Cannot calculate the average");
        }

        if(counter > 0) {
            System.out.println((double)sum / counter);
        }
    }
}
