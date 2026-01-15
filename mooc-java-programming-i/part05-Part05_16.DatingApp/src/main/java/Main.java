
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2011); 
        System.out.println("Old " + date);
        date.advance(3); 
        System.out.println("New " + date);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + " weeks is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//
//            week = week + 1;
//        }
    }
}
