import java.util.ArrayList;

public class PointsManager {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public PointsManager() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int points) {
        this.points.add(points);

        if(points >= 50) {
            this.passingPoints.add(points);
        }

        this.grades.add(pointsToGrades(points));
    }

    public int pointsToGrades(int points) {
        if(points >= 90) {
            return 5;
        }

        if(points >= 80) {
            return 4;
        }

        if(points >= 70) {
            return 3;
        }

        if(points >= 60) {
            return 2;
        }

        if(points >= 50) {
            return 1;
        }

        return 0;
    }

    public double calculateAverage(ArrayList<Integer> list) {
        int sum = 0;
        int index = 0;

        while(index < list.size()) {
            sum += list.get(index);

            index++;
        }

        return (double) sum / list.size();
    }

    public double pointsAverage() {
        return calculateAverage(this.points);
    }

    public double passingPointsAverage() {
        return calculateAverage(this.passingPoints);
    }

    public double passingPercentage() {
        return (double) 100 * this.passingPoints.size() / this.points.size();
    }

    public int countGrade(int grade) {
        int counter = 0;

        for(int index = 0; index < this.grades.size(); index++) {
            if(this.grades.get(index) == grade) {
                counter++;
            }
        }

        return counter;
    }
}
