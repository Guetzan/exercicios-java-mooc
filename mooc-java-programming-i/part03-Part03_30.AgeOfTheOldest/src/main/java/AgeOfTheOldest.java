
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user = scanner.nextLine();
        String[] pieces = user.split(",");
        int oldest = Integer.valueOf(pieces[1]);

        while(true){
            user = scanner.nextLine();
            
            if(user.equals("")) {
                break;
            }
            
            pieces = user.split(",");
            
            if(Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}

