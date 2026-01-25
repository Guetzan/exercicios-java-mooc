import java.util.Scanner;

public class UI {
    private Scanner scan;
    private PointsManager manager;

    public UI(Scanner scan, PointsManager manager) {
        this.scan = scan;
        this.manager = manager;
    }

    public void start() {
        gatherInput();

        System.out.println("Point average (all): " + this.manager.pointsAverage());
        System.out.println("Point average (passing): " + this.manager.passingPointsAverage());
        System.out.println("Pass percentage: " + this.manager.passingPercentage());
        this.printStats();
    }

    public void gatherInput() {
        while(true) {
            System.out.println("Enter points, -1 stops: ");
            int points = Integer.valueOf(this.scan.nextLine());

            if(points == -1) {
                break;
            }

            if(points < 0 || points > 100) {
                continue;
            }

            this.manager.add(points);
        }
    }

    public void printStats() {
        int grade = 5;
        
        while(grade >= 0) {
            int index = 0;

            System.out.print(grade + ": ");

            while(index < manager.countGrade(grade)) {
                System.out.print("*");
                index++;
            }

            System.out.println();
            grade--;
        }
    }
}
