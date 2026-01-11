
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        
        boolean correctCredentials = false;
        
        if(username.equals("alex")) {
            if(password.equals("sunshine")) {
                System.out.println("You have successfully logged in!");
                correctCredentials = true;
            }
        }
        
        if(username.equals("emma")) {
            if(password.equals("haskell")) {
                System.out.println("You have successfully logged in!");
                correctCredentials = true;
            }
        }
        
        if(!correctCredentials) {
            System.out.println("Incorrect username or password!");
        }
    }
}
