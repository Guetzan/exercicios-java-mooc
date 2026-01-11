
public class AdvancedAstrology {
    public static void printStars(int number) {
        for(int counter = 1; counter <= number; counter++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int counter = 1; counter <= number; counter++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int row = 1; row <= size; row++) {        
            if(row < size) {
                printSpaces(size - row);        
            }
            
            printStars(row);
        }
    }
    
    public static void christmasTree(int height) {
        for(int row = 1; row <= height; row++) {
            printSpaces(height - row);
            printStars(row + (row - 1));
        }
        
        for(int row = 1; row <= 2; row++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
