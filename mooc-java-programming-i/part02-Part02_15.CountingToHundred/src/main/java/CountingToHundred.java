
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int counter = number; counter <= 100; counter++) {
            System.out.println(counter);
        }        
    }
}
