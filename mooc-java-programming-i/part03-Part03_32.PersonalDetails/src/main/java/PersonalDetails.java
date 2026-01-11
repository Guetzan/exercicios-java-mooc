
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int longestNameLength = -1;
        int yearsSum = 0;
        int usersCount = 0;
        
        while(true) {
            String user = scanner.nextLine();
            
            if(user.equals("")) {
                break;
            }
            
            String[] userInfo = user.split(",");           
            String userName = userInfo[0];
            int userBirthYear = Integer.valueOf(userInfo[1]);
            
            if(userName.length() > longestNameLength) {
                longestNameLength = userName.length();
                longestName = userName;
            }
            
            yearsSum += userBirthYear;
            usersCount++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)yearsSum / usersCount));
    }
}
