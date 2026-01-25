
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        
        while(index < books.size()) {
            if(books.get(index).getId() == searchedId) {
                return index;
            }
            
            index++;
        }
        
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int lowerBoundIndex = 0;
        int upperBoundIndex = books.size() - 1;

        while(lowerBoundIndex <= upperBoundIndex) {
            int middleIndex = (lowerBoundIndex + upperBoundIndex) / 2;

            if(searchedId == books.get(middleIndex).getId()) {
                return books.indexOf(books.get(middleIndex));
            }
            
            if(searchedId < books.get(middleIndex).getId()) {
                upperBoundIndex = middleIndex - 1;
            }
            
            if(searchedId > books.get(middleIndex).getId()) {
                lowerBoundIndex = middleIndex + 1;
            }
        }
        
        return -1;
    }
}

