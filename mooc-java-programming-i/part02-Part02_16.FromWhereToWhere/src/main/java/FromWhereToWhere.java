
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int targetNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Where from? ");
        int originNumber = Integer.valueOf(scanner.nextLine());

        if(originNumber <= targetNumber) {
            for(int counter = originNumber; counter <= targetNumber; counter++) {
                System.out.println(counter);
            }
        }
    }
}
