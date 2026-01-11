
public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for(int counter = 1; counter <= number; counter++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }

    public static void printSquare(int size) {
        for(int row = 1; row <= size; row++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for(int row = 1; row <= height; row++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for(int stars = 1; stars <= size; stars++) {
            printStars(stars);
        }
    }
}
