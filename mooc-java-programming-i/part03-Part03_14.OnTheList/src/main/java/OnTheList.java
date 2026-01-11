
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.print("Search for? ");
        String stringToFind = scanner.nextLine();
        
        if(list.contains(stringToFind)) {
            System.out.println(stringToFind + " was found!");
        } else {
            System.out.println(stringToFind + " was not found!");
        }
    }
}
