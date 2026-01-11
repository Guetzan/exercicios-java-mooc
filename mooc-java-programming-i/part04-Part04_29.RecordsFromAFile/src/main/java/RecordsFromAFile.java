
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        
        try(Scanner infosFile = new Scanner(Paths.get(file))) {
            while(infosFile.hasNextLine()) {
                String[] info = infosFile.nextLine().split(",");
                String name = info[0];
                int age = Integer.valueOf(info[1]);
                
                System.out.print(name + ", age: " + age + " year");
                
                if(age > 1 || age == 0) {
                    System.out.print("s");
                }
                
                System.out.println("");
            }
        } catch(Exception exception) {
            System.out.println("Error: " + exception);
        }
    }
}
