import java.util.Arrays;
import java.util.Random;

public class Sorts {

    // Defines the number of values that will be stored in the array.
    int values = 50;

    // Creates an array to hold 50 integers.
    int[] value = new int[values];

    // Creates a Random object to generate random numbers.
    Random rand = new Random();

    // Fills the array with random integers between 0 and 1000.
    public void initValues() {

        for (int index = 0; index < values; index++) {
            value[index] = rand.nextInt(1001);
        }
    }

    // Checks whether the array is sorted in ascending order.
    // Returns false if any value is greater than the value after it.
    // Returns true if the array is sorted.
    public boolean isSorted() {

        for (int index = 0; index < values - 1; index++) {

            if (value[index] > value[index + 1]) {
                return false;
            }
        }

        return true;
    }

    // Exchanges the values at two specified positions in an array.
    public static void swap(int[] array, int indexOne, int indexTwo) {

        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    // Displays the contents of the array.
    public void printValues() {
        System.out.println(Arrays.toString(value));
    }

    // Searches a specified section of an array for the index
    // containing the smallest value.
    // indexOne represents the beginning of the search range.
    // indexTwo represents the ending of the search range.
    public static int minIndex(int[] array, int indexOne, int indexTwo) {

        // Initially assumes the first position in the search range
        // contains the smallest value.
        int min = indexOne;

        // Examines each position within the specified search range.
        for (int i = indexOne; i <= indexTwo; i++) {
            if(array[i] < array[min] ){

                min = i;
            }

        }

        return min;
    }

    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i ++){

            int min = minIndex(array, i, array.length - 1);
            swap(array, i, min);
            
            
            

        }

    }

    public static void mergeSort(int[] array, int first, int last, int[] tempArray){
        if( first == last){
          return;
        }
           int middle = (first + last) / 2;
          mergeSort(array, first, middle, tempArray);
          mergeSort(array, middle +1, last, tempArray);

          int leftIndex = first;
          int rightIndex = middle + 1;
          int tempIndex = first;

          while(leftIndex <= middle && rightIndex <= last){
            if(array[leftIndex] <= array[rightIndex]) {
               tempArray[tempIndex] = array[leftIndex];
               leftIndex++;
               tempIndex++;
            
            }
            else{
                tempArray[tempIndex] = array[rightIndex];
                rightIndex++;
                tempIndex++;

            }

          }

          while(rightIndex <= last){
            tempArray[tempIndex] = array[rightIndex];
            rightIndex++;
            tempIndex++;

          }
          while(leftIndex <= middle){
            tempArray[tempIndex] = array[leftIndex];
            leftIndex++;
            tempIndex++;
          }

          for (int i = first; i <= last; i++){
            array[i] = tempArray[i];

          }
    }
}