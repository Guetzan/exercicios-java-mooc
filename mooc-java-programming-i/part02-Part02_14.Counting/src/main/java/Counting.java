
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int counter = 0; counter <= number; counter++) {
            System.out.println(counter);
        }
    }
}
