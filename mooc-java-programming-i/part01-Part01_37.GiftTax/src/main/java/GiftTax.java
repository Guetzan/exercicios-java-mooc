
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give gift value:");
        double giftValue = Integer.valueOf(scan.nextLine());
        double taxValue = 0;
        
        if(giftValue < 5000) {
            taxValue = 0;
        } else if (giftValue < 25000) {
            taxValue = ((giftValue - 5000) * 0.08) + 100;
        } else if (giftValue < 55000) {
            taxValue = ((giftValue - 25000) * 0.10) + 1700;
        } else if (giftValue < 200000) {
            taxValue = ((giftValue - 55000) * 0.12) + 4700;
        } else if (giftValue < 1000000) {
            taxValue = ((giftValue - 200000) * 0.15) + 22100;
        } else if (giftValue > 1000000) {
            taxValue = ((giftValue - 1000000) * 0.17) + 142100;
        } 

        if(taxValue > 0) {
            System.out.println("Tax: " + taxValue);
        } else {
            System.out.println("No Tax");
        }
    }
}
