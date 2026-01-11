
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {

    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        for(int counter = beginning; counter <= end; counter++) {
            if((counter % 3) == 0) {
                System.out.println(counter);
            }
        }
    }
}
