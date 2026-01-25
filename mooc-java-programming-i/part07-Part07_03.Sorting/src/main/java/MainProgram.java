import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        
        Arrays.sort(numbers);
        sort(numbers);
    }
    
    public static int smallest(int[] arr) {
        int smallest = arr[0];
        int i = 0;
        
        while(i < arr.length) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            
            i++;
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] arr) {
        int smallestValue = smallest(arr);
        int i = 0;
        
        while(i < arr.length) {
            if(arr[i] == smallestValue) {
                break;
            }
            
            i++;
        }
        
        return i;
    }
    
    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int indexOfSmallest = startIndex;
        int i = startIndex;
        
        while(i < arr.length) {
            if(arr[i] < arr[indexOfSmallest]) {
                indexOfSmallest = i;
            }
            
            i++;
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    public static void sort(int[] arr) {
        int i = 0;
        
        while(i < arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            swap(arr, i, indexOfSmallestFrom(arr, i));
            i++;
        }
    }
}
