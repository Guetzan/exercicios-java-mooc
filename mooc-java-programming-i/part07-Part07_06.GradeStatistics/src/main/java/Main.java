import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PointsManager manager = new PointsManager();
        UI ui = new UI(scan, manager);

        ui.start();
    }
}
