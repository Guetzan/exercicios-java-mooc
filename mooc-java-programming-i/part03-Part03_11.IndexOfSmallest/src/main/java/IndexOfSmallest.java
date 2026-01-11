
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
        
            if(number == 9999) {
                break;
            }
            
            numbersList.add(number);
        }
        
        int smallestNumber = numbersList.get(0);      
        
        for(int i = 1; i < numbersList.size(); i++) {
            if(numbersList.get(i) < smallestNumber) {
                smallestNumber = numbersList.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallestNumber);
        
        for(int i = 0; i < numbersList.size(); i++) {
            if(numbersList.get(i) == smallestNumber) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
