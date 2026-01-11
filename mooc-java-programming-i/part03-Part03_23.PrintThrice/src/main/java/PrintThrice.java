
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        
        System.out.print(name);
        System.out.print(name);
        System.out.print(name);
    }
}
