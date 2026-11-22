

public class Main {
    public static void main(String[] args) {

    Sorts sort = new Sorts(10);
    sort.value = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        
       
        
       // sort.printValues();
       //System.out.println(sort.isSorted());

       long startTime = System.currentTimeMillis();
      sort.mergeSort(sort.value, 0, sort.value.length -1, new int[sort.value.length]);
        //sort.selectionSort(sort.value);
       long endTime = System.currentTimeMillis();

       long elapsedTime = endTime -startTime;
         //System.out.println("Selection Sort time: " + elapsedTime + " milliseconds");
         System.out.println("Merge Sort time: " + elapsedTime + " milliseconds");
         System.out.println("Sorted correctly: " + sort.isSorted());

}
}
    
