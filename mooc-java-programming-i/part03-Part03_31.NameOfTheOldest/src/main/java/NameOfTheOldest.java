
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String oldestName = "";
        
        while(true) {
            String user = scanner.nextLine();
            
            if(user.equals("")) {
                break;
            }
            
            String[] userInfo = user.split(",");           
            int userAge = Integer.valueOf(userInfo[1]);
            
            if(userAge > oldest) {
                oldest = userAge;
                oldestName = userInfo[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
