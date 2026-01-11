
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner file = new Scanner(Paths.get("data.txt"))) {
            while(file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch(Exception exception) {
            System.out.println("Error:" + exception.getMessage());
        }
    }
}
